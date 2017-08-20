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
public class TAgency extends TailBean {
	
	private String agencyId;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private Integer status;	//交易状态 0:正常 1:禁止
	private Integer unitPrice;	//进货单价
	private String address;	//详细地址
	private String agencyName;	//经销商名称
	private String area;	//区
	private String brandId;	//品牌ID
	private String city;	//市
	private String province;	//省
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getAgencyId(){
		return  agencyId;
	}
	public void setAgencyId(String agencyId ){
		this.agencyId = agencyId;
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
	
	/**交易状态 0:正常 1:禁止
	*@return 
	*/
	
	public Integer getStatus(){
		return  status;
	}
	/**交易状态 0:正常 1:禁止
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**进货单价
	*@return 
	*/
	
	public Integer getUnitPrice(){
		return  unitPrice;
	}
	/**进货单价
	*@param  unitPrice
	*/
	public void setUnitPrice(Integer unitPrice ){
		this.unitPrice = unitPrice;
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
	
	/**经销商名称
	*@return 
	*/
	
	public String getAgencyName(){
		return  agencyName;
	}
	/**经销商名称
	*@param  agencyName
	*/
	public void setAgencyName(String agencyName ){
		this.agencyName = agencyName;
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
	
	/**品牌ID
	*@return 
	*/
	
	public String getBrandId(){
		return  brandId;
	}
	/**品牌ID
	*@param  brandId
	*/
	public void setBrandId(String brandId ){
		this.brandId = brandId;
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
		sb.append(agencyId+",");
		sb.append(deleteFlag+",");
		sb.append(status+",");
		sb.append(unitPrice+",");
		sb.append(address+",");
		sb.append(agencyName+",");
		sb.append(area+",");
		sb.append(brandId+",");
		sb.append(city+",");
		sb.append(province+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
