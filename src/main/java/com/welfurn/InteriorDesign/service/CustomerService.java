package com.welfurn.InteriorDesign.service;

import java.util.List;

import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;

public interface CustomerService {
	
	public List<ShutterCoreMaterial> getSCMforCustomer(String basecategory) throws Exception;

}
