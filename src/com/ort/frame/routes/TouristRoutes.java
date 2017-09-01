package com.ort.frame.routes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.config.Routes;
import com.ort.controller.AssistController;
import com.ort.controller.BlogController;
import com.ort.controller.door.IndexController;

/**
 * 所有用户（包括游客）可访问的地址
 * @author Administrator
 *
 */
public class TouristRoutes  extends Routes {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void config() {
		this.add("/assist", AssistController.class);
//		this.add("/tourist", TouristController.class);
		this.add("/blog", BlogController.class);
		this.add("/index", IndexController.class);
		log.debug("TouristRoutes 加载完成");
	}

}
