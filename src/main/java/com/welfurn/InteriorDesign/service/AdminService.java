package com.welfurn.InteriorDesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Size;

@Service
public interface AdminService {
	
	
	public List<Layout> showLayoutData();
	public String insertLayout(String layout_name);
	public String updateLayout(Integer id,String layout_name);
	public String deleteLayout(Integer id);
	
	public String deleteCCM(Integer id);
	
	public List<CabinetCoreMaterial> showCCMData();
	public List<ShutterCoreMaterial> showSCMData();
	public String InsertCCM(String ccmName);
	public String InsertSCM(String scmName, float scmPrice,String baseCategory);
	public String UpdateSCMPrice(Integer scmId,String scmName, float scmPrice);
	public String UpdateCCMName(Integer ccmId,String ccmName);
	public String UpdateSCMName(Integer scmId,String scmName);
	public String UpdateSCMBaseCategory(Integer scmId,String scmName, String basecategory);
	
	public String deleteSCM(Integer id);
	
	public String saveSize(String typeSize,String baseCategory,String sqft,float price);
	public List<Size> getSize(String baseCategory);
	public String updateSizeTypeSize(Integer id,String typeSize);
	public String updateSizeBaseCategory(Integer id,String baseCategory);
	public String updateSizeSqft(Integer id,String sqft);
	public String updateSizePrice(Integer id,float price);
	
	public String deleteSize(Integer id);
	
}
