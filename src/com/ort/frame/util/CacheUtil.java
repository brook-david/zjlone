package com.ort.frame.util;

import com.jfinal.plugin.ehcache.CacheKit;
import com.ort.entity.frame.CacheMember;

import net.sf.ehcache.Cache;

/**
 * 缓存工具类
 * @author zjl
 *
 */
public class CacheUtil {
	
	private static final String member = "member";
	private static final String captcha = "captcha";
	
	/**
	 * 创建用户缓存
	 * @param key
	 * @param value
	 */
	public static void setMember(String key, CacheMember value){
		CacheKit.put(member, key, value);
	}
	
	/**
	 * 获取用户缓存对象
	 * @param key
	 * @return
	 */
	public static CacheMember getMember(String key){
		return CacheKit.get(member, key);
	}
	
	/**
	 * 创建验证码
	 * @param key
	 * @param value
	 */
	public static void setCaptcha(String key, String value){
		CacheKit.put(captcha, key, value);
	}
	
	/**
	 * 获取验证码
	 * @param key
	 * @return
	 */
	public static String getCaptcha(String key){
		return CacheKit.get(captcha, key);
	}
	
	/**
	 * 获取用户缓存对象
	 * @return
	 */
	public static Cache getMemberCache(){
		return CacheKit.getCacheManager().getCache(member);
	}
	
	/**
	 * 获取验证码缓存对象
	 * @return
	 */
	public static Cache getCaptchaCache(){
		return CacheKit.getCacheManager().getCache(captcha);
	}
}
