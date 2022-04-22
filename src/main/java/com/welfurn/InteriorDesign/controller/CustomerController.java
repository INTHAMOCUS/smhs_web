package com.welfurn.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.welfurn.InteriorDesign.dao.ScmInputDao;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/getSCMForCustomer",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<ShutterCoreMaterial> getSCMforCustomer(ScmInputDao scmInputDao) throws Exception
	{
		return customerService.getSCMforCustomer(scmInputDao.getBaseCategory());
	}
	
	

}
