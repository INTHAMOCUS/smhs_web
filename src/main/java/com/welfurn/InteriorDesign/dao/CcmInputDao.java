package com.welfurn.InteriorDesign.dao;

import lombok.Getter;
import lombok.Setter;


public class CcmInputDao {
	
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
	
}
