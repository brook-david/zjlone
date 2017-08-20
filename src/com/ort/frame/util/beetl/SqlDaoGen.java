package com.ort.frame.util.beetl;

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
import org.beetl.sql.ext.gen.CodeGen;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.SourceGen;

public class SqlDaoGen implements CodeGen {
	
	String pkg = null;
    public SqlDaoGen(){

    }
    public SqlDaoGen(String pkg){
        this.pkg = pkg;
    }
    public static String mapperTemplate="";
    static {
        mapperTemplate = GenConfig.getTemplate("/template/daoTemplate.btl");
    }

    @Override
    public void genCode(String entityPkg, String entityClass, TableDesc tableDesc,GenConfig config,boolean isDisplay) {
    	pkg = entityPkg.substring(0,entityPkg.lastIndexOf("."))+".dao";
        Template template = SourceGen.gt.getTemplate(mapperTemplate);
        String mapperClass = entityClass+"Dao";
        template.binding("className", mapperClass);
        template.binding("package",pkg);
        template.binding("entityClass", entityClass);

        String mapperHead = "import "+entityPkg+".*;"+System.getProperty("line.separator");
        template.binding("imports", mapperHead);
        String mapperCode = template.render();
        if(isDisplay){
            System.out.println();
            System.out.println(mapperCode);
        }else{
            try {
                SourceGen.saveSourceFile(GenKit.getJavaSRCPath(), pkg, mapperClass, mapperCode);
            } catch (IOException e) {
                throw new RuntimeException("mapper代码生成失败",e);
            }
        }


    }
}
