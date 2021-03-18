package com.tts.myExoticCarShop.mercedez;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class MercedezConfiguration implements CommandLineRunner {
	
	//@Bean
	//CommandLineRunner commandLineRunner(
			//MercedezRepository repository) {
	
		//return args -> {
	
	@Autowired
	MercedezRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Adding Mercedez...");
			Mercedez Sclass = new Mercedez(
					 1L, 
					"S-Class", 
					2021,
					0, 
					"$173,000 ");
			
			Mercedez Cclass= new Mercedez(
				2L, "C-class",  2020, 0, "$100,000");

	
			
	repository.saveAll(
			List.of(Sclass, Cclass)
			);
	
			
	};
	}




