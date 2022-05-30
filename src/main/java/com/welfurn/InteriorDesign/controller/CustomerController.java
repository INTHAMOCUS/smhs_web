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

import com.welfurn.InteriorDesign.dao.CustomerDetailsDao;
import com.welfurn.InteriorDesign.dao.CustomerResponse;
import com.welfurn.InteriorDesign.dao.IntermediateData;
import com.welfurn.InteriorDesign.dao.ScmInputDao;
import com.welfurn.InteriorDesign.entity.SessionIntermediateData;
import com.welfurn.InteriorDesign.entity.ShutterCoreMaterial;
import com.welfurn.InteriorDesign.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/saveCustomerDetails",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> setIntermediateData(@RequestBody CustomerDetailsDao customerDetailsDao) throws Exception 
	{
		String response;
		try {
			response = customerService.saveCustomerDetails(customerDetailsDao);
		} catch (Exception e) {
			throw new Exception("Please check the customerId passed,Its already present in database. Give a unique id");
		}
		CustomerResponse customerResponse=new CustomerResponse();
		customerResponse.setOutput(response);
		ResponseEntity<Object> entity = new ResponseEntity<>(customerResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/getSCMForCustomer",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<ShutterCoreMaterial> getSCMforCustomer(@RequestBody ScmInputDao scmInputDao) throws Exception
	{
		return customerService.getSCMforCustomer(scmInputDao.getBaseCategory());
	}
	
	@RequestMapping(value="/setIntermediateData",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> setIntermediateData(@RequestBody IntermediateData intermediateData) throws Exception
	{
		String response=customerService.saveIntermediateData(intermediateData);
		CustomerResponse customerResponse=new CustomerResponse();
		customerResponse.setOutput(response);
		ResponseEntity<Object> entity = new ResponseEntity<>(customerResponse,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/getIntermediateData",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getIntermediateData(@RequestBody IntermediateData intermediateData) throws Exception
	{
		List<SessionIntermediateData> response=customerService.getIntermediateData(intermediateData.getCustomer_id());
		CustomerResponse customerResponse=new CustomerResponse();
		customerResponse.setOutput(response);
		ResponseEntity<Object> entity = new ResponseEntity<>(customerResponse,HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/deleteIntermediateData",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteIntermediateData(@RequestBody IntermediateData intermediateData) throws Exception
	{
		String response=customerService.deleteIntermediateData(intermediateData.getId());
		CustomerResponse customerResponse=new CustomerResponse();
		customerResponse.setOutput(response);
		ResponseEntity<Object> entity = new ResponseEntity<>(customerResponse,HttpStatus.OK);
		return entity;
	}
	
//	@RequestMapping(value="/updateIntermediateData",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Object> updateIntermediateData(@RequestBody IntermediateData intermediateData) throws Exception
//	{
//		String response=customerService.updateIntermediateData(intermediateData.getId(), intermediateData.getLayout_selected(), intermediateData.getCcm_selected(), intermediateData.getScm_selected(), intermediateData.getSize_selected());
//		CustomerResponse customerResponse=new CustomerResponse();
//		customerResponse.setOutput(response);
//		ResponseEntity<Object> entity = new ResponseEntity<>(customerResponse,HttpStatus.OK);
//		return entity;
//	}
//	
	

}
