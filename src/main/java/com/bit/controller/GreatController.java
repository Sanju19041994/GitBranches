package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreatController {

	@GetMapping("/great")
	public String greatController() {
		String msg = "Good Morning";
		return msg;
	}
}
