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
public class Users extends TailBean {
	
	private Integer id;	
	private String username;	
	private Integer status;	//0未激活   1激活   2注销
	private String password;	
	private Date createTime;	
	
	@AssignID("uuid")
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	
	public String getUsername(){
		return  username;
	}
	public void setUsername(String username ){
		this.username = username;
	}
	
	/**0未激活   1激活   2注销
	*@return 
	*/
	
	public Integer getStatus(){
		return  status;
	}
	/**0未激活   1激活   2注销
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	
	public String getPassword(){
		return  password;
	}
	public void setPassword(String password ){
		this.password = password;
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
		sb.append(id+",");
		sb.append(username+",");
		sb.append(status+",");
		sb.append(password+",");
		sb.append(createTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
