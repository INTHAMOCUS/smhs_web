package com.welfurn.InteriorDesign.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.repository.CabinetCoreMaterialRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	CabinetCoreMaterialRepository cabinetCoreMaterialRepository;
	

	@Override
	public String InsertCCM(String ccmName, float ccmPrice) {
		
		CabinetCoreMaterial cabinetCoreMaterial=new CabinetCoreMaterial();
		cabinetCoreMaterial.setCcmName(ccmName);
		cabinetCoreMaterial.setCcmPrice(ccmPrice);
		cabinetCoreMaterial.setDtCreatedOn(LocalDateTime.now());
		cabinetCoreMaterialRepository.save(cabinetCoreMaterial);
		return "Saved successfully";
	}
	

}
