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
public class TSales extends TailBean {
	
	private String salesId;	
	private Integer deliveryNumber;	//出售批号
	private Integer number;	//出货数量
	private Integer price;	//出货单价
	private String address;	//详细地址
	private String agencyId;	//经销商ID
	private String area;	//区
	private String city;	//市
	private String consignee;	//收货人
	private String consigneePhone;	//收货人手机号
	private String province;	//省
	private String remark;	//备注
	private Date createTime;	
	private Date sendTime;	//发货时间
	private Date takeTime;	//收货时间
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getSalesId(){
		return  salesId;
	}
	public void setSalesId(String salesId ){
		this.salesId = salesId;
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
	
	/**出货数量
	*@return 
	*/
	
	public Integer getNumber(){
		return  number;
	}
	/**出货数量
	*@param  number
	*/
	public void setNumber(Integer number ){
		this.number = number;
	}
	
	/**出货单价
	*@return 
	*/
	
	public Integer getPrice(){
		return  price;
	}
	/**出货单价
	*@param  price
	*/
	public void setPrice(Integer price ){
		this.price = price;
	}
	
	/**详细地址
	*@return 
	*/
	
	public String getAddress(){
		return  address;
	}
	/**详细地址
	*@param  address
	*/
	public void setAddress(String address ){
		this.address = address;
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
	
	/**区
	*@return 
	*/
	
	public String getArea(){
		return  area;
	}
	/**区
	*@param  area
	*/
	public void setArea(String area ){
		this.area = area;
	}
	
	/**市
	*@return 
	*/
	
	public String getCity(){
		return  city;
	}
	/**市
	*@param  city
	*/
	public void setCity(String city ){
		this.city = city;
	}
	
	/**收货人
	*@return 
	*/
	
	public String getConsignee(){
		return  consignee;
	}
	/**收货人
	*@param  consignee
	*/
	public void setConsignee(String consignee ){
		this.consignee = consignee;
	}
	
	/**收货人手机号
	*@return 
	*/
	
	public String getConsigneePhone(){
		return  consigneePhone;
	}
	/**收货人手机号
	*@param  consigneePhone
	*/
	public void setConsigneePhone(String consigneePhone ){
		this.consigneePhone = consigneePhone;
	}
	
	/**省
	*@return 
	*/
	
	public String getProvince(){
		return  province;
	}
	/**省
	*@param  province
	*/
	public void setProvince(String province ){
		this.province = province;
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
	
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	/**发货时间
	*@return 
	*/
	
	public Date getSendTime(){
		return  sendTime;
	}
	/**发货时间
	*@param  sendTime
	*/
	public void setSendTime(Date sendTime ){
		this.sendTime = sendTime;
	}
	
	/**收货时间
	*@return 
	*/
	
	public Date getTakeTime(){
		return  takeTime;
	}
	/**收货时间
	*@param  takeTime
	*/
	public void setTakeTime(Date takeTime ){
		this.takeTime = takeTime;
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
		sb.append(salesId+",");
		sb.append(deliveryNumber+",");
		sb.append(number+",");
		sb.append(price+",");
		sb.append(address+",");
		sb.append(agencyId+",");
		sb.append(area+",");
		sb.append(city+",");
		sb.append(consignee+",");
		sb.append(consigneePhone+",");
		sb.append(province+",");
		sb.append(remark+",");
		sb.append(createTime+",");
		sb.append(sendTime+",");
		sb.append(takeTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
