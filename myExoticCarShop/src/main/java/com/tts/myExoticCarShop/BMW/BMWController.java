package com.tts.myExoticCarShop.BMW;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/bmw")
public class BMWController {
	
private final BMWService bmwService;
	
	@Autowired
	public BMWController(BMWService bmwService) {
		this.bmwService = bmwService;
	}
	
	@GetMapping
	public List <BMW> getBMW() {
		 return bmwService.getBMW();
		
		   
	  
	}
	
}



