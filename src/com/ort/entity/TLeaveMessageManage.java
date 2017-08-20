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
public class TLeaveMessageManage extends TailBean {
	
	private String lmId;	
	private Integer deleteFlag;	//删除  0:否 1:是
	private Integer lmReadFlag;	//读取  0:否 1:是
	private String intPenId;	
	private String lmContent;	
	private String lmFromMemberId;	//发送者ID
	private String lmTitle;	
	private Date lmReadTime;	
	private Date lmTime;	
	
	@AssignID("uuid")
	public String getLmId(){
		return  lmId;
	}
	public void setLmId(String lmId ){
		this.lmId = lmId;
	}
	
	/**删除  0:否 1:是
	*@return 
	*/
	
	public Integer getDeleteFlag(){
		return  deleteFlag;
	}
	/**删除  0:否 1:是
	*@param  deleteFlag
	*/
	public void setDeleteFlag(Integer deleteFlag ){
		this.deleteFlag = deleteFlag;
	}
	
	/**读取  0:否 1:是
	*@return 
	*/
	
	public Integer getLmReadFlag(){
		return  lmReadFlag;
	}
	/**读取  0:否 1:是
	*@param  lmReadFlag
	*/
	public void setLmReadFlag(Integer lmReadFlag ){
		this.lmReadFlag = lmReadFlag;
	}
	
	
	public String getIntPenId(){
		return  intPenId;
	}
	public void setIntPenId(String intPenId ){
		this.intPenId = intPenId;
	}
	
	
	public String getLmContent(){
		return  lmContent;
	}
	public void setLmContent(String lmContent ){
		this.lmContent = lmContent;
	}
	
	/**发送者ID
	*@return 
	*/
	
	public String getLmFromMemberId(){
		return  lmFromMemberId;
	}
	/**发送者ID
	*@param  lmFromMemberId
	*/
	public void setLmFromMemberId(String lmFromMemberId ){
		this.lmFromMemberId = lmFromMemberId;
	}
	
	
	public String getLmTitle(){
		return  lmTitle;
	}
	public void setLmTitle(String lmTitle ){
		this.lmTitle = lmTitle;
	}
	
	
	public Date getLmReadTime(){
		return  lmReadTime;
	}
	public void setLmReadTime(Date lmReadTime ){
		this.lmReadTime = lmReadTime;
	}
	
	
	public Date getLmTime(){
		return  lmTime;
	}
	public void setLmTime(Date lmTime ){
		this.lmTime = lmTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(lmId+",");
		sb.append(deleteFlag+",");
		sb.append(lmReadFlag+",");
		sb.append(intPenId+",");
		sb.append(lmContent+",");
		sb.append(lmFromMemberId+",");
		sb.append(lmTitle+",");
		sb.append(lmReadTime+",");
		sb.append(lmTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
