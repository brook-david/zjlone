package com.ort.frame.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogInterceptor
 * 此拦截器仅做为示例展示，在本 demo 中并不需要
 */
public class BlogInterceptor implements Interceptor {
	
	private static Logger log = LoggerFactory.getLogger(BlogInterceptor.class);
	
	public void intercept(Invocation inv) {
		log.debug("Before invoking " + inv.getActionKey());
		inv.invoke();
		log.debug("After invoking " + inv.getActionKey());
	}
}
