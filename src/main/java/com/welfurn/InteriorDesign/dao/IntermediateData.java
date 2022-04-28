package com.welfurn.InteriorDesign.dao;

public class IntermediateData {
	
	private Integer id;
	private Integer customer_id;
	private String layout_selected;
	private String ccm_selected;
	private String scm_selected;
	private String size_selected;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getLayout_selected() {
		return layout_selected;
	}
	public void setLayout_selected(String layout_selected) {
		this.layout_selected = layout_selected;
	}
	public String getCcm_selected() {
		return ccm_selected;
	}
	public void setCcm_selected(String ccm_selected) {
		this.ccm_selected = ccm_selected;
	}
	public String getScm_selected() {
		return scm_selected;
	}
	public void setScm_selected(String scm_selected) {
		this.scm_selected = scm_selected;
	}
	public String getSize_selected() {
		return size_selected;
	}
	public void setSize_selected(String size_selected) {
		this.size_selected = size_selected;
	}
	

}
