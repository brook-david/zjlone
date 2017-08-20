package com.ort.frame.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 常量工具类
 * 常量文件：constant.properties
 * @author zjl
 *
 */
public class ConstantUtil {
	
	
	/*** 存在*/
	public static final int exist = 0;
	/*** 不存在*/
	public static final int inexistence = 1;
	//邮箱常量
	public static String emailAccount;
	public static String emailPassword;
	public static String sendName;
	public static String emailSMTPHost;
	public static String register;
	public static String captcha;
	public static String findPassword;
	
	//短信常量
	public static String ACCOUNT;
	public static String PASSWORD;
	public static String SMS_URL;
	//信息模版
	public static String templateSymbol;
	public static String captchaTemplate;
	public static String registerTemplate;
	
	static {
		InputStream in = null;
		try {
			in = ConstantUtil.class.getClassLoader().getResourceAsStream(
					"constant.properties");
			Properties p = new Properties();
			p.load(in);
			in.close();
			
			emailAccount = p.getProperty("emailAccount");
			emailPassword = p.getProperty("emailPassword");
			sendName = p.getProperty("sendName");
			emailSMTPHost = p.getProperty("emailSMTPHost");
			register = p.getProperty("title_register");
			captcha = p.getProperty("title_captcha");
			findPassword = p.getProperty("title_findPassword");
			
			ACCOUNT = p.getProperty("ACCOUNT");
			PASSWORD = p.getProperty("PASSWORD");
			SMS_URL = p.getProperty("SMS_URL");
			
			templateSymbol = p.getProperty("templateSymbol");
			captchaTemplate = p.getProperty("captchaTemplate");
			registerTemplate = p.getProperty("registerTemplate");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		System.out.println(SMS_URL);
	}
	
}
