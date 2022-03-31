package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="shutter_core_material")
@Data
public class ShutterCoreMaterial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="scm_id")
	private Integer scmId;
	@Column(name="scm_name")
	private String scmName;
	@Column(name="scm_price")
	private float scmPrice;
	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;

}
