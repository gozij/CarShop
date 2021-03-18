package com.tts.myExoticCarShop.cadillac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class CadillacConfiguration implements CommandLineRunner {

	//@Bean
	//CommandLineRunner commandLineRunner(
			//CadillacRepository repository) {
	
		//return args -> {
	
	
	@Autowired
	CadillacRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Adding Cadillac...");
		
		Cadillac sportCT5  = new Cadillac(
					 1L, 
					"sport", 
					2021,
					0, 
					"$42,000 ");
			
			Cadillac VsportXT5 = new Cadillac(
				2L, "Vsport",  2020, 0, "$50,000");

	
			
	repository.saveAll(
			List.of(sportCT5, VsportXT5)
			);
	
			
	};
	}



