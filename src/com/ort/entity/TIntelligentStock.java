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
public class TIntelligentStock extends TailBean {
	
	private String stockId;	
	private Integer deliveryNumber;	//出货批号
	private String batchNumber;	//生产批号
	private String mac;	
	private String modelId;	//产品类型
	private String productionAddress;	//生产地址
	private String productionDate;	//生产日期
	private String snCode;	//sn码
	private Date createTime;	
	
	@AssignID("uuid")
	public String getStockId(){
		return  stockId;
	}
	public void setStockId(String stockId ){
		this.stockId = stockId;
	}
	
	/**出货批号
	*@return 
	*/
	
	public Integer getDeliveryNumber(){
		return  deliveryNumber;
	}
	/**出货批号
	*@param  deliveryNumber
	*/
	public void setDeliveryNumber(Integer deliveryNumber ){
		this.deliveryNumber = deliveryNumber;
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
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(stockId+",");
		sb.append(deliveryNumber+",");
		sb.append(batchNumber+",");
		sb.append(mac+",");
		sb.append(modelId+",");
		sb.append(productionAddress+",");
		sb.append(productionDate+",");
		sb.append(snCode+",");
		sb.append(createTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
