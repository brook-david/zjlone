package com.ort.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.ehcache.CacheKit;
import com.ort.dao.BlogDao;
import com.ort.dao.MenuDao;
import com.ort.dao.RolesDao;
import com.ort.dao.TMemberAttentionDao;
import com.ort.dao.TMemberDao;
import com.ort.entity.Blog;
import com.ort.entity.Menu;
import com.ort.entity.Roles;
import com.ort.entity.TMember;
import com.ort.entity.TMemberAttention;
import com.ort.entity.frame.CacheMember;
import com.ort.frame.interceptor.BlogInterceptor;
import com.ort.frame.listener.MemberCacheListener;
import com.ort.frame.util.BeetlUtil;
import com.ort.frame.util.CacheUtil;
import com.ort.frame.validator.BlogValidator;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheManagerEventListener;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogController
 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {
	public void index() {
		Map<String,Object> result = new HashMap<String, Object>();
//		PageQuery<Blog> blog = new PageQuery<Blog>();
//		JFinalBeetlSql.dao().getMapper(BlogDao.class).sample(blog);
		result.put("data", "blog");
		result.put("succefully", true);
		result.put("msg", "");
		result.put("code", 100);
		TMember member = new TMember();
		member.setAccount("sdawdd");
		BeetlUtil.getMapper(TMemberDao.class).queryByParams(member);
		Object o = CacheUtil.getMember("aaa");
		
		//TODO 测试
		Roles Roles = new Roles();
		Roles.setDescription("fewf");
		BeetlUtil.getMapper(RolesDao.class).queryByParams(Roles);
		
		if(o == null){
			CacheUtil.setMember("aaa", new CacheMember());
		}
		
		renderJson(result);
	}
	
}


