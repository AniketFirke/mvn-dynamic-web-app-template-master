package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example {

	@RequestMapping("/hi")
	public String getHello(){
		return "hello";
	}
}
