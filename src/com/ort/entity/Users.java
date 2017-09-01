package com.ort.entity;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.AssignID;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-08-31
*/
public class Users extends TailBean {
	
	private String id;	
	private Integer status;	
	private String createTime;	
	private String password;	
	private String username;	
	
	@AssignID("uuid")
	public String getId(){
		return  id;
	}
	public void setId(String id ){
		this.id = id;
	}
	
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	
	public String getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(String createTime ){
		this.createTime = createTime;
	}
	
	
	public String getPassword(){
		return  password;
	}
	public void setPassword(String password ){
		this.password = password;
	}
	
	
	public String getUsername(){
		return  username;
	}
	public void setUsername(String username ){
		this.username = username;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id+",");
		sb.append(status+",");
		sb.append(createTime+",");
		sb.append(password+",");
		sb.append(username);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
