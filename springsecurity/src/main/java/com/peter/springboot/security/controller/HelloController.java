package com.peter.springboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hollo World!";
	}
	@GetMapping("/user")
	public String user() {
		return "Hollo user!";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Hollo admin!";
	}
}