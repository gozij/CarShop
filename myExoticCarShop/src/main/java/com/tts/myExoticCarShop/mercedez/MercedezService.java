package com.tts.myExoticCarShop.mercedez;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;
@Service
public class MercedezService {
	
private final MercedezRepository mercedezRepository;
	
	@Autowired
	public MercedezService(MercedezRepository mercedezRepository ) {
		this.mercedezRepository = mercedezRepository;
	}
	
	 public List<Mercedez> getMercedez() {
	     return mercedezRepository.findAll();
	     
	//public void addNewSclass(Sclass sclass) {
		//Optional<Sclass> sclassOptional = SclassRepository
				//.findSclassByModel(sclass.getModel());
	}
			   
		   }



