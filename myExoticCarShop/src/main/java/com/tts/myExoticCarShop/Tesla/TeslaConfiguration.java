package com.tts.myExoticCarShop.Tesla;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
public class TeslaConfiguration implements CommandLineRunner {
	
	@Autowired
	TeslaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		System.out.println("Adding Tesla...");
			Tesla modelS = new Tesla(
					 1L, 
					"Model s", 
					2021,
					0, 
					"$78,490 ");
			
			Tesla model3 = new Tesla(
				2L, "Model 3",  2020, 0, "$35,000");

	
			
	repository.saveAll(
			List.of(modelS, model3)
			);
	
			
	};
	}







