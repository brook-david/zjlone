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
import org.beetl.sql.core.JavaType;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.ColDesc;
import org.beetl.sql.core.db.TableDesc;
import org.beetl.sql.core.kit.GenKit;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.ext.gen.CodeGen;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.SourceGen;

public class SqlMapperGen implements CodeGen {

	public static String srcHead ="sql";
	public static String srcPath = GenKit.getJavaResourcePath()+File.separator+"../resources"+File.separator;
	public static UnderlinedNameConversion nc = new UnderlinedNameConversion();
	String pkg = null;
    public SqlMapperGen(){

    }
    public SqlMapperGen(String pkg){
        this.pkg = pkg;
    }
    public static String mapperTemplate="";
    static {
        mapperTemplate = GenConfig.getTemplate("/template/mapperTemplate.btl");
    }

    @Override
    public void genCode(String entityPkg, String entityClass, TableDesc tableDesc,GenConfig config,boolean isDisplay) {
        Template template = SourceGen.gt.getTemplate(mapperTemplate);
        
        template.binding("cols", tableDesc.getCols().toArray());
        template.binding("package",pkg);
        template.binding("table", nc.getColName(entityClass));

        String mapperHead = "import "+entityPkg+".*;"+System.getProperty("line.separator");
        template.binding("imports", mapperHead);
        String mapperCode = template.render();
        if(isDisplay){
            System.out.println();
            System.out.println(mapperCode);
        }else{
            try {
            	String file = srcPath+srcHead;
				File f  = new File(file);
				f.mkdirs();
				File target = new File(file,StringKit.toLowerCaseFirstOne(entityClass)+".md");
				FileWriter writer = new FileWriter(target);
				writer.write(mapperCode);;
				writer.close();
				System.out.println(entityClass+"Sql生成");
            } catch (IOException e) {
                throw new RuntimeException("mapper代码生成失败",e);
            }
        }


    }

}
