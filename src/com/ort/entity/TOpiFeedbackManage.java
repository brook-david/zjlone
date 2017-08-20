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
public class TOpiFeedbackManage extends TailBean {
	
	private String feedbackId;	
	private Integer deleteFlag;	//删除 0:否 1:是
	private Integer disposeStatus;	//处理情况 0:未处理 1:已处理
	private String content;	//反馈内容
	private String disposeId;	//处理者ID
	private String feedbackerId;	//反馈者ID
	private String remark;	//备注
	private Date disposeTime;	//处理日期
	private Date feedbackTime;	//反馈日期
	
	@AssignID("uuid")
	public String getFeedbackId(){
		return  feedbackId;
	}
	public void setFeedbackId(String feedbackId ){
		this.feedbackId = feedbackId;
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
	
	/**处理情况 0:未处理 1:已处理
	*@return 
	*/
	
	public Integer getDisposeStatus(){
		return  disposeStatus;
	}
	/**处理情况 0:未处理 1:已处理
	*@param  disposeStatus
	*/
	public void setDisposeStatus(Integer disposeStatus ){
		this.disposeStatus = disposeStatus;
	}
	
	/**反馈内容
	*@return 
	*/
	
	public String getContent(){
		return  content;
	}
	/**反馈内容
	*@param  content
	*/
	public void setContent(String content ){
		this.content = content;
	}
	
	/**处理者ID
	*@return 
	*/
	
	public String getDisposeId(){
		return  disposeId;
	}
	/**处理者ID
	*@param  disposeId
	*/
	public void setDisposeId(String disposeId ){
		this.disposeId = disposeId;
	}
	
	/**反馈者ID
	*@return 
	*/
	
	public String getFeedbackerId(){
		return  feedbackerId;
	}
	/**反馈者ID
	*@param  feedbackerId
	*/
	public void setFeedbackerId(String feedbackerId ){
		this.feedbackerId = feedbackerId;
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
	
	/**处理日期
	*@return 
	*/
	
	public Date getDisposeTime(){
		return  disposeTime;
	}
	/**处理日期
	*@param  disposeTime
	*/
	public void setDisposeTime(Date disposeTime ){
		this.disposeTime = disposeTime;
	}
	
	/**反馈日期
	*@return 
	*/
	
	public Date getFeedbackTime(){
		return  feedbackTime;
	}
	/**反馈日期
	*@param  feedbackTime
	*/
	public void setFeedbackTime(Date feedbackTime ){
		this.feedbackTime = feedbackTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(feedbackId+",");
		sb.append(deleteFlag+",");
		sb.append(disposeStatus+",");
		sb.append(content+",");
		sb.append(disposeId+",");
		sb.append(feedbackerId+",");
		sb.append(remark+",");
		sb.append(disposeTime+",");
		sb.append(feedbackTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
