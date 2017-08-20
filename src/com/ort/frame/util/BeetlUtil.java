package com.ort.frame.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.IDAutoGen;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.KeyHolder;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.SourceGen;
import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

import com.jfinal.core.Controller;
import com.ort.dao.MenuDao;
import com.ort.dao.TMemberAttentionDao;
import com.ort.dao.TMemberDao;
import com.ort.entity.Menu;
import com.ort.entity.TMember;
import com.ort.entity.TMemberAttention;
import com.ort.frame.util.beetl.MySourceGen;
import com.ort.frame.util.beetl.SqlDaoGen;
import com.ort.frame.util.beetl.SqlMapperGen;
import com.ort.frame.util.beetl.UnderlinedNameConversionFn;

/**
 * beetlsql 工具类
 * 自动生成dao层与实体
 * @author zjl
 *
 */
public class BeetlUtil {
	
	private static String page = "com.ort.entity";
	private static SQLLoader mdLocation = new ClasspathLoader("/sql");
	private static String dbConfig = "/core-config.txt";
	private static String[] strs;
	
	static{
		String[] param = {"menu","permissions","roles","roles_permissions","t_agency","t_brand",
				"t_family","t_family_apply_record","t_family_member_relation","t_intelligent_pen",
				"t_intelligent_pen_constant","t_intelligent_stock","t_leave_message_manage","t_mast_val",
				"t_master","t_member","t_member_attention","t_member_audit_log","t_member_pen_ag",
				"t_member_pen_relation","t_opi_feedback_manage","t_production_model","t_return_pen_record",
				"t_sales","t_sales_return","user_roles","users"};
//		param = new String[]{"menu"};
		strs = param;
	}
	
	public static void main(String[] args) throws Exception {
		try {
			genEntityAndSqlByTableNames(strs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void genEntityAndSqlByTableNames(String[] strs) throws Exception{
		for(String str:strs){
			genEntityAndSqlByTableName(page,mdLocation,dbConfig,str);
		}
	}
	
	private static void genEntityAndSqlByTableName(
			String entityLocation,
			SQLLoader SqlLocation,
			String dbConfig,
			String table
			) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream(BeetlUtil.class.getResource(dbConfig).getFile()));
		ConnectionSource cs = ConnectionSourceHelper.getSimple(
				prop.getProperty("dirver", "com.mysql.jdbc.Driver"), 
				prop.getProperty("jdbcUrl"), 
				prop.getProperty("user"), 
				prop.getProperty("password"));
		SQLManager sqlManager = new SQLManager(new MySqlStyle(),SqlLocation,cs,new UnderlinedNameConversion(),new Interceptor[]{new DebugInterceptor()});
		sqlManager.addIdAutonGen("uuid", new IDAutoGen(){ 	//注册生成ID
			@Override
			public Object nextID(String params) {
				return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
			}
		});
//		gen(sqlManager,table,entityLocation);
		
		query(sqlManager);
//		insert(sqlManager);
//		delete(sqlManager);
	}
	
	private static void query(SQLManager sqlm){
		TMember param = new TMember();
		param.setAccount("aaaaa1");
		param.setMemberId("adawd1");
		List<TMember> lm = sqlm.getMapper(TMemberDao.class).queryByParams(param);
		Menu TMemberAttention = new Menu();
		TMemberAttention.setFid("fwefwe");
		sqlm.getMapper(MenuDao.class).queryByParams(TMemberAttention);
		System.out.println(lm);
	}
	
	private static void insert(SQLManager sqlm){
		TMember param = new TMember();
		param.setAccount("aaaaa1");
		param.setMemberId("adawd2");
		KeyHolder kh = new KeyHolder();
		int lm = sqlm.insertTemplate(param);
		System.out.println(lm+":"+kh.getKey()+":"+param.getMemberId());
	}
	
	private static void delete(SQLManager sqlm){
		int lm = sqlm.deleteById(TMember.class, "090812FF797843189A7DCDE0999AF56E");
		System.out.println(lm);
	}
	
	private static void gen(SQLManager sqlManager,String table,String entityLocation) throws Exception{
		
		GenConfig config = new GenConfig();
		config.preferBigDecimal(true);
		config.initTemplate("/template/entityTemplate.btl");
		config.codeGens.add(new SqlMapperGen());
		config.codeGens.add(new SqlDaoGen());	//mapper生成
		config.setBaseClass("TailBean");
		SourceGen.gt.registerFunction("NC",new UnderlinedNameConversionFn());
		// 或者直接生成java文件
		sqlManager.genPojoCode(table, entityLocation, config); //原生
		System.out.println("生成成功："+table);
	}
	
	
	
	
	
	
	
	/**
	 * 获取数据源
	 * @return
	 */
	public static SQLManager getDao(){
		return JFinalBeetlSql.dao();
	}
	
	/**
	 * 获取数据源模版
	 * @return 
	 * @return
	 */
	public static <T> T getMapper(Class<T> mapperInterface){
		return getDao().getMapper(mapperInterface);
	}
	
	/**
	 * 生成实体类
	 * @param classN
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public static <T> T getParams(Class<T> classN,Map<String, String[]> map) throws Exception{
		Field[] fields = classN.getDeclaredFields();
		System.out.println(classN.getName());
		T t = classN.newInstance();
		
		for(Field field:fields){
			classN.getMethod("set"+StringKit.toUpperCaseFirstOne(field.getName()),field.getType()).invoke(t,map.get(field.getName()));
		}
		return t;
	}
	
}
