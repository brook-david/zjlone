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
public class TBrand extends TailBean {
	
	private String id;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private String brandName;	//品牌名称
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getId(){
		return  id;
	}
	public void setId(String id ){
		this.id = id;
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
	
	/**品牌名称
	*@return 
	*/
	
	public String getBrandName(){
		return  brandName;
	}
	/**品牌名称
	*@param  brandName
	*/
	public void setBrandName(String brandName ){
		this.brandName = brandName;
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
		sb.append(id+",");
		sb.append(deleteFlag+",");
		sb.append(brandName+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
