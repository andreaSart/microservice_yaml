package com.example.prova_minikube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRest {

	@GetMapping("/first")
	public String first() {
		return "first";
	}
	
}
