package com.example.service;

import javax.json.Json;
import javax.json.JsonObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Klient;
import com.example.domain.KlientRepository;
import com.example.uslugi.Controller1;

@Component
public class serwis {
	
	@Autowired
	KlientRepository repozytoriumKlientow;
	
	Log log = LogFactory.getLog(Controller1.class);
	
	public String pobierz(){
		Klient janek = repozytoriumKlientow.findById(new Long(0));
		
		JsonObject json = Json.createObjectBuilder().add("name", Klient.getNazwisko().toString()).add("surname", "cos").build();
		json.toString();
		log.info("\n-------------------------info--------------------------------");
		log.info("\n-----"+janek.toString()+"-----");
		return json.toString();
	}

}
