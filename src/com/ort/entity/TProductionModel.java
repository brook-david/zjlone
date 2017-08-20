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
public class TProductionModel extends TailBean {
	
	private String modelId;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private Integer stock;	//库存
	private String color;	//颜色
	private String name;	//产品名称
	private String version;	//产品型号
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getModelId(){
		return  modelId;
	}
	public void setModelId(String modelId ){
		this.modelId = modelId;
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
	
	/**库存
	*@return 
	*/
	
	public Integer getStock(){
		return  stock;
	}
	/**库存
	*@param  stock
	*/
	public void setStock(Integer stock ){
		this.stock = stock;
	}
	
	/**颜色
	*@return 
	*/
	
	public String getColor(){
		return  color;
	}
	/**颜色
	*@param  color
	*/
	public void setColor(String color ){
		this.color = color;
	}
	
	/**产品名称
	*@return 
	*/
	
	public String getName(){
		return  name;
	}
	/**产品名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**产品型号
	*@return 
	*/
	
	public String getVersion(){
		return  version;
	}
	/**产品型号
	*@param  version
	*/
	public void setVersion(String version ){
		this.version = version;
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
		sb.append(modelId+",");
		sb.append(deleteFlag+",");
		sb.append(stock+",");
		sb.append(color+",");
		sb.append(name+",");
		sb.append(version+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
