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
public class Permissions extends TailBean {
	
	private String id;	
	private String createTime;	
	private String description;	
	private String permission;	
	
	@AssignID("uuid")
	public String getId(){
		return  id;
	}
	public void setId(String id ){
		this.id = id;
	}
	
	
	public String getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(String createTime ){
		this.createTime = createTime;
	}
	
	
	public String getDescription(){
		return  description;
	}
	public void setDescription(String description ){
		this.description = description;
	}
	
	
	public String getPermission(){
		return  permission;
	}
	public void setPermission(String permission ){
		this.permission = permission;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id+",");
		sb.append(createTime+",");
		sb.append(description+",");
		sb.append(permission);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
