package com.ort.frame.util;

/**
 * 各种随机生成类
 * @author zjl
 *
 */
public class GenerateUtil {
	
	/**
	 * 生成随机6位数字
	 * @return
	 */
	public static String getRandNumTo6(){
		int randNum = 100000 + (int)(Math.random() * ((1000000 - 100000)));
	    return String.valueOf(randNum);
	}
	
	public static void main(String[] args) {
		System.out.println(getRandNumTo6());
	}
}
