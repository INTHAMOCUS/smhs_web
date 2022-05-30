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
	@Column(name="cabinet_type")
	private String cabinetType;
	@Column(name="cabinet_desc")
	private String cabinetDesc;
	@Column(name="width")
	private String width;
	@Column(name="accessories_type")
	private String accessoriesType;

	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCabinetType() {
		return cabinetType;
	}
	public void setCabinetType(String cabinetType) {
		this.cabinetType = cabinetType;
	}
	
	public String getCabinetDesc() {
		return cabinetDesc;
	}
	public void setCabinetDesc(String cabinetDesc) {
		this.cabinetDesc = cabinetDesc;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getAccessoriesType() {
		return accessoriesType;
	}
	public void setAccessoriesType(String accessoriesType) {
		this.accessoriesType = accessoriesType;
	}
	public LocalDateTime getDtCreatedOn() {
		return dtCreatedOn;
	}
	public void setDtCreatedOn(LocalDateTime dtCreatedOn) {
		this.dtCreatedOn = dtCreatedOn;
	}
	
	
	
}
