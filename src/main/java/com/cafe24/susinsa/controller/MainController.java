package com.cafe24.susinsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping( {"/", "/main"} )
	public String main() {
		return "main/index";
	}
}
