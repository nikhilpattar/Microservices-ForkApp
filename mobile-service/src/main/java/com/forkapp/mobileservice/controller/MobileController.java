package com.forkapp.mobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forkapp.mobileservice.model.Mobile;
import com.forkapp.mobileservice.service.MobileService;

@RestController
public class MobileController 
{
	@Autowired
	private MobileService mobileService;
	
	@GetMapping("mobiles")
	public List<Mobile> getMobiles(){
		return mobileService.getMobilesFromDb();
	}
	
	@PostMapping("mobiles")
	public String addMobile(@RequestBody Mobile mobile) {
		return mobileService.addMobileToDb(mobile);
	}
	
	@GetMapping("mobiles/{id}")
	public Mobile getMobileById(@PathVariable int id) {
		return mobileService.getMobileByIdFromDb(id);
	}
}
