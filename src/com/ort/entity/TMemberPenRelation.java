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
public class TMemberPenRelation extends TailBean {
	
	private String relationId;	
	private Integer age;	//年龄
	private Integer deleteFlag;	//删除  0:否 1:是
	private Integer gender;	//性别 0:女 1:男
	private Integer height;	//身高
	private Integer myopiaFlag;	//是否近视 0:否 1:是
	private Integer schoolGrade;	//年级
	private String accountIdentity;	//昵称
	private String area;	//区
	private String avatarPath;	//头像
	private String city;	//城市
	private String intPenId;	//智能笔ID
	private String memberId;	//用户ID
	private String province;	//省
	private String school;	//学校
	private String status;	//登录状态1：在线 0：下线
	private String usedTime;	//总使用时长
	private Date birthday;	//生日
	private Date createTime;	
	private Date updateTime;	
	
	@AssignID("uuid")
	public String getRelationId(){
		return  relationId;
	}
	public void setRelationId(String relationId ){
		this.relationId = relationId;
	}
	
	/**年龄
	*@return 
	*/
	
	public Integer getAge(){
		return  age;
	}
	/**年龄
	*@param  age
	*/
	public void setAge(Integer age ){
		this.age = age;
	}
	
	/**删除  0:否 1:是
	*@return 
	*/
	
	public Integer getDeleteFlag(){
		return  deleteFlag;
	}
	/**删除  0:否 1:是
	*@param  deleteFlag
	*/
	public void setDeleteFlag(Integer deleteFlag ){
		this.deleteFlag = deleteFlag;
	}
	
	/**性别 0:女 1:男
	*@return 
	*/
	
	public Integer getGender(){
		return  gender;
	}
	/**性别 0:女 1:男
	*@param  gender
	*/
	public void setGender(Integer gender ){
		this.gender = gender;
	}
	
	/**身高
	*@return 
	*/
	
	public Integer getHeight(){
		return  height;
	}
	/**身高
	*@param  height
	*/
	public void setHeight(Integer height ){
		this.height = height;
	}
	
	/**是否近视 0:否 1:是
	*@return 
	*/
	
	public Integer getMyopiaFlag(){
		return  myopiaFlag;
	}
	/**是否近视 0:否 1:是
	*@param  myopiaFlag
	*/
	public void setMyopiaFlag(Integer myopiaFlag ){
		this.myopiaFlag = myopiaFlag;
	}
	
	/**年级
	*@return 
	*/
	
	public Integer getSchoolGrade(){
		return  schoolGrade;
	}
	/**年级
	*@param  schoolGrade
	*/
	public void setSchoolGrade(Integer schoolGrade ){
		this.schoolGrade = schoolGrade;
	}
	
	/**昵称
	*@return 
	*/
	
	public String getAccountIdentity(){
		return  accountIdentity;
	}
	/**昵称
	*@param  accountIdentity
	*/
	public void setAccountIdentity(String accountIdentity ){
		this.accountIdentity = accountIdentity;
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
	
	/**头像
	*@return 
	*/
	
	public String getAvatarPath(){
		return  avatarPath;
	}
	/**头像
	*@param  avatarPath
	*/
	public void setAvatarPath(String avatarPath ){
		this.avatarPath = avatarPath;
	}
	
	/**城市
	*@return 
	*/
	
	public String getCity(){
		return  city;
	}
	/**城市
	*@param  city
	*/
	public void setCity(String city ){
		this.city = city;
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
	
	/**学校
	*@return 
	*/
	
	public String getSchool(){
		return  school;
	}
	/**学校
	*@param  school
	*/
	public void setSchool(String school ){
		this.school = school;
	}
	
	/**登录状态1：在线 0：下线
	*@return 
	*/
	
	public String getStatus(){
		return  status;
	}
	/**登录状态1：在线 0：下线
	*@param  status
	*/
	public void setStatus(String status ){
		this.status = status;
	}
	
	/**总使用时长
	*@return 
	*/
	
	public String getUsedTime(){
		return  usedTime;
	}
	/**总使用时长
	*@param  usedTime
	*/
	public void setUsedTime(String usedTime ){
		this.usedTime = usedTime;
	}
	
	/**生日
	*@return 
	*/
	
	public Date getBirthday(){
		return  birthday;
	}
	/**生日
	*@param  birthday
	*/
	public void setBirthday(Date birthday ){
		this.birthday = birthday;
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
		sb.append(relationId+",");
		sb.append(age+",");
		sb.append(deleteFlag+",");
		sb.append(gender+",");
		sb.append(height+",");
		sb.append(myopiaFlag+",");
		sb.append(schoolGrade+",");
		sb.append(accountIdentity+",");
		sb.append(area+",");
		sb.append(avatarPath+",");
		sb.append(city+",");
		sb.append(intPenId+",");
		sb.append(memberId+",");
		sb.append(province+",");
		sb.append(school+",");
		sb.append(status+",");
		sb.append(usedTime+",");
		sb.append(birthday+",");
		sb.append(createTime+",");
		sb.append(updateTime);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
