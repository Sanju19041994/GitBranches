package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

	@GetMapping("/welcome")
	public String welcom() {
		String msg = "Welcome to controller page";
		return "msg";
	}
}
