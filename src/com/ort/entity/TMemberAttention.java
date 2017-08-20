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
public class TMemberAttention extends TailBean {
	
	private String attentionId;	
	private String memberId;	//关注者
	private String relationId;	//被关注的使用者
	private Date createTime;	
	
	@AssignID("uuid")
	public String getAttentionId(){
		return  attentionId;
	}
	public void setAttentionId(String attentionId ){
		this.attentionId = attentionId;
	}
	
	/**关注者
	*@return 
	*/
	
	public String getMemberId(){
		return  memberId;
	}
	/**关注者
	*@param  memberId
	*/
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	/**被关注的使用者
	*@return 
	*/
	
	public String getRelationId(){
		return  relationId;
	}
	/**被关注的使用者
	*@param  relationId
	*/
	public void setRelationId(String relationId ){
		this.relationId = relationId;
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
		sb.append(attentionId+",");
		sb.append(memberId+",");
		sb.append(relationId+",");
		sb.append(createTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
