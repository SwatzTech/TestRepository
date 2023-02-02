package com.springtest.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
