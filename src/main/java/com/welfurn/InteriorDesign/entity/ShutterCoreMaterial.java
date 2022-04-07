package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name="shutter_core_material")
public class ShutterCoreMaterial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="scm_id")
	private Integer scmId;
	@Column(name="scm_name")
	private String scmName;
	@Column(name="scm_price")
	private float scmPrice;
	@Column(name="base_category")
	private String baseCategory;
	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;
	public Integer getScmId() {
		return scmId;
	}
	public void setScmId(Integer scmId) {
		this.scmId = scmId;
	}
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
	public String getBaseCategory() {
		return baseCategory;
	}
	public void setBaseCategory(String baseCategory) {
		this.baseCategory = baseCategory;
	}
	public LocalDateTime getDtCreatedOn() {
		return dtCreatedOn;
	}
	public void setDtCreatedOn(LocalDateTime dtCreatedOn) {
		this.dtCreatedOn = dtCreatedOn;
	}

	
}
