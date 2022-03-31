package com.welfurn.InteriorDesign.dao;

import java.time.LocalDateTime;

public class AccessoriesDao {
	
	
	private Integer id;
	
	private String accessoriesName;
	
	private float accessoriesPrice;
	
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
