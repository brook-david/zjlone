package com.ort.service;

import java.util.Date;
import java.util.List;

import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.ort.dao.TMemberDao;
import com.ort.entity.TMember;
import com.ort.frame.util.BeetlUtil;
import com.ort.frame.util.ConstantUtil;
import com.ort.frame.util.ExcepUtil;
import com.ort.frame.util.MailUtil;
import com.ort.frame.util.RegexUtil;
import com.ort.frame.util.SMSUtil;

public class TouristService extends Service{
	
	/**
	 * 创建用户
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 * * 2017-14-25 zjl
	 */
	@Before(Tx.class)
	public boolean createMember(String account,String password) throws Exception{
		TMember member = new TMember();
		member.setAccount(account);
		member.setDeleteFlag(ConstantUtil.exist);
		//检查用户存在
		List<TMember> result = BeetlUtil.getMapper(TMemberDao.class).queryByParams(member);
		
		if(result.size() > 0){
			ExcepUtil.EX400(account);
		}
		
		member.setPassword(password);
		member.setCreateTime(new Date());
		int num = 0;
		
		//生成用户并发送提示信息
		if(RegexUtil.checkEmail(account)){
			member.setEmail(account);
			num = JFinalBeetlSql.dao().insertTemplate(member);
			MailUtil.sendRegisterSucceedInfo(account, account, password);
		}else{
			member.setPhoneNumber(account);
			num = BeetlUtil.getDao().insertTemplate(member);
			SMSUtil.sendRegisterSucceedInfo(account, account, password);
		}
		return num==1?true:false;
	}
	
	/**
	 * 登录
	 * @param account
	 * @param password
	 * @return
	 * * 2017-14-25 zjl
	 */
	public TMember getMemberByLogin(String account, String password){
		TMember param = new TMember();
		param.setAccount(account);
		param.setPassword(password);
		param.setDeleteFlag(ConstantUtil.exist);
		List<TMember> result = BeetlUtil.getMapper(TMemberDao.class).queryByParams(param);
		if(result.size() <= 0){
			ExcepUtil.EX302(account);
		}
		return result.get(0);
	}
	
	
}
