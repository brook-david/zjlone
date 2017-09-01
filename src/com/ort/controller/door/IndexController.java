package com.ort.controller.door;

import com.ort.controller.MyController;
import com.ort.entity.frame.Result;
import com.ort.frame.util.CacheUtil;
import com.ort.frame.util.ExcepUtil;
import com.ort.frame.util.GenerateUtil;
import com.ort.frame.util.MailUtil;
import com.ort.frame.util.RegexUtil;
import com.ort.frame.util.SMSUtil;
import com.ort.frame.util.StringUtil;

/**
 * 工具控制层
 * 发送验证码、接收图片等
 * @author Administrator
 *
 */
public class IndexController extends MyController {
	
	public void index(){
		render("/index.html");
	}
	
}
