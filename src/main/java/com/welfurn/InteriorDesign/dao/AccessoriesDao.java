package com.welfurn.InteriorDesign.dao;

import java.time.LocalDateTime;

public class AccessoriesDao {
	
	
	private Integer id;
	
	private String cabinetType;
	
	private String cabinetDesc;
	
	private String width;
	
	private String accessoriesType;	
	
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
