package com.bridgelabz.restcall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestApiController {
	@RequestMapping(value = {"/",""})
	public String hello() {
		return "Hello From Bridgelabz";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name") String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("/param/{name}")
	public String helloParam(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}
