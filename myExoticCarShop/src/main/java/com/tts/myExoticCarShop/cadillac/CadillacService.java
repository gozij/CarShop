package com.tts.myExoticCarShop.cadillac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadillacService {
	
private final CadillacRepository cadillacRepository;
	
	@Autowired
	public CadillacService(CadillacRepository cadillacRepository ) {
		this.cadillacRepository = cadillacRepository;
	}
	
	 public List<Cadillac> getCadillac() {
	     return cadillacRepository.findAll();
	     
	//public void addNewSclass(Sclass sclass) {
		//Optional<Sclass> sclassOptional = SclassRepository
				//.findSclassByModel(sclass.getModel());
	}
			   
		   }






