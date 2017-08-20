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
public class Menu extends TailBean {
	
	private String menuId;	
	private Integer ordernum;	
	private String fid;	
	private String menuName;	
	private String path;	
	
	@AssignID("uuid")
	public String getMenuId(){
		return  menuId;
	}
	public void setMenuId(String menuId ){
		this.menuId = menuId;
	}
	
	
	public Integer getOrdernum(){
		return  ordernum;
	}
	public void setOrdernum(Integer ordernum ){
		this.ordernum = ordernum;
	}
	
	
	public String getFid(){
		return  fid;
	}
	public void setFid(String fid ){
		this.fid = fid;
	}
	
	
	public String getMenuName(){
		return  menuName;
	}
	public void setMenuName(String menuName ){
		this.menuName = menuName;
	}
	
	
	public String getPath(){
		return  path;
	}
	public void setPath(String path ){
		this.path = path;
	}
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(menuId+",");
		sb.append(ordernum+",");
		sb.append(fid+",");
		sb.append(menuName+",");
		sb.append(path);
		if(!this.getTails().isEmpty()){
			sb.append(this.getTails().toString());
		}
		return sb.toString();
	}

}
