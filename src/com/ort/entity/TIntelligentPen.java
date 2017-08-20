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
public class TIntelligentPen extends TailBean {
	
	private String intPenId;	
	private Integer authentication;	//是否被认证  0:否 1:是
	private Integer deliveryNumber;	//出售批号
	private Integer status;	//状态 0:停用 1:启用
	private String agencyId;	//经销商ID
	private String batchNumber;	//生产批号
	private String mac;	
	private String modelId;	//产品类型
	private String productionAddress;	//生产地址
	private String productionDate;	//生产日期
	private String snCode;	//sn码
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getIntPenId(){
		return  intPenId;
	}
	public void setIntPenId(String intPenId ){
		this.intPenId = intPenId;
	}
	
	/**是否被认证  0:否 1:是
	*@return 
	*/
	
	public Integer getAuthentication(){
		return  authentication;
	}
	/**是否被认证  0:否 1:是
	*@param  authentication
	*/
	public void setAuthentication(Integer authentication ){
		this.authentication = authentication;
	}
	
	/**出售批号
	*@return 
	*/
	
	public Integer getDeliveryNumber(){
		return  deliveryNumber;
	}
	/**出售批号
	*@param  deliveryNumber
	*/
	public void setDeliveryNumber(Integer deliveryNumber ){
		this.deliveryNumber = deliveryNumber;
	}
	
	/**状态 0:停用 1:启用
	*@return 
	*/
	
	public Integer getStatus(){
		return  status;
	}
	/**状态 0:停用 1:启用
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**经销商ID
	*@return 
	*/
	
	public String getAgencyId(){
		return  agencyId;
	}
	/**经销商ID
	*@param  agencyId
	*/
	public void setAgencyId(String agencyId ){
		this.agencyId = agencyId;
	}
	
	/**生产批号
	*@return 
	*/
	
	public String getBatchNumber(){
		return  batchNumber;
	}
	/**生产批号
	*@param  batchNumber
	*/
	public void setBatchNumber(String batchNumber ){
		this.batchNumber = batchNumber;
	}
	
	
	public String getMac(){
		return  mac;
	}
	public void setMac(String mac ){
		this.mac = mac;
	}
	
	/**产品类型
	*@return 
	*/
	
	public String getModelId(){
		return  modelId;
	}
	/**产品类型
	*@param  modelId
	*/
	public void setModelId(String modelId ){
		this.modelId = modelId;
	}
	
	/**生产地址
	*@return 
	*/
	
	public String getProductionAddress(){
		return  productionAddress;
	}
	/**生产地址
	*@param  productionAddress
	*/
	public void setProductionAddress(String productionAddress ){
		this.productionAddress = productionAddress;
	}
	
	/**生产日期
	*@return 
	*/
	
	public String getProductionDate(){
		return  productionDate;
	}
	/**生产日期
	*@param  productionDate
	*/
	public void setProductionDate(String productionDate ){
		this.productionDate = productionDate;
	}
	
	/**sn码
	*@return 
	*/
	
	public String getSnCode(){
		return  snCode;
	}
	/**sn码
	*@param  snCode
	*/
	public void setSnCode(String snCode ){
		this.snCode = snCode;
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
		sb.append(intPenId+",");
		sb.append(authentication+",");
		sb.append(deliveryNumber+",");
		sb.append(status+",");
		sb.append(agencyId+",");
		sb.append(batchNumber+",");
		sb.append(mac+",");
		sb.append(modelId+",");
		sb.append(productionAddress+",");
		sb.append(productionDate+",");
		sb.append(snCode+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
