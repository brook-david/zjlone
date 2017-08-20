package com.ort.frame.util.beetl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.JavaType;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.db.ColDesc;
import org.beetl.sql.core.db.MetadataManager;
import org.beetl.sql.core.db.TableDesc;
import org.beetl.sql.core.kit.GenKit;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.ext.gen.CodeGen;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.SourceGen;

public class MySourceGen {
	int pref = 1;//去除表前缀
	String sqlFilePref = GenKit.getJavaResourcePath()+File.separator+"../resources"+File.separator;
	
	MetadataManager mm;
	SQLManager sm ;
	String srcPath;
	public static String srcHead ="";
	public static String defaultPkg = "com.test";
	static String CR = System.getProperty("line.separator");
	/**
	 * 代码生成的Beetl的GroupTemplate，与BeetSQL 不同
	 */
	public static GroupTemplate gt = null;
	static {
		Configuration conf = null;
		try {
			conf = Configuration.defaultConfiguration();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conf.setStatementStart("@");
		conf.setStatementEnd(null);
		gt = new GroupTemplate(new StringTemplateResourceLoader(),conf);
		srcHead+="import java.math.*;"+CR;
		srcHead+="import java.util.Date;"+CR;
		
		srcHead+="import java.sql.Timestamp;"+CR;
		srcHead+="import org.beetl.sql.core.TailBean;"+CR;
		

		
	}
	
	public MySourceGen(SQLManager sm,String srcPath){
		this.mm = sm.getMetaDataManager();
		this.sm = sm;
		this.srcPath = srcPath;
	}
	
	public void genSqlTemplate(String table) throws IOException{
		String path = srcPath;
		if(sm.getSqlLoader() instanceof ClasspathLoader){
			path = ((ClasspathLoader)sm.getSqlLoader()).getSqlRoot();
		}
		String fileName = sm.getNc().getClassName(table);//StringKit.toLowerCaseFirstOne(table);
		String file = sqlFilePref+path;
		File f  = new File(file);
		f.mkdirs();
		File target = new File(file,fileName+".md");
		
		FileWriter writer = new FileWriter(target);
		
		String template = null;
		Configuration cf =sm.getBeetl().getGroupTemplate().getConf();
		
		String hs  = cf.getPlaceholderStart();
		String he = cf.getPlaceholderEnd();
		StringBuilder cols = new StringBuilder();
		String sql = "select "+hs+"use(\"cols\")"+he+ " from "+table+" where "+hs+"use(\"condition\")"+he;
		cols.append("sample").append("\n===\n").append("* 注释").append("\n\n\t").append( sql);
		cols.append("\n");
		
		String s = sm.getDbStyle().genColumnList(table);
		System.out.println(s);
		cols.append("\ncols").append("\n===\n").append("").append("\n\t").append( sm.getDbStyle().genColumnList(table));
		cols.append("\n");
		
		cols.append("\nupdateSample").append("\n===\n").append("").append("\n\t").append( sm.getDbStyle().genColAssignPropertyAbsolute(table));
		cols.append("\n");
		String condition = sm.getDbStyle().genCondition(table);
		condition = condition.replaceAll("\\n", "\n\t");
		cols.append("\ncondition").append("\n===\n").append("").append("\n\t").append(condition );
		cols.append("\n");
		writer.write(cols.toString());
		writer.flush();
		
		writer.close();
		System.out.println("gen \""+table +"\" success at "+target);
	}
	
}

