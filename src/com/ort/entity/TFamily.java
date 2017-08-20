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
public class TFamily extends TailBean {
	
	private String familyId;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private Integer familyCode;	//家庭码
	private String relationId;	
	private Date createTime;	//创建时间
	private Date updateTime;	//更新时间
	
	@AssignID("uuid")
	public String getFamilyId(){
		return  familyId;
	}
	public void setFamilyId(String familyId ){
		this.familyId = familyId;
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
	
	/**家庭码
	*@return 
	*/
	
	public Integer getFamilyCode(){
		return  familyCode;
	}
	/**家庭码
	*@param  familyCode
	*/
	public void setFamilyCode(Integer familyCode ){
		this.familyCode = familyCode;
	}
	
	
	public String getRelationId(){
		return  relationId;
	}
	public void setRelationId(String relationId ){
		this.relationId = relationId;
	}
	
	/**创建时间
	*@return 
	*/
	
	public Date getCreateTime(){
		return  createTime;
	}
	/**创建时间
	*@param  createTime
	*/
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	/**更新时间
	*@return 
	*/
	
	public Date getUpdateTime(){
		return  updateTime;
	}
	/**更新时间
	*@param  updateTime
	*/
	public void setUpdateTime(Date updateTime ){
		this.updateTime = updateTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(familyId+",");
		sb.append(deleteFlag+",");
		sb.append(familyCode+",");
		sb.append(relationId+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
