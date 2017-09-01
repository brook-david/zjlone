package com.ort.controller;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.ort.dao.RolesDao;
import com.ort.entity.Roles;
import com.ort.entity.frame.CacheMember;
import com.ort.frame.interceptor.BlogInterceptor;
import com.ort.frame.util.BeetlUtil;
import com.ort.frame.util.CacheUtil;

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
		Roles roles = new Roles();
		roles.setRoleName("庄家利");;
		BeetlUtil.getMapper(RolesDao.class).
		insert(roles);
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


