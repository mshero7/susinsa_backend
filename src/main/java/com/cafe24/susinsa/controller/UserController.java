package com.cafe24.susinsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping( {"/user"} )
	public String main() {
		return "main/index";
	}
}
