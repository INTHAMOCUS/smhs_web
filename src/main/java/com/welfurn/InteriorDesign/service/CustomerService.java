package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.dao.CustomerDetailsDao;
import com.welfurn.InteriorDesign.dao.IntermediateData;
import com.welfurn.InteriorDesign.entity.SessionIntermediateData;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
@Service
public interface CustomerService {
	
	public List<ShutterCoreMaterial> getSCMforCustomer(String basecategory) throws Exception;
	
	public String saveIntermediateData(IntermediateData intermediateData) throws Exception;
	
	public List<SessionIntermediateData> getIntermediateData(Integer customer_id) throws Exception;
	
	public String deleteIntermediateData(Integer id) throws Exception;
	
	public String saveCustomerDetails(CustomerDetailsDao customerDetailsDao) throws Exception;

}
