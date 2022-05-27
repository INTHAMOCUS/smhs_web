package com.welfurn.InteriorDesign.dao;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class SizingDao {
	
	private Integer id;
	private String ccmName;
	private String cabinetType;
	private String width;
	private String depth;
	private String height;
	private String sqft;
	private float price;
	private LocalDateTime dtCreatedOn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCcmName() {
		return ccmName;
	}
	public void setCcmName(String ccmName) {
		this.ccmName = ccmName;
	}
	public String getCabinetType() {
		return cabinetType;
	}
	public void setCabinetType(String cabinetType) {
		this.cabinetType = cabinetType;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getSqft() {
		return sqft;
	}
	public void setSqft(String sqft) {
		this.sqft = sqft;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDateTime getDtCreatedOn() {
		return dtCreatedOn;
	}
	public void setDtCreatedOn(LocalDateTime dtCreatedOn) {
		this.dtCreatedOn = dtCreatedOn;
	}
	

}
