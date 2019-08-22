package com.doc.medico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicoRestController {

	@RequestMapping( value= "/Medico-0.0.1-SNAPSHOT.war")
	public String getGreetings() {
		
		return "hello";
	}

	
	@RequestMapping( value= "")
	public String getHome() {
		
		return "home";
	}
}
