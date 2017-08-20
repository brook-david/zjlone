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
public class TIntelligentPenConstant extends TailBean {
	
	private String constantId;	
	private Integer blueToothAutoLink;	//蓝牙自动连接
	private Integer blueToothTips;	//蓝牙自动连接提示音
	private Integer delayTips;	//延时提示
	private Integer distanceCalibration;	//距离校准值
	private Integer gripPoseDetection;	//握姿检测 1230:低中高关
	private Integer lightCalibration;	//光线校准值
	private Integer lightDetection;	//光线检测 1230:低中高关
	private Integer lightTips;	//灯光提示
	private Integer restTime;	//休息时间
	private Integer sitPoseDetection;	//坐姿检测 1230:低中高关
	private Integer stageSelection;	//阶段选择0:自定义  12345 
	private Integer timeDetection;	//时间检测 
	private Integer useTime;	//使用时间
	private Integer voiceTips;	//声音提示
	private String intPenId;	//智能笔ID
	private String memberId;	//使用者ID
	private Date createTime;	
	private Date modifyTime;	
	
	@AssignID("uuid")
	public String getConstantId(){
		return  constantId;
	}
	public void setConstantId(String constantId ){
		this.constantId = constantId;
	}
	
	/**蓝牙自动连接
	*@return 
	*/
	
	public Integer getBlueToothAutoLink(){
		return  blueToothAutoLink;
	}
	/**蓝牙自动连接
	*@param  blueToothAutoLink
	*/
	public void setBlueToothAutoLink(Integer blueToothAutoLink ){
		this.blueToothAutoLink = blueToothAutoLink;
	}
	
	/**蓝牙自动连接提示音
	*@return 
	*/
	
	public Integer getBlueToothTips(){
		return  blueToothTips;
	}
	/**蓝牙自动连接提示音
	*@param  blueToothTips
	*/
	public void setBlueToothTips(Integer blueToothTips ){
		this.blueToothTips = blueToothTips;
	}
	
	/**延时提示
	*@return 
	*/
	
	public Integer getDelayTips(){
		return  delayTips;
	}
	/**延时提示
	*@param  delayTips
	*/
	public void setDelayTips(Integer delayTips ){
		this.delayTips = delayTips;
	}
	
	/**距离校准值
	*@return 
	*/
	
	public Integer getDistanceCalibration(){
		return  distanceCalibration;
	}
	/**距离校准值
	*@param  distanceCalibration
	*/
	public void setDistanceCalibration(Integer distanceCalibration ){
		this.distanceCalibration = distanceCalibration;
	}
	
	/**握姿检测 1230:低中高关
	*@return 
	*/
	
	public Integer getGripPoseDetection(){
		return  gripPoseDetection;
	}
	/**握姿检测 1230:低中高关
	*@param  gripPoseDetection
	*/
	public void setGripPoseDetection(Integer gripPoseDetection ){
		this.gripPoseDetection = gripPoseDetection;
	}
	
	/**光线校准值
	*@return 
	*/
	
	public Integer getLightCalibration(){
		return  lightCalibration;
	}
	/**光线校准值
	*@param  lightCalibration
	*/
	public void setLightCalibration(Integer lightCalibration ){
		this.lightCalibration = lightCalibration;
	}
	
	/**光线检测 1230:低中高关
	*@return 
	*/
	
	public Integer getLightDetection(){
		return  lightDetection;
	}
	/**光线检测 1230:低中高关
	*@param  lightDetection
	*/
	public void setLightDetection(Integer lightDetection ){
		this.lightDetection = lightDetection;
	}
	
	/**灯光提示
	*@return 
	*/
	
	public Integer getLightTips(){
		return  lightTips;
	}
	/**灯光提示
	*@param  lightTips
	*/
	public void setLightTips(Integer lightTips ){
		this.lightTips = lightTips;
	}
	
	/**休息时间
	*@return 
	*/
	
	public Integer getRestTime(){
		return  restTime;
	}
	/**休息时间
	*@param  restTime
	*/
	public void setRestTime(Integer restTime ){
		this.restTime = restTime;
	}
	
	/**坐姿检测 1230:低中高关
	*@return 
	*/
	
	public Integer getSitPoseDetection(){
		return  sitPoseDetection;
	}
	/**坐姿检测 1230:低中高关
	*@param  sitPoseDetection
	*/
	public void setSitPoseDetection(Integer sitPoseDetection ){
		this.sitPoseDetection = sitPoseDetection;
	}
	
	/**阶段选择0:自定义  12345 
	*@return 
	*/
	
	public Integer getStageSelection(){
		return  stageSelection;
	}
	/**阶段选择0:自定义  12345 
	*@param  stageSelection
	*/
	public void setStageSelection(Integer stageSelection ){
		this.stageSelection = stageSelection;
	}
	
	/**时间检测 
	*@return 
	*/
	
	public Integer getTimeDetection(){
		return  timeDetection;
	}
	/**时间检测 
	*@param  timeDetection
	*/
	public void setTimeDetection(Integer timeDetection ){
		this.timeDetection = timeDetection;
	}
	
	/**使用时间
	*@return 
	*/
	
	public Integer getUseTime(){
		return  useTime;
	}
	/**使用时间
	*@param  useTime
	*/
	public void setUseTime(Integer useTime ){
		this.useTime = useTime;
	}
	
	/**声音提示
	*@return 
	*/
	
	public Integer getVoiceTips(){
		return  voiceTips;
	}
	/**声音提示
	*@param  voiceTips
	*/
	public void setVoiceTips(Integer voiceTips ){
		this.voiceTips = voiceTips;
	}
	
	/**智能笔ID
	*@return 
	*/
	
	public String getIntPenId(){
		return  intPenId;
	}
	/**智能笔ID
	*@param  intPenId
	*/
	public void setIntPenId(String intPenId ){
		this.intPenId = intPenId;
	}
	
	/**使用者ID
	*@return 
	*/
	
	public String getMemberId(){
		return  memberId;
	}
	/**使用者ID
	*@param  memberId
	*/
	public void setMemberId(String memberId ){
		this.memberId = memberId;
	}
	
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	
	public Date getModifyTime(){
		return  modifyTime;
	}
	public void setModifyTime(Date modifyTime ){
		this.modifyTime = modifyTime;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(constantId+",");
		sb.append(blueToothAutoLink+",");
		sb.append(blueToothTips+",");
		sb.append(delayTips+",");
		sb.append(distanceCalibration+",");
		sb.append(gripPoseDetection+",");
		sb.append(lightCalibration+",");
		sb.append(lightDetection+",");
		sb.append(lightTips+",");
		sb.append(restTime+",");
		sb.append(sitPoseDetection+",");
		sb.append(stageSelection+",");
		sb.append(timeDetection+",");
		sb.append(useTime+",");
		sb.append(voiceTips+",");
		sb.append(intPenId+",");
		sb.append(memberId+",");
		sb.append(createTime+",");
		sb.append(modifyTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
