package com.ort.frame.core;

import java.util.UUID;

import javax.sql.DataSource;

import org.beetl.sql.core.IDAutoGen;
import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

import com.alibaba.druid.pool.DruidDataSource;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.ehcache.EhCachePlugin;
import com.jfinal.template.Engine;
import com.ort.frame.interceptor.LoginInterceptor;
import com.ort.frame.interceptor.SignInterceptor;
import com.ort.frame.routes.AdminRoutes;
import com.ort.frame.routes.TouristRoutes;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * API引导式配置
 */
public class JfinalConfig extends JFinalConfig {
	
	/**
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 * 
	 * 使用本方法启动过第一次以后，会在开发工具的 debug、run config 中自动生成
	 * 一条启动配置，可对该自动生成的配置再添加额外的配置项，例如 VM argument 可配置为：
	 * -XX:PermSize=64M -XX:MaxPermSize=256M
	 */
	public static void main(String[] args) {
		/**
		 * 特别注意：Eclipse 之下建议的启动方式
		 */
		//JFinal.start("WebRoot", 80, "/", 5);

		/**
		 * 特别注意：IDEA 之下建议的启动方式，仅比 eclipse 之下少了最后一个参数
		 */
		// JFinal.start("WebRoot", 80, "/");
	}
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		// 加载少量必要配置，随后可用PropKit.get(...)获取值
		PropKit.use("core-config.txt");
		me.setDevMode(PropKit.getBoolean("devMode", false));
		me.setReportAfterInvocation(false);
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		
		AdminRoutes adminRoutes =new AdminRoutes();
		TouristRoutes touristRoutes = new TouristRoutes();
		adminRoutes.addInterceptor(new LoginInterceptor()); //路由级的拦截器
		me.add(adminRoutes);
		me.add(touristRoutes);
//		me.add(new AutoRoutes("com.ort.controller"));
	}
	
	public void configEngine(Engine me) {
	}
	
	public static DruidDataSource createDruidDataSource() {
		DruidDataSource dds = new DruidDataSource();
		dds.setUrl(PropKit.get("jdbcUrl"));
		dds.setUsername(PropKit.get("user"));
		dds.setPassword(PropKit.get("password").trim());
		return dds;
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
		// 缓存插件
		me.add(new EhCachePlugin());
		
		JFinalBeetlSql.init(createDruidDataSource(),new DataSource[0]);
		JFinalBeetlSql.dao().addIdAutonGen("uuid", new IDAutoGen(){ 	//注册生成ID
			@Override
			public Object nextID(String params) {
				return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
			}
		});
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		me.add(new SignInterceptor());	//最高级拦截器
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		
	}
	
}
