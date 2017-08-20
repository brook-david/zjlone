package com.ort.entity.frame;

import java.io.Serializable;

public class CacheMember implements Serializable{
	
	public String memberId;
	public String account;
	public String useingIntPenId;
	public String connectingRelationId;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUseingIntPenId() {
		return useingIntPenId;
	}
	public void setUseingIntPenId(String useingIntPenId) {
		this.useingIntPenId = useingIntPenId;
	}
	public String getConnectingRelationId() {
		return connectingRelationId;
	}
	public void setConnectingRelationId(String connectingRelationId) {
		this.connectingRelationId = connectingRelationId;
	}
	
	@Override
	public String toString() {
		return "CacheMember [memberId=" + memberId + ", account=" + account + ", useingIntPenId=" + useingIntPenId
				+ ", connectingRelationId=" + connectingRelationId + "]";
	}
	
}
