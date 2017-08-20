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
public class TFamilyApplyRecord extends TailBean {
	
	private String applyId;	
	private Integer flag;	//0:用户申请 1:管理员邀请
	private Integer status;	//0:未查看 1:同意 2：拒绝
	private String familyId;	//家庭ID
	private String memberId;	//申请用户ID
	private String relations;	//家庭关系
	private Date applyTime;	//申请时间
	private Date updateTime;	//更新时间
	
	@AssignID("uuid")
	public String getApplyId(){
		return  applyId;
	}
	public void setApplyId(String applyId ){
		this.applyId = applyId;
	}
	
	/**0:用户申请 1:管理员邀请
	*@return 
	*/
	
	public Integer getFlag(){
		return  flag;
	}
	/**0:用户申请 1:管理员邀请
	*@param  flag
	*/
	public void setFlag(Integer flag ){
		this.flag = flag;
	}
	
	/**0:未查看 1:同意 2：拒绝
	*@return 
	*/
	
	public Integer getStatus(){
		return  status;
	}
	/**0:未查看 1:同意 2：拒绝
	*@param  status
	*/
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**家庭ID
	*@return 
	*/
	
	public String getFamilyId(){
		return  familyId;
	}
	/**家庭ID
	*@param  familyId
	*/
	public void setFamilyId(String familyId ){
		this.familyId = familyId;
	}
	
	/**申请用户ID
	*@return 
	*/
	
	public String getMemberId(){
		return  memberId;
	}
	/**申请用户ID
	*@param  memberId
	*/
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	/**家庭关系
	*@return 
	*/
	
	public String getRelations(){
		return  relations;
	}
	/**家庭关系
	*@param  relations
	*/
	public void setRelations(String relations ){
		this.relations = relations;
	}
	
	/**申请时间
	*@return 
	*/
	
	public Date getApplyTime(){
		return  applyTime;
	}
	/**申请时间
	*@param  applyTime
	*/
	public void setApplyTime(Date applyTime ){
		this.applyTime = applyTime;
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
		sb.append(applyId+",");
		sb.append(flag+",");
		sb.append(status+",");
		sb.append(familyId+",");
		sb.append(memberId+",");
		sb.append(relations+",");
		sb.append(applyTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
