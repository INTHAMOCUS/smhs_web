package com.welfurn.InteriorDesign.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welfurn.InteriorDesign.dao.CcmDao;
import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Size;
import com.welfurn.InteriorDesign.exception.ValidationException;
import com.welfurn.InteriorDesign.repository.CabinetCoreMaterialRepository;
import com.welfurn.InteriorDesign.repository.LayoutRepository;
import com.welfurn.InteriorDesign.repository.ShutterCoreMaterialRepository;
import com.welfurn.InteriorDesign.repository.SizeRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	CabinetCoreMaterialRepository cabinetCoreMaterialRepository;
	
	@Autowired
	ShutterCoreMaterialRepository shutterCoreMaterialRepository;
	
	@Autowired
	LayoutRepository layoutRepository;
	
	@Autowired
	SizeRepository sizeRepository;

	public List<Layout> showLayoutData()
	{
		return layoutRepository.findAll();
	}
	
	public String insertLayout(String layout_name)
	{
		Layout layout=new Layout();
		layout.setLayoutName(layout_name);
		layout.setDtCreatedOn(LocalDateTime.now());
		layoutRepository.save(layout);
		return "Saved successfully";
	}
	
	public String updateLayout(Integer id,String layout_name) throws Exception
	{
		
		Layout layout=layoutRepository.findlayout(id);
		if(layout==null)
		{
			throw new Exception("Id value not present in database");
		}
		layoutRepository.updateLayoutName(id, layout_name);
		return "Updated successfully";
	}
	
	public String deleteLayout(Integer id) throws Exception
	{
		Layout layout=layoutRepository.findlayout(id);
		if(layout==null)
		{
			throw new Exception("Id value not present in database");
		}
		layoutRepository.deleteLayout(id);
		return "Deleted successfully";
	}
	
	public String deleteCCM(Integer id) throws Exception
	{
		CabinetCoreMaterial ccm=cabinetCoreMaterialRepository.findCCM(id);
		if(ccm==null)
		{
			throw new Exception("Id value not present in database");
		}
		cabinetCoreMaterialRepository.deleteCCM(id);
		return "Deleted Successfully";
	}
	
	
	public List<CabinetCoreMaterial> showCCMData()
	{
		List<CabinetCoreMaterial> ccmlst=cabinetCoreMaterialRepository.findAll();
		return ccmlst;
	}
	
	public List<ShutterCoreMaterial> showSCMData()
	{
		List<ShutterCoreMaterial> scmlst=shutterCoreMaterialRepository.findAll();
		return scmlst;
	}

	@Override
	public String InsertCCM(String ccmName) {
		
		CabinetCoreMaterial cabinetCoreMaterial=new CabinetCoreMaterial();
		cabinetCoreMaterial.setCcmName(ccmName);
		cabinetCoreMaterial.setDtCreatedOn(LocalDateTime.now());
		cabinetCoreMaterialRepository.save(cabinetCoreMaterial);
		return "Saved successfully";
	}
	@Override
	public String InsertSCM(String scmName, float scmPrice,String baseCategory)
	{
		ShutterCoreMaterial shutterCoreMaterial=new ShutterCoreMaterial();
		shutterCoreMaterial.setScmName(scmName);
		shutterCoreMaterial.setScmPrice(scmPrice);
		shutterCoreMaterial.setBaseCategory(baseCategory);
		shutterCoreMaterial.setDtCreatedOn(LocalDateTime.now());
		shutterCoreMaterialRepository.save(shutterCoreMaterial);
		return "Saved successfully";
	}
	
	@Override
	public String UpdateSCM(Integer scmId,String scmName, float scmPrice,String basecategory) throws Exception,ValidationException
	{
		ShutterCoreMaterial scm=shutterCoreMaterialRepository.findSCM(scmId);
		if(scm==null)
		{
			throw new Exception("Id value not present in database");
		}
		if(scmId==null || scmName==null || basecategory==null  )
		{
			throw new ValidationException();
		}
		shutterCoreMaterialRepository.updateSCM(scmId, scmName, scmPrice,basecategory);
		return "Updated successfully";
	}

	@Override
	public String UpdateCCMName(Integer ccmId, String ccmName) throws Exception {
		CabinetCoreMaterial ccm=cabinetCoreMaterialRepository.findCCM(ccmId);
		if(ccm==null)
		{
			throw new Exception("Id value not present in database");
		}
		cabinetCoreMaterialRepository.updateCCMName(ccmId, ccmName);
		return "Updated Successfully";
	}

	
	public String deleteSCM(Integer id) throws Exception
	{
		ShutterCoreMaterial scm=shutterCoreMaterialRepository.findSCM(id);
		if(scm==null)
		{
			throw new Exception("Id value not present in database");
		}
		shutterCoreMaterialRepository.deleteSCM(id);
		return "Deleted Sucessfully";
	}
	
	
	public String saveSize(String typeSize,String baseCategory,String sqft,float price)
	{
		Size size=new Size();
		size.setPrice(price);
		size.setBaseCategory(baseCategory);
		size.setSqft(sqft);
		size.setTypeSize(typeSize);
		size.setDtCreatedOn(LocalDateTime.now());
		sizeRepository.save(size);
		return "Saved successfully";
	}
	
	public List<Size> getSize(String baseCategory)
	{
		return sizeRepository.getSize(baseCategory);
	}

	public String updateSize(Integer id,String typeSize,String baseCategory,String sqft,float price) throws Exception,ValidationException
	{
		Size size=sizeRepository.findSize(id);
		if(size==null)
		{
			throw new Exception("Id value not present in database");
		}
		if(id==null||typeSize==null||baseCategory==null||sqft==null)
		{
			throw new ValidationException();
		}
		sizeRepository.updateSize(id, typeSize, baseCategory, sqft, price);
		return "Updated Successfully";
	}
	
	
	
	
	@Override
	public String deleteSize(Integer id) throws Exception {
		Size size=sizeRepository.findSize(id);
		if(size==null)
		{
			throw new Exception("Id value not present in database");
		}
		sizeRepository.deleteSize(id);
		return "Deleted Successfully";
	}
	
	
}
