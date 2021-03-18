package com.tts.myExoticCarShop.mercedez;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mercedez")
public class MercedezController {
	
private final MercedezService mercedezService;
	
	@Autowired
	public MercedezController(MercedezService mercedezService) {
		this.mercedezService = mercedezService;
	}
	
	@GetMapping
	public List <Mercedez> getMercedez() {
		 return mercedezService.getMercedez();
		
    }
	
	@GetMapping("/Style")
	public String Style() {
		return "boostrap.html";
	}
	
}
