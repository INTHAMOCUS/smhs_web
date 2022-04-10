package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="size")
public class Size {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_id")
	private Integer id;
	@Column(name="type_size")
	private String typeSize;
	@Column(name="base_category")
	private String baseCategory;
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
	public String getTypeSize() {
		return typeSize;
	}
	public void setTypeSize(String typeSize) {
		this.typeSize = typeSize;
	}
	public String getBaseCategory() {
		return baseCategory;
	}
	public void setBaseCategory(String baseCategory) {
		this.baseCategory = baseCategory;
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
