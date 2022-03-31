package com.welfurn.InteriorDesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.welfurn.InteriorDesign.dao.CcmInputDao;
import com.welfurn.InteriorDesign.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/saveCCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveCCM(@RequestBody CcmInputDao ccmInputDao)
	{
		System.out.println("inputs"+ccmInputDao.getCcmName()+ccmInputDao.getCcmPrice());
		return adminService.InsertCCM(ccmInputDao.getCcmName(), ccmInputDao.getCcmPrice());		
	}

}
