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
public class TSalesReturn extends TailBean {
	
	private String returnId;	
	private Integer number;	//退货数量
	private Integer unitPrice;	//退货单价
	private String remark;	//备注(退货原因)
	private String salesId;	//销售ID
	private Date createTime;	
	
	@AssignID("uuid")
	public String getReturnId(){
		return  returnId;
	}
	public void setReturnId(String returnId ){
		this.returnId = returnId;
	}
	
	/**退货数量
	*@return 
	*/
	
	public Integer getNumber(){
		return  number;
	}
	/**退货数量
	*@param  number
	*/
	public void setNumber(Integer number ){
		this.number = number;
	}
	
	/**退货单价
	*@return 
	*/
	
	public Integer getUnitPrice(){
		return  unitPrice;
	}
	/**退货单价
	*@param  unitPrice
	*/
	public void setUnitPrice(Integer unitPrice ){
		this.unitPrice = unitPrice;
	}
	
	/**备注(退货原因)
	*@return 
	*/
	
	public String getRemark(){
		return  remark;
	}
	/**备注(退货原因)
	*@param  remark
	*/
	public void setRemark(String remark ){
		this.remark = remark;
	}
	
	/**销售ID
	*@return 
	*/
	
	public String getSalesId(){
		return  salesId;
	}
	/**销售ID
	*@param  salesId
	*/
	public void setSalesId(String salesId ){
		this.salesId = salesId;
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
		sb.append(returnId+",");
		sb.append(number+",");
		sb.append(unitPrice+",");
		sb.append(remark+",");
		sb.append(salesId+",");
		sb.append(createTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
