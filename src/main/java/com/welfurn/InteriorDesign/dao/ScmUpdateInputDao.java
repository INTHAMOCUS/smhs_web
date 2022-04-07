package com.welfurn.InteriorDesign.dao;

public class ScmUpdateInputDao {
	
	Integer id;
	String scmName;
	float scmPrice;
	String baseCategory;
	public String getScmName() {
		return scmName;
	}
	public void setScmName(String scmName) {
		this.scmName = scmName;
	}
	public float getScmPrice() {
		return scmPrice;
	}
	public void setScmPrice(float scmPrice) {
		this.scmPrice = scmPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBaseCategory() {
		return baseCategory;
	}
	public void setBaseCategory(String baseCategory) {
		this.baseCategory = baseCategory;
	}
	
	

}
