package com.forkapp.laptopservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forkapp.laptopservice.model.Laptop;
import com.forkapp.laptopservice.service.LaptopService;

@RestController
public class LaptopController 
{
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("laptops")
	public List<Laptop> getLaptops(){
		return laptopService.getLaptopsFromDb();
	}
	
	@PostMapping("laptops")
	public String addLaptop(@RequestBody Laptop laptop) {
		return laptopService.addLaptopToDb(laptop);
	}
	
	@GetMapping("laptops/{id}")
	public Laptop getLaptopById(@PathVariable int id) {
		return laptopService.getLatopByIdFromDb(id);
	}
}
