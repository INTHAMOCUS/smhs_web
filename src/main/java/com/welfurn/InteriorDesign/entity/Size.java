package com.welfurn.InteriorDesign.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="size")
@Data
public class Size {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_id")
	private Integer id;
	@Column(name="width")
	private float width;
	@Column(name="height")
	private float height;
	@Column(name="depth")
	private float depth;	
	@Column(name="price")
	private float accessoriesPrice;
	@Column(name="dt_createdon")
	private LocalDateTime dtCreatedOn;

}
