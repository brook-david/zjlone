package com.ort.entity;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.AssignID;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-04-24
*/
public class RolesPermissions extends TailBean {
	
	private Integer permissionId;	
	private Integer roleId;	
	private Date createTime;	
	
	@AssignID("uuid")
	public Integer getPermissionId(){
		return  permissionId;
	}
	public void setPermissionId(Integer permissionId ){
		this.permissionId = permissionId;
	}
	
	
	public Integer getRoleId(){
		return  roleId;
	}
	public void setRoleId(Integer roleId ){
		this.roleId = roleId;
	}
	
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(permissionId+",");
		sb.append(roleId+",");
		sb.append(createTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
