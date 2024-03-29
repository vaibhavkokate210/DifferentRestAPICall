package com.bridgelabz.restcall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.restcall.model.User;

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
	
	@PostMapping("/post")
	public String hello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName()+"!";
	}
	
	@PutMapping("/put/{firstName}")
	public String diffCalls(@PathVariable("firstName") String firstName,@RequestParam("lastName") String lastName) {
		System.out.println("hi");
		return "Hi "+firstName+" " +lastName + ", Hello From Bridgelabz";

	}
}
