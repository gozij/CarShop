package com.tts.myExoticCarShop.cadillac;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/cadillac")
public class CadillacController {
	
private final CadillacService cadillacService;
	
	@Autowired
	public CadillacController(CadillacService cadillacService) {
		this.cadillacService = cadillacService;
	}
	
	@GetMapping
	public List <Cadillac> getCadillac() {
		 return cadillacService.getCadillac();
		
		   
	   }

}






