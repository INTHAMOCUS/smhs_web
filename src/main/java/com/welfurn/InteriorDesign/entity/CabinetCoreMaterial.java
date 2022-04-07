package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity(name="cabinet_core_material")
public class CabinetCoreMaterial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ccm_id")
	private Integer ccmId;
	@Column(name="ccm_name")
	private String ccmName;
	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;
	public Integer getCcmId() {
		return ccmId;
	}
	public void setCcmId(Integer ccmId) {
		this.ccmId = ccmId;
	}
	public String getCcmName() {
		return ccmName;
	}
	public void setCcmName(String ccmName) {
		this.ccmName = ccmName;
	}
	public LocalDateTime getDtCreatedOn() {
		return dtCreatedOn;
	}
	public void setDtCreatedOn(LocalDateTime dtCreatedOn) {
		this.dtCreatedOn = dtCreatedOn;
	}
	

}
