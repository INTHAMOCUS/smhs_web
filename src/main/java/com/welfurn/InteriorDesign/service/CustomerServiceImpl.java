package com.welfurn.InteriorDesign.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.dao.IntermediateData;
import com.welfurn.InteriorDesign.entity.SessionIntermediateData;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.repository.CabinetCoreMaterialRepository;
import com.welfurn.InteriorDesign.repository.SessionIntermediateDataRepository;
import com.welfurn.InteriorDesign.repository.ShutterCoreMaterialRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	ShutterCoreMaterialRepository shutterCoreMaterialRepository;
	
	@Autowired
	CabinetCoreMaterialRepository cabinetCoreMaterialRepository;
	
	@Autowired
	SessionIntermediateDataRepository sessionIntermediateDataRepository;

	@Override
	public List<ShutterCoreMaterial> getSCMforCustomer(String basecategory) throws Exception {
		
		
		List<ShutterCoreMaterial> finallist = new ArrayList<ShutterCoreMaterial>();		
		List<ShutterCoreMaterial> scmList=shutterCoreMaterialRepository.getSCMforCustomer();
		
		for(ShutterCoreMaterial s:scmList)
		{
			String temp[]=s.getBaseCategory().split(",");
			
			for(int i=0;i<temp.length;i++)
			{
				if(temp[i].strip().equalsIgnoreCase(basecategory))
				{
					finallist.add(s);
				}
			}
			
		}
		
		if(finallist.size()==0)
		{
			throw new Exception("Base category is not present in table. Kindly check the base category passed");
		}
		
		return finallist;
		
	}
	
	public String saveIntermediateData(IntermediateData intermediateData) throws Exception
	{
		SessionIntermediateData sessionIntermediateData=new SessionIntermediateData();
		sessionIntermediateData.setCcmSelected(intermediateData.getCcm_selected());
		sessionIntermediateData.setCustomerId(intermediateData.getCustomer_id());
		sessionIntermediateData.setLayoutSelected(intermediateData.getLayout_selected());
		sessionIntermediateData.setScmSelected(intermediateData.getScm_selected());
		sessionIntermediateData.setSizeSelected(intermediateData.getSize_selected());
		sessionIntermediateDataRepository.save(sessionIntermediateData);
		return "Saved Successfully";
	}
	
	public List<SessionIntermediateData> getIntermediateData(Integer customer_id) throws Exception
	{
		return sessionIntermediateDataRepository.findintData(customer_id);
	}
	
	public String deleteIntermediateData(Integer id) throws Exception
	{
		sessionIntermediateDataRepository.deleteIntData(id);
		return "Deleted Successfully";
		
	}
	
//	public String updateIntermediateData(Integer id,String layoutSelected, String ccmSelected,String scmSelected, String sizeSelected) throws Exception
//	{
//		sessionIntermediateDataRepository.updateIntData(id,layoutSelected,ccmSelected,scmSelected,layoutSelected);
//		return "Updated Successfully";
//		
//	}
}
