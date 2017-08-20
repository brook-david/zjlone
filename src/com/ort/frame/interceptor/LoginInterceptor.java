package com.ort.frame.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.jfinal.plugin.ehcache.CacheKit;
import com.ort.entity.frame.Result;
import com.ort.frame.util.CacheUtil;
import com.ort.frame.util.ExcepUtil;
import com.ort.frame.util.StringUtil;
import com.ort.frame.util.exception.MyException;

/**
 * 用户登录检验
 * 除登录注册等接口，对其他接口做自动登录操作
 */
public class LoginInterceptor implements Interceptor {
	
	private static Logger log = LoggerFactory.getLogger(LoginInterceptor.class);
	
	public void intercept(Invocation inv) {
		log.debug("Login status check...");
		
		Controller controller = inv.getController();
		String memberId = controller.getPara("memberId");
		if(StringUtil.isEmpty(memberId)){
			ExcepUtil.EX300("memberId");
		}
		
		Object member = CacheUtil.getMember(memberId);
		if(member == null){
			//TODO 自动登录
		}
		inv.invoke();
		log.debug("Login status check is ok");
	}
}
