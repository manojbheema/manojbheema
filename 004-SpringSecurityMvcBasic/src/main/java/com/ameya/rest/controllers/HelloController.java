package com.ameya.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public String rootURL() {
		return "This is authorized but permitted to all";
	}
	@GetMapping
	@RequestMapping("/rest/hello")
	public String hello() {
		return "Hello All !!! This is authorized and permitted only to role USER";
	}
}
