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
public class UserRoles extends TailBean {
	
	private String createTime;	
	private String roleId;	
	private String userId;	
	
	@AssignID("uuid")
	public String getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(String createTime ){
		this.createTime = createTime;
	}
	
	
	public String getRoleId(){
		return  roleId;
	}
	public void setRoleId(String roleId ){
		this.roleId = roleId;
	}
	
	
	public String getUserId(){
		return  userId;
	}
	public void setUserId(String userId ){
		this.userId = userId;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(createTime+",");
		sb.append(roleId+",");
		sb.append(userId);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
