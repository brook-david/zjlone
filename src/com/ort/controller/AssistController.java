package com.ort.controller;

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
public class AssistController extends MyController {
	
	/**
	 * 发送验证码
	 * @param name	手机号或邮箱等
	 * @throws Exception 
	 * 2017-04-24 zjl
	 */
	public void sendCaptcha() throws Exception{
		String name = getPara("name");
		
		if(StringUtil.isEmpty(name)){
			ExcepUtil.EX300("name");
		}
		
		Result result = new Result();
		String randNum = GenerateUtil.getRandNumTo6();
		//手机
		if(RegexUtil.checkMobile(name)){
			
			SMSUtil.sendCaptcha(name,String.valueOf(randNum));
			
		}else if(RegexUtil.checkEmail(name)){	//邮箱
			
			MailUtil.sendCaptcha(name, String.valueOf(randNum));
			
		}else{	//异常
			ExcepUtil.EX301("name");
		}
		
		CacheUtil.setCaptcha(name, randNum);
		renderJson(result);
	}
	
	/**
	 * 验证验证码
	 * @param name	手机号或邮箱等
	 * @param captcha	验证码
	 * 2017-04-24 zjl
	 */
	public void checkCaptcha(){
		String name = getPara("name");
		String captcha = getPara("captcha");
		if(StringUtil.isEmpty(name)){
			ExcepUtil.EX300("name");
		}
		if(StringUtil.isEmpty(captcha)){
			ExcepUtil.EX300("captcha");
		}
		if(!RegexUtil.checkDigit(captcha)){
			ExcepUtil.EX301("captcha");
		}
		Result result = new Result();
		if(captcha.equals(CacheUtil.getCaptcha(name))){
			result.setData(true);
		}else{
			result.setData(false);
		}
		
		renderJson(result);
	}
	
}
