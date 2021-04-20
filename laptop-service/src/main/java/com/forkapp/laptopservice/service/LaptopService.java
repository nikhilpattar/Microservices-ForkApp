package com.forkapp.laptopservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forkapp.laptopservice.model.Laptop;
import com.forkapp.laptopservice.repository.LaptopRepository;

@Service
public class LaptopService 
{
	@Autowired
	private LaptopRepository laptopRepository;
	
	public List<Laptop> getLaptopsFromDb(){
		return laptopRepository.findAll();
	}
	
	public Laptop getLatopByIdFromDb(int id) {
		Laptop laptop = null;
		
		Optional<Laptop> op = laptopRepository.findById(id);
		if(op.isPresent()) {
			laptop = op.get();
		}
		return laptop;
	}
	
	public String addLaptopToDb(Laptop laptop) {
		laptopRepository.save(laptop);
		return "Laptop with Id: "+laptop.getId()+" addedd successfully";
	}
}
