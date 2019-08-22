package com.doc.medico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicoRestController {

	@RequestMapping( value= "/hello")
	public String getGreetings() {
		
		return "hello";
	}

	
	@RequestMapping( value= "")
	public String getHome() {
		
		return "home";
	}
}
