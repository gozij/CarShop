package com.tts.myExoticCarShop.BMW;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BMWService {
	
private final BMWRepository bmwRepository;
	
	@Autowired
	public BMWService(BMWRepository bmwRepository ) {
		this.bmwRepository = bmwRepository;
	}
	
	 public List<BMW> getBMW() {
	     return bmwRepository.findAll();
	     
	//public void addNewSclass(Sclass sclass) {
		//Optional<Sclass> sclassOptional = SclassRepository
				//.findSclassByModel(sclass.getModel());
	}
			   
		   }






