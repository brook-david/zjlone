package com.ort.frame.routes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.config.Routes;
import com.ort.controller.AssistController;
import com.ort.controller.BlogController;
import com.ort.controller.MemberController;

/**
 * 登录用户可访问的地址
 * @author Administrator
 *
 */
public class AdminRoutes extends Routes {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void config() {
		add("/member",MemberController.class);
		log.debug("AdminRoutes 加载完成");
	}

}
