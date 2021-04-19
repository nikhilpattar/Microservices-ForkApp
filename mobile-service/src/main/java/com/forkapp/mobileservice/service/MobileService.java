package com.forkapp.mobileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forkapp.mobileservice.model.Mobile;
import com.forkapp.mobileservice.repository.MobileRepository;

@Service
public class MobileService 
{
	@Autowired
	private MobileRepository mobileRepository;
	
	public List<Mobile> getMobilesFromDb(){
		return mobileRepository.findAll();
	}
	
	public Mobile getMobileByIdFromDb(int id) {
		Mobile mobile = null;
		
		Optional<Mobile> op = mobileRepository.findById(id); 
		if(op.isPresent()) {
			mobile = op.get();
		}
		return mobile;
	}
	
	public String addMobileToDb(Mobile mobile) {
		mobileRepository.save(mobile);
		return "Mobile with Id: "+mobile.getmId()+" added successfully";
	}
}
