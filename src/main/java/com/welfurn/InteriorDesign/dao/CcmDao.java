package com.welfurn.InteriorDesign.dao;

public class CcmDao {
	
	Integer id;
	String ccmName;
	float ccmPrice;
	public String getCcmName() {
		return ccmName;
	}
	public void setCcmName(String ccmName) {
		this.ccmName = ccmName;
	}
	public float getCcmPrice() {
		return ccmPrice;
	}
	public void setCcmPrice(float ccmPrice) {
		this.ccmPrice = ccmPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
