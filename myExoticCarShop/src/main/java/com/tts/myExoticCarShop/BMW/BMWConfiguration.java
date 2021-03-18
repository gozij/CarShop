package com.tts.myExoticCarShop.BMW;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
public class BMWConfiguration implements CommandLineRunner {
	
	@Autowired
	BMWRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Adding BMWs...");
		BMW bmwX5 = new BMW(
				 1L, 
				"X5", 
				2021,
				0, 
				"$60,000 ");
		
		BMW bmwX3= new BMW(
				2L, "X3",  2021, 0, "$84,309");
		
		
		repository.saveAll(
				List.of(bmwX5, bmwX3)
				);

		
	}
	}
