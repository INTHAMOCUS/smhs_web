package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.Accessories;
import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Sizing;
import com.welfurn.InteriorDesign.exception.ValidationException;

@Service
public interface AdminService {
	
	
	public List<Layout> showLayoutData();
	public String insertLayout(String layout_name);
	public String updateLayout(Integer id,String layout_name) throws Exception;
	public String deleteLayout(Integer id) throws Exception;
	
	public String deleteCCM(Integer id)  throws Exception;
	
	public List<CabinetCoreMaterial> showCCMData();
	public List<ShutterCoreMaterial> showSCMData();
	public String InsertCCM(String ccmName);
	public String InsertSCM(String scmName, float scmPrice,String baseCategory);
	public String UpdateSCM(Integer scmId,String scmName, float scmPrice,String basecategory) throws Exception,ValidationException;
	public String UpdateCCMName(Integer ccmId,String ccmName) throws Exception;	
	public String deleteSCM(Integer id) throws Exception;
	
	public String saveSize(String ccmName,String cabinetType,String width,String height,String depth,float price);
	public List<Sizing> getSize(String ccmName);
	public String updateSize(Integer id,String ccmName,String cabinetType,String width,String height,String depth,float price) throws Exception,ValidationException;
	
	public String deleteSize(Integer id) throws Exception;
	
	public String saveAccessories(String cabinetType, String cabinetDesc, String width,String accessoriesType);
	
	public List<Accessories> getAccessories(String cabinetType);
	
	public String updateAccessories(Integer id,String cabinetType, String cabinetDesc, String width,String accessoriesType) throws Exception,ValidationException;
	
	public String deleteAccessories(Integer id) throws Exception;
	
	
}
