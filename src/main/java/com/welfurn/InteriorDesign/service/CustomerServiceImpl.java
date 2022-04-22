package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.repository.ShutterCoreMaterialRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	ShutterCoreMaterialRepository shutterCoreMaterialRepository;

	@Override
	public List<ShutterCoreMaterial> getSCMforCustomer(String basecategory) throws Exception {
		
		List<ShutterCoreMaterial> scmList=shutterCoreMaterialRepository.getSCMforCustomer(basecategory);
		if(scmList.size()==0)
		{
			throw new Exception("Base category is not present in table. Kindly check the base category passed");
		}
		return scmList;
		
	}

}
