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
public class TFamilyMemberRelation extends TailBean {
	
	private String id;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private Integer memberAuthority;	//用户权限0：没有权限 1：所有权限 2: 更改笔设置 3: 发送留言
	private String familyId;	//家庭ID
	private String memberId;	//用户ID
	private String relations;	//家庭角色
	private Date jionTime;	//加入家庭时间
	private Date updateTime;	//更新时间
	
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
	
	/**用户权限0：没有权限 1：所有权限 2: 更改笔设置 3: 发送留言
	*@return 
	*/
	
	public Integer getMemberAuthority(){
		return  memberAuthority;
	}
	/**用户权限0：没有权限 1：所有权限 2: 更改笔设置 3: 发送留言
	*@param  memberAuthority
	*/
	public void setMemberAuthority(Integer memberAuthority ){
		this.memberAuthority = memberAuthority;
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
	
	/**用户ID
	*@return 
	*/
	
	public String getMemberId(){
		return  memberId;
	}
	/**用户ID
	*@param  memberId
	*/
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	/**家庭角色
	*@return 
	*/
	
	public String getRelations(){
		return  relations;
	}
	/**家庭角色
	*@param  relations
	*/
	public void setRelations(String relations ){
		this.relations = relations;
	}
	
	/**加入家庭时间
	*@return 
	*/
	
	public Date getJionTime(){
		return  jionTime;
	}
	/**加入家庭时间
	*@param  jionTime
	*/
	public void setJionTime(Date jionTime ){
		this.jionTime = jionTime;
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
		sb.append(id+",");
		sb.append(deleteFlag+",");
		sb.append(memberAuthority+",");
		sb.append(familyId+",");
		sb.append(memberId+",");
		sb.append(relations+",");
		sb.append(jionTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
