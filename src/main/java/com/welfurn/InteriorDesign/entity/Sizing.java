package com.welfurn.InteriorDesign.entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="sizing")
public class Sizing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_id")
	private Integer id;
	
	@Column(name="ccm_name")
	private String ccmName;
	
	@Column(name="cabinet_type")
	private String cabinetType;
	
	@Column(name="width")
	private String width;
	
	@Column(name="depth")
	private String depth;
	
	@Column(name="height")
	private String height;
	
	@Column(name="sqft")
	private String sqft;
	
	@Column(name="price")
	private float price;
	
	
	@Column(name="dt_createdon")
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
