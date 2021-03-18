package com.tts.myExoticCarShop.Tesla;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/tesla")
public class TeslaController {
	
private final TeslaService teslaService;
	
	@Autowired
	public TeslaController(TeslaService teslaService) {
		this.teslaService = teslaService;
	}
	
	@GetMapping
	public List <Tesla> getTesla() {
		 return teslaService.getTesla();
		
		   
	  
	}
	
}



