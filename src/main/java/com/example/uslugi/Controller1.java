package com.example.uslugi;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Serwis;

@RestController
@RequestMapping("/controler")
public class Controller1 {
	
	@Autowired
	Serwis mojSerwis;
	
	@RequestMapping("/get")
	public String nasluchuj(){
		String result = mojSerwis.pobierz();
		return result; 
	}
	
}
