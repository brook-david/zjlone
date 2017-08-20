package com.ort.frame.util;

/**
 * 字符串工具类
 * @author zjl
 *
 */
public class StringUtil {
	
	/**
	 * 等于null或等于空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str == null || "".equals(str);
	}
	
	/**
	 * 不等于null并且不等于空
	 * @param str
	 * @return
	 */
	public static boolean notEmpty(String str){
		return str != null && !"".equals(str);
	}
}
