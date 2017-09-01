package com.ort.controller;

import com.jfinal.core.Controller;
import com.ort.frame.util.BeetlUtil;

public class MyController extends Controller {

	/**
	 * 根据param生成实体类
	 * @param classN
	 * @return
	 */
	protected <T> T getEntity(Class<T> classN){
		T t = null;
		try {
			t =  BeetlUtil.getParams(classN, this.getParaMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	
}
