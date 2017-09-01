package com.ort.frame.util;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.IDAutoGen;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.SourceGen;
import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

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
		String[] param = {"menu","permissions","roles","roles_permissions","user_roles","users"};
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
//		ConnectionSource cs = ConnectionSourceHelper.getSimple(
//				prop.getProperty("dirver", "com.mysql.jdbc.Driver"), 
//				prop.getProperty("jdbcUrl"), 
//				prop.getProperty("user"), 
//				prop.getProperty("password"));
		ConnectionSource cs = ConnectionSourceHelper.getSimple(
				prop.getProperty("dirver", "org.sqlite.JDBC"), 
				prop.getProperty("jdbcUrl.sqlite"), 
				prop.getProperty("user"), 
				prop.getProperty("password"));
		SQLManager sqlManager = new SQLManager(new MySqlStyle(),SqlLocation,cs,new UnderlinedNameConversion(),new Interceptor[]{new DebugInterceptor()});
		sqlManager.addIdAutonGen("uuid", new IDAutoGen(){ 	//注册生成ID
			@Override
			public Object nextID(String params) {
				return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
			}
		});
		gen(sqlManager,table,entityLocation);
		
		//query(sqlManager);
//		insert(sqlManager);
//		delete(sqlManager);
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
