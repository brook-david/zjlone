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
public class TMaster extends TailBean {
	
	private String mastId;	
	private Integer deleteFlag;	//删除  0:否 1:是
	private String mastCode;	
	private String mastName;	
	private String remarks;	
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getMastId(){
		return  mastId;
	}
	public void setMastId(String mastId ){
		this.mastId = mastId;
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
	
	
	public String getMastCode(){
		return  mastCode;
	}
	public void setMastCode(String mastCode ){
		this.mastCode = mastCode;
	}
	
	
	public String getMastName(){
		return  mastName;
	}
	public void setMastName(String mastName ){
		this.mastName = mastName;
	}
	
	
	public String getRemarks(){
		return  remarks;
	}
	public void setRemarks(String remarks ){
		this.remarks = remarks;
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
		sb.append(mastId+",");
		sb.append(deleteFlag+",");
		sb.append(mastCode+",");
		sb.append(mastName+",");
		sb.append(remarks+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
