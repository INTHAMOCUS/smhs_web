package com.welfurn.InteriorDesign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="session_intermediate_data")
public class SessionIntermediateData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name="layout_selected")
	private String layoutSelected;
	@Column(name="ccm_selected")
	private String ccmSelected;
	@Column(name="scm_selected")
	private String scmSelected;
	@Column(name="size_selected")
	private String sizeSelected;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getLayoutSelected() {
		return layoutSelected;
	}
	public void setLayoutSelected(String layoutSelected) {
		this.layoutSelected = layoutSelected;
	}
	public String getCcmSelected() {
		return ccmSelected;
	}
	public void setCcmSelected(String ccmSelected) {
		this.ccmSelected = ccmSelected;
	}
	public String getScmSelected() {
		return scmSelected;
	}
	public void setScmSelected(String scmSelected) {
		this.scmSelected = scmSelected;
	}
	public String getSizeSelected() {
		return sizeSelected;
	}
	public void setSizeSelected(String sizeSelected) {
		this.sizeSelected = sizeSelected;
	}
	
	
	
}
