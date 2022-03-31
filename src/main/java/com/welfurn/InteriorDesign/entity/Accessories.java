package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="accessories")

public class Accessories {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="accessories_name")
	private String accessoriesName;
	@Column(name="price")
	private float accessoriesPrice;
	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccessoriesName() {
		return accessoriesName;
	}
	public void setAccessoriesName(String accessoriesName) {
		this.accessoriesName = accessoriesName;
	}
	public float getAccessoriesPrice() {
		return accessoriesPrice;
	}
	public void setAccessoriesPrice(float accessoriesPrice) {
		this.accessoriesPrice = accessoriesPrice;
	}
	public LocalDateTime getDtCreatedOn() {
		return dtCreatedOn;
	}
	public void setDtCreatedOn(LocalDateTime dtCreatedOn) {
		this.dtCreatedOn = dtCreatedOn;
	}
	
	
	
	
}
