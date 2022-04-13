package com.welfurn.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.welfurn.InteriorDesign.dao.CcmInputDao;
import com.welfurn.InteriorDesign.dao.CcmUpdateInputDao;
import com.welfurn.InteriorDesign.dao.LayoutInputDao;
import com.welfurn.InteriorDesign.dao.ScmInputDao;
import com.welfurn.InteriorDesign.dao.ScmUpdateInputDao;
import com.welfurn.InteriorDesign.dao.SizeDao;
import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Size;
import com.welfurn.InteriorDesign.exception.ValidationException;
import com.welfurn.InteriorDesign.service.AdminService;
@CrossOrigin
@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@RequestMapping(value="/getLayout",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Layout> getLayout()
	{
		return adminService.showLayoutData();
	}
	
	@RequestMapping(value="/saveLayout",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveLayout(@RequestBody LayoutInputDao layoutInputDao)
	{
		
		return adminService.insertLayout(layoutInputDao.getLayoutName());
	}
	
	@RequestMapping(value="/updateLayout",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updateLayout(@RequestBody LayoutInputDao layoutInputDao) throws Exception
	{
		
		return adminService.updateLayout(layoutInputDao.getId(), layoutInputDao.getLayoutName());
	}
	

	@RequestMapping(value="/deleteLayout",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteLayout(@RequestBody LayoutInputDao layoutInputDao) throws Exception
	{
		
		return adminService.deleteLayout(layoutInputDao.getId());
	}
	
	@RequestMapping(value="/getCCM",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabinetCoreMaterial> getCCM()
	{
		return adminService.showCCMData();
	}
	
	@RequestMapping(value="/saveCCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveCCM(@RequestBody CcmInputDao ccmInputDao)
	{
		
		return adminService.InsertCCM(ccmInputDao.getCcmName());		
	}
	
	@RequestMapping(value="/updateCCMName",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updateCCMName(@RequestBody CcmUpdateInputDao ccmUpdateInputDao) throws Exception
	{
		return adminService.UpdateCCMName(ccmUpdateInputDao.getId(), ccmUpdateInputDao.getCcmName());
	}
	
	@RequestMapping(value="/deleteCCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteCCM(@RequestBody CcmUpdateInputDao ccmUpdateInputDao) throws Exception
	{
		
		return adminService.deleteCCM(ccmUpdateInputDao.getId());
	}
		
	
	@RequestMapping(value="/getSCM",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ShutterCoreMaterial> getSCM()
	{
		return adminService.showSCMData();
	}
	
	
	@RequestMapping(value="/saveSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveSCM(@RequestBody ScmInputDao scmInputDao)
	{
		
		return adminService.InsertSCM(scmInputDao.getScmName(), scmInputDao.getScmPrice(),scmInputDao.getBaseCategory());		
	}
	
	@RequestMapping(value="/updateSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updateSCMPrice(@RequestBody ScmUpdateInputDao scmUpdateInputDao) throws Exception
	{
		return adminService.UpdateSCM(scmUpdateInputDao.getId(), scmUpdateInputDao.getScmName(), scmUpdateInputDao.getScmPrice(),scmUpdateInputDao.getBaseCategory());
	}
	
	@RequestMapping(value="/deleteSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteSCM(@RequestBody ScmUpdateInputDao scmUpdateInputDao) throws Exception
	{
		
		return adminService.deleteSCM(scmUpdateInputDao.getId());
	}
	
	
	@RequestMapping(value="/getSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Size> getSize(@RequestBody SizeDao sizeDao)
	{
		return adminService.getSize(sizeDao.getBaseCategory());
	}
	
	
	@RequestMapping(value="/saveSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveSize(@RequestBody SizeDao sizeDao)
	{
		
		return adminService.saveSize(sizeDao.getTypeSize(),sizeDao.getBaseCategory(),sizeDao.getSqft(),sizeDao.getprice());		
	}
	
	@RequestMapping(value="/updateSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updateSizeTypeSize(@RequestBody SizeDao sizeDao) throws Exception,ValidationException
	{
		return adminService.updateSize(sizeDao.getId(), sizeDao.getTypeSize(),sizeDao.getBaseCategory(), sizeDao.getSqft(),sizeDao.getprice());
	}
	
	
	@RequestMapping(value="/deleteSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteSize(@RequestBody SizeDao sizeDao) throws Exception
	{
		
		return adminService.deleteSize(sizeDao.getId());
	}
	
	

}
