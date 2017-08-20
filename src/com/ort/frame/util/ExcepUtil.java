package com.ort.frame.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ort.frame.util.exception.MyException;

/**
 * 异常工具类
 * @author zjl
 *
 */
public class ExcepUtil{
	
	private static String[] errorCode;
	private static String[] errorMsg;
	private static Map<String,String> errorMap;
	
	static{
		errorCode = new String[]{"300","301","302","304","400","500"};
		errorMsg = new String[]{
				"Missing paramter is ",
				"Paramter type error of ",
				"The paramter is inexistence of ",
				"The sign is error",
				"The data existing ",
				"The service is error :"};
		errorMap = new HashMap<String, String>();
		
		for(int i=0; i<errorCode.length; i++){
			errorMap.put(errorMsg[i], errorCode[i]);
		}
	}
	
	/**
	 * 缺少对应参数（为null或空）
	 * @param paramName
	 */
	public static void EX300(String paramName){
		throw new MyException("Missing paramter is "+paramName);
	}
	
	/**
	 * 参数类型错误
	 * @param paramName
	 */
	public static void EX301(String paramName){
		throw new MyException("Paramter type error of "+paramName);
	}
	
	/**
	 * 没有对应数据
	 * @param paramName
	 */
	public static void EX302(String paramName){
		throw new MyException("The paramter is inexistence of "+paramName);
	}
	
	/**
	 * 签名错误
	 * @param paramName
	 */
	public static void EX304(){
		throw new MyException("The sign is error");
	}
	
	/**
	 * 数据已存在
	 * @param paramName
	 */
	public static void EX400(String paramName){
		throw new MyException("The data existing "+paramName);
	}
	
	/**
	 * 服务器错误
	 * @param paramName
	 */
	public static void EX500(String msg){
		throw new MyException("The service is error :"+msg);
	}
	
	/**
	 * 返回错误码
	 * @param paramName
	 */
	public static String getErrorCode(String msg){
		String data = "";
		for(int i=0; i<errorCode.length; i++){
			if(msg.endsWith(errorCode[i])){
				return errorCode[i];
			}else if(msg.startsWith(errorMsg[i])){
				data = errorMsg[i];
				break;
			}
		}
		
		return errorMap.get(data);
	}
}
