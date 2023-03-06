package com.example.prova_minikube_secondo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondRest {

	@GetMapping("/second")
	public String first() {
		return "second";
	}
	
}
