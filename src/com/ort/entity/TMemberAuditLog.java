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
public class TMemberAuditLog extends TailBean {
	
	private String auditId;	
	private Integer loginStatus;	//登录状态 0:下线 1:上线
	private Integer logoutType;	//登出类型 0:用户退出 1:登录超时
	private String memberId;	//用户ID
	private Date loginTime;	//登录时间
	private Date logoutTime;	//登出时间
	
	@AssignID("uuid")
	public String getAuditId(){
		return  auditId;
	}
	public void setAuditId(String auditId ){
		this.auditId = auditId;
	}
	
	/**登录状态 0:下线 1:上线
	*@return 
	*/
	
	public Integer getLoginStatus(){
		return  loginStatus;
	}
	/**登录状态 0:下线 1:上线
	*@param  loginStatus
	*/
	public void setLoginStatus(Integer loginStatus ){
		this.loginStatus = loginStatus;
	}
	
	/**登出类型 0:用户退出 1:登录超时
	*@return 
	*/
	
	public Integer getLogoutType(){
		return  logoutType;
	}
	/**登出类型 0:用户退出 1:登录超时
	*@param  logoutType
	*/
	public void setLogoutType(Integer logoutType ){
		this.logoutType = logoutType;
	}
	
	/**用户ID
	*@return 
	*/
	
	public String getMemberId(){
		return  memberId;
	}
	/**用户ID
	*@param  memberId
	*/
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	/**登录时间
	*@return 
	*/
	
	public Date getLoginTime(){
		return  loginTime;
	}
	/**登录时间
	*@param  loginTime
	*/
	public void setLoginTime(Date loginTime ){
		this.loginTime = loginTime;
	}
	
	/**登出时间
	*@return 
	*/
	
	public Date getLogoutTime(){
		return  logoutTime;
	}
	/**登出时间
	*@param  logoutTime
	*/
	public void setLogoutTime(Date logoutTime ){
		this.logoutTime = logoutTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(auditId+",");
		sb.append(loginStatus+",");
		sb.append(logoutType+",");
		sb.append(memberId+",");
		sb.append(loginTime+",");
		sb.append(logoutTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
