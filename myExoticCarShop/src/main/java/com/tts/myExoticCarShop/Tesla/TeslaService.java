package com.tts.myExoticCarShop.Tesla;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TeslaService {
	
private final TeslaRepository teslaRepository;
	
	@Autowired
	public TeslaService(TeslaRepository teslaRepository ) {
		this.teslaRepository = teslaRepository;
	}
	
	 public List<Tesla> getTesla() {
	     return teslaRepository.findAll();
	     
	//public void addNewSclass(Sclass sclass) {
		//Optional<Sclass> sclassOptional = SclassRepository
				//.findSclassByModel(sclass.getModel());
	}
			   
		   }






