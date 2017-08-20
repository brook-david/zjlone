package com.ort.entity.frame;

import java.io.Serializable;

public class Result implements Serializable{
	private String code;
	private String msg;
	private Object data;
	
	public Result(){
		code = "200";
		msg = "is ok";
		data = null;
	}
	
	public Result(Object data){
		this();
		this.data = data;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
