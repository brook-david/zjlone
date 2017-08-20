package com.ort.entity;
import java.util.Date;

import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.AssignID;

/*
* 
* gen by beetlsql 2017-04-24
*/
public class TMember extends TailBean {
	
	private String memberId;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private String account;	//账号
	private String accountIdentity;	//昵称
	private String attentionRelationId;	//关注的笔
	private String avatarPath;	//头像
	private String email;	//邮箱
	private String password;	//密码
	private String phoneNumber;	//手机号
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getMemberId(){
		return  memberId;
	}
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	/**删除 0:否 1:是
	*@return 
	*/
	
	public Integer getDeleteFlag(){
		return  deleteFlag;
	}
	/**删除 0:否 1:是
	*@param  deleteFlag
	*/
	public void setDeleteFlag(Integer deleteFlag ){
		this.deleteFlag = deleteFlag;
	}
	
	/**账号
	*@return 
	*/
	
	public String getAccount(){
		return  account;
	}
	/**账号
	*@param  account
	*/
	public void setAccount(String account ){
		this.account = account;
	}
	
	/**昵称
	*@return 
	*/
	
	public String getAccountIdentity(){
		return  accountIdentity;
	}
	/**昵称
	*@param  accountIdentity
	*/
	public void setAccountIdentity(String accountIdentity ){
		this.accountIdentity = accountIdentity;
	}
	
	/**关注的笔
	*@return 
	*/
	
	public String getAttentionRelationId(){
		return  attentionRelationId;
	}
	/**关注的笔
	*@param  attentionRelationId
	*/
	public void setAttentionRelationId(String attentionRelationId ){
		this.attentionRelationId = attentionRelationId;
	}
	
	/**头像
	*@return 
	*/
	
	public String getAvatarPath(){
		return  avatarPath;
	}
	/**头像
	*@param  avatarPath
	*/
	public void setAvatarPath(String avatarPath ){
		this.avatarPath = avatarPath;
	}
	
	/**邮箱
	*@return 
	*/
	
	public String getEmail(){
		return  email;
	}
	/**邮箱
	*@param  email
	*/
	public void setEmail(String email ){
		this.email = email;
	}
	
	/**密码
	*@return 
	*/
	
	public String getPassword(){
		return  password;
	}
	/**密码
	*@param  password
	*/
	public void setPassword(String password ){
		this.password = password;
	}
	
	/**手机号
	*@return 
	*/
	
	public String getPhoneNumber(){
		return  phoneNumber;
	}
	/**手机号
	*@param  phoneNumber
	*/
	public void setPhoneNumber(String phoneNumber ){
		this.phoneNumber = phoneNumber;
	}
	
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	
	public Date getUpdateTime(){
		return  updateTime;
	}
	public void setUpdateTime(Date updateTime ){
		this.updateTime = updateTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(memberId+",");
		sb.append(deleteFlag+",");
		sb.append(account+",");
		sb.append(accountIdentity+",");
		sb.append(attentionRelationId+",");
		sb.append(avatarPath+",");
		sb.append(email+",");
		sb.append(password+",");
		sb.append(phoneNumber+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
