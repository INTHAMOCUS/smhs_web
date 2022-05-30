package com.welfurn.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.welfurn.InteriorDesign.dao.AccessoriesDao;
import com.welfurn.InteriorDesign.dao.AdminResponse;
import com.welfurn.InteriorDesign.dao.CcmInputDao;
import com.welfurn.InteriorDesign.dao.CcmUpdateInputDao;
import com.welfurn.InteriorDesign.dao.LayoutInputDao;
import com.welfurn.InteriorDesign.dao.ScmInputDao;
import com.welfurn.InteriorDesign.dao.ScmUpdateInputDao;
import com.welfurn.InteriorDesign.dao.SizingDao;
import com.welfurn.InteriorDesign.entity.Accessories;
import com.welfurn.InteriorDesign.entity.CabinetCoreMaterial;
import com.welfurn.InteriorDesign.entity.Layout;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.entity.Sizing;
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
	public ResponseEntity<Object> saveLayout(@RequestBody LayoutInputDao layoutInputDao)
	{
		
		String output=adminService.insertLayout(layoutInputDao.getLayoutName());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/updateLayout",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateLayout(@RequestBody LayoutInputDao layoutInputDao) throws Exception
	{
		
		String output= adminService.updateLayout(layoutInputDao.getId(), layoutInputDao.getLayoutName());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}


	@RequestMapping(value="/deleteLayout",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteLayout(@RequestBody LayoutInputDao layoutInputDao) throws Exception
	{
		
		String output= adminService.deleteLayout(layoutInputDao.getId());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/getCCM",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabinetCoreMaterial> getCCM()
	{
		return adminService.showCCMData();
	}
	
	@RequestMapping(value="/saveCCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveCCM(@RequestBody CcmInputDao ccmInputDao)
	{
		
		String output= adminService.InsertCCM(ccmInputDao.getCcmName());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/updateCCMName",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateCCMName(@RequestBody CcmUpdateInputDao ccmUpdateInputDao) throws Exception
	{
		String output= adminService.UpdateCCMName(ccmUpdateInputDao.getId(), ccmUpdateInputDao.getCcmName());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/deleteCCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteCCM(@RequestBody CcmUpdateInputDao ccmUpdateInputDao) throws Exception
	{
		
		String output= adminService.deleteCCM(ccmUpdateInputDao.getId());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
		
	
	@RequestMapping(value="/getSCM",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ShutterCoreMaterial> getSCM()
	{
		return adminService.showSCMData();
	}
	
	
	@RequestMapping(value="/saveSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Object> saveSCM(@RequestBody ScmInputDao scmInputDao)
	{
		
		String output= adminService.InsertSCM(scmInputDao.getScmName(), scmInputDao.getScmPrice(),scmInputDao.getBaseCategory());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/updateSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateSCMPrice(@RequestBody ScmUpdateInputDao scmUpdateInputDao) throws Exception
	{
		String output= adminService.UpdateSCM(scmUpdateInputDao.getId(), scmUpdateInputDao.getScmName(), scmUpdateInputDao.getScmPrice(),scmUpdateInputDao.getBaseCategory());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/deleteSCM",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteSCM(@RequestBody ScmUpdateInputDao scmUpdateInputDao) throws Exception
	{
		
		String output= adminService.deleteSCM(scmUpdateInputDao.getId());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/getSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Sizing> getSize(@RequestBody SizingDao sizeDao)
	{
		return adminService.getSize(sizeDao.getCcmName());
	}
	
	
	@RequestMapping(value="/saveSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveSize(@RequestBody SizingDao sizeDao)
	{
		
		String output= adminService.saveSize(sizeDao.getCcmName(),sizeDao.getCabinetType(),sizeDao.getWidth(),sizeDao.getHeight(),sizeDao.getDepth(),sizeDao.getPrice());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/updateSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateSizeTypeSize(@RequestBody SizingDao sizeDao) throws Exception,ValidationException
	{
		String output= adminService.updateSize(sizeDao.getId(),sizeDao.getCcmName(),sizeDao.getCabinetType(),sizeDao.getWidth(),sizeDao.getHeight(),sizeDao.getDepth(),sizeDao.getPrice());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/deleteSize",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteSize(@RequestBody SizingDao sizeDao) throws Exception
	{
		
		String output= adminService.deleteSize(sizeDao.getId());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	
	
	@RequestMapping(value="/getAccessories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Accessories> getSize(@RequestBody AccessoriesDao accessoriesDao)
	{
		return adminService.getAccessories(accessoriesDao.getCabinetType());
	}
	
	
	@RequestMapping(value="/saveAccessories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveAccessories(@RequestBody AccessoriesDao accessoriesDao)
	{
		
		String output= adminService.saveAccessories(accessoriesDao.getCabinetType(), accessoriesDao.getCabinetDesc(), accessoriesDao.getWidth(), accessoriesDao.getAccessoriesType());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/updateAccessories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateAccessories(@RequestBody AccessoriesDao accessoriesDao) throws Exception,ValidationException
	{
		String output= adminService.updateAccessories(accessoriesDao.getId(), accessoriesDao.getCabinetType(), accessoriesDao.getCabinetDesc(), accessoriesDao.getWidth(), accessoriesDao.getAccessoriesType());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/deleteAccessories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteAccessories(@RequestBody AccessoriesDao accessoriesDao) throws Exception
	{
		
		String output= adminService.deleteAccessories(accessoriesDao.getId());
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setOutput(output);
		ResponseEntity<Object> entity = new ResponseEntity<>(adminResponse,HttpStatus.OK);
		return entity;
	}
	
	

}
