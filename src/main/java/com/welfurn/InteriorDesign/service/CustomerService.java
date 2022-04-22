package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
@Service
public interface CustomerService {
	
	public List<ShutterCoreMaterial> getSCMforCustomer(String basecategory) throws Exception;

}
