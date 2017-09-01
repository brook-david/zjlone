//package com.ort.service;
//
//import java.util.Date;
//import java.util.List;
//
//import org.beetl.sql.core.ClasspathLoader;
//import org.beetl.sql.ext.jfinal.JFinalBeetlSql;
//
//import com.jfinal.aop.Before;
//import com.jfinal.plugin.activerecord.tx.Tx;
//import com.ort.dao.TMemberDao;
//import com.ort.entity.TMember;
//import com.ort.frame.util.BeetlUtil;
//import com.ort.frame.util.ExcepUtil;
//import com.ort.frame.util.MailUtil;
//import com.ort.frame.util.RegexUtil;
//import com.ort.frame.util.SMSUtil;
//
//public class MemberService extends Service{
//	
//	/**
//	 * 根据id更新用户信息
//	 * @param member
//	 * @return
//	 */
//	@Before(Tx.class)
//	public int updateMember(TMember member){
//		int num = BeetlUtil.getDao().updateTemplateById(member);
//		return num;
//	}
//	
//}
