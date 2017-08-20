package com.ort.controller;

import com.ort.entity.TMember;
import com.ort.entity.frame.Result;
import com.ort.frame.util.CacheUtil;
import com.ort.frame.util.ExcepUtil;
import com.ort.frame.util.RegexUtil;
import com.ort.frame.util.StringUtil;
import com.ort.service.TouristService;

public class TouristController extends MyController {
	
	private static final TouristService touristService = new TouristService();
	
	/**
	 * 新用户注册
	 * @param account 	账号
	 * @param password 	密码
	 * @param vCode 	验证码
	 * @throws Exception 
	 * 2017-14-25 zjl
	 */
	public void register() throws Exception{
		
		String account = getPara("account");
		String password = getPara("password");
		String vCode = getPara("vCode");
		
		if(StringUtil.isEmpty(account)){
			ExcepUtil.EX300("account");
		}
		if(!RegexUtil.checkPhone(account)&&!RegexUtil.checkEmail(account)){
			ExcepUtil.EX301("account");
		}
		if(StringUtil.isEmpty(vCode)){
			ExcepUtil.EX300("vCode");
		}
		if(StringUtil.isEmpty(password)){
			password = "123456";
		}
		
		//验证验证码
		String captcha = CacheUtil.getCaptcha(account);
		if(!vCode.equals(captcha)){
			ExcepUtil.EX302("vCode");
		}
		
		//创建新用户
		boolean flag = touristService.createMember(account, password);
		if(!flag){
			ExcepUtil.EX500("插入失败");
		}
		Result result = new Result();
		renderJson(result);
	}
	
	/**
	 * 用户登录
	 * @param account
	 * @param password
	 * @return
	 * * 2017-14-25 zjl
	 */
	public void memberLogin(){
		
		String account = getPara("account");
		String password = getPara("password");
		
		if(StringUtil.isEmpty(account)){
			ExcepUtil.EX300("account");
		}
		if(StringUtil.isEmpty(password)){
			ExcepUtil.EX300("password");
		}
		
		TMember member = touristService.getMemberByLogin(account, password);
		Result result = new Result(member);
		renderJson(result);
	}
	
	
	
	
}
