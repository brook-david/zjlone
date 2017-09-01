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
public class RolesPermissions extends TailBean {
	
	private String createTime;	
	private String permissionId;	
	private String roleId;	
	
	@AssignID("uuid")
	public String getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(String createTime ){
		this.createTime = createTime;
	}
	
	
	public String getPermissionId(){
		return  permissionId;
	}
	public void setPermissionId(String permissionId ){
		this.permissionId = permissionId;
	}
	
	
	public String getRoleId(){
		return  roleId;
	}
	public void setRoleId(String roleId ){
		this.roleId = roleId;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(createTime+",");
		sb.append(permissionId+",");
		sb.append(roleId);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
