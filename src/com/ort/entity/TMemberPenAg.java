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
public class TMemberPenAg extends TailBean {
	
	private String agId;	
	private Integer angleErrorCount;	//角度错误次数
	private Integer angleErrorTime;	//角度错误时长
	private Integer distancErrorCount;	//坐姿错误次数
	private Integer distancErrorTime;	//坐姿错误时长
	private Integer lightErrorCount;	//光线错误次数
	private Integer lightErrorTime;	//光线错误时长
	private Integer useTime;	//使用时长
	private Integer writeTime;	//书写时长
	private String relationId;	//关系ID
	private BigDecimal score;	//分数
	private Date agTime;	//记录时间
	private Date insertTime;	//插入时间
	
	@AssignID("uuid")
	public String getAgId(){
		return  agId;
	}
	public void setAgId(String agId ){
		this.agId = agId;
	}
	
	/**角度错误次数
	*@return 
	*/
	
	public Integer getAngleErrorCount(){
		return  angleErrorCount;
	}
	/**角度错误次数
	*@param  angleErrorCount
	*/
	public void setAngleErrorCount(Integer angleErrorCount ){
		this.angleErrorCount = angleErrorCount;
	}
	
	/**角度错误时长
	*@return 
	*/
	
	public Integer getAngleErrorTime(){
		return  angleErrorTime;
	}
	/**角度错误时长
	*@param  angleErrorTime
	*/
	public void setAngleErrorTime(Integer angleErrorTime ){
		this.angleErrorTime = angleErrorTime;
	}
	
	/**坐姿错误次数
	*@return 
	*/
	
	public Integer getDistancErrorCount(){
		return  distancErrorCount;
	}
	/**坐姿错误次数
	*@param  distancErrorCount
	*/
	public void setDistancErrorCount(Integer distancErrorCount ){
		this.distancErrorCount = distancErrorCount;
	}
	
	/**坐姿错误时长
	*@return 
	*/
	
	public Integer getDistancErrorTime(){
		return  distancErrorTime;
	}
	/**坐姿错误时长
	*@param  distancErrorTime
	*/
	public void setDistancErrorTime(Integer distancErrorTime ){
		this.distancErrorTime = distancErrorTime;
	}
	
	/**光线错误次数
	*@return 
	*/
	
	public Integer getLightErrorCount(){
		return  lightErrorCount;
	}
	/**光线错误次数
	*@param  lightErrorCount
	*/
	public void setLightErrorCount(Integer lightErrorCount ){
		this.lightErrorCount = lightErrorCount;
	}
	
	/**光线错误时长
	*@return 
	*/
	
	public Integer getLightErrorTime(){
		return  lightErrorTime;
	}
	/**光线错误时长
	*@param  lightErrorTime
	*/
	public void setLightErrorTime(Integer lightErrorTime ){
		this.lightErrorTime = lightErrorTime;
	}
	
	/**使用时长
	*@return 
	*/
	
	public Integer getUseTime(){
		return  useTime;
	}
	/**使用时长
	*@param  useTime
	*/
	public void setUseTime(Integer useTime ){
		this.useTime = useTime;
	}
	
	/**书写时长
	*@return 
	*/
	
	public Integer getWriteTime(){
		return  writeTime;
	}
	/**书写时长
	*@param  writeTime
	*/
	public void setWriteTime(Integer writeTime ){
		this.writeTime = writeTime;
	}
	
	/**关系ID
	*@return 
	*/
	
	public String getRelationId(){
		return  relationId;
	}
	/**关系ID
	*@param  relationId
	*/
	public void setRelationId(String relationId ){
		this.relationId = relationId;
	}
	
	/**分数
	*@return 
	*/
	
	public BigDecimal getScore(){
		return  score;
	}
	/**分数
	*@param  score
	*/
	public void setScore(BigDecimal score ){
		this.score = score;
	}
	
	/**记录时间
	*@return 
	*/
	
	public Date getAgTime(){
		return  agTime;
	}
	/**记录时间
	*@param  agTime
	*/
	public void setAgTime(Date agTime ){
		this.agTime = agTime;
	}
	
	/**插入时间
	*@return 
	*/
	
	public Date getInsertTime(){
		return  insertTime;
	}
	/**插入时间
	*@param  insertTime
	*/
	public void setInsertTime(Date insertTime ){
		this.insertTime = insertTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(agId+",");
		sb.append(angleErrorCount+",");
		sb.append(angleErrorTime+",");
		sb.append(distancErrorCount+",");
		sb.append(distancErrorTime+",");
		sb.append(lightErrorCount+",");
		sb.append(lightErrorTime+",");
		sb.append(useTime+",");
		sb.append(writeTime+",");
		sb.append(relationId+",");
		sb.append(score+",");
		sb.append(agTime+",");
		sb.append(insertTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
