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
public class TMastVal extends TailBean {
	
	private String valId;	
	private Integer deleteFlag;	//删除  0:否 1:是
	private Integer valValue;	
	private String mastId;	
	private String remark;	//备注
	private String valCode;	
	private String valName;	
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getValId(){
		return  valId;
	}
	public void setValId(String valId ){
		this.valId = valId;
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
	
	
	public Integer getValValue(){
		return  valValue;
	}
	public void setValValue(Integer valValue ){
		this.valValue = valValue;
	}
	
	
	public String getMastId(){
		return  mastId;
	}
	public void setMastId(String mastId ){
		this.mastId = mastId;
	}
	
	/**备注
	*@return 
	*/
	
	public String getRemark(){
		return  remark;
	}
	/**备注
	*@param  remark
	*/
	public void setRemark(String remark ){
		this.remark = remark;
	}
	
	
	public String getValCode(){
		return  valCode;
	}
	public void setValCode(String valCode ){
		this.valCode = valCode;
	}
	
	
	public String getValName(){
		return  valName;
	}
	public void setValName(String valName ){
		this.valName = valName;
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
		sb.append(valId+",");
		sb.append(deleteFlag+",");
		sb.append(valValue+",");
		sb.append(mastId+",");
		sb.append(remark+",");
		sb.append(valCode+",");
		sb.append(valName+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
