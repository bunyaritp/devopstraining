package com.kbank.devopstraining.toystore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbank.devopstraining.toystore.model.Hello;

@RestController
public class HelloController {

	@GetMapping("sayHi/{name}")
	public String sayHi(@PathVariable String name) {
		return String.format("Hi: %s", name);
	}
	
	@GetMapping("sayHiJson/{name}")
	public Hello sayHiJson(@PathVariable String name) {
		return new Hello(name);
	}

	
}
