package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Size;
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
	
	public String saveSize(String typeSize,String baseCategory,String sqft,float price);
	public List<Size> getSize(String baseCategory);
	public String updateSize(Integer id,String typeSize,String baseCategory,String sqft,float price) throws Exception,ValidationException;
	
	public String deleteSize(Integer id) throws Exception;
	
}
