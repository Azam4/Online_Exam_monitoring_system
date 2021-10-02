package com.azam.Controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControllar {
	
	@GetMapping("/index")
	public String index2() {
		return "/index";
		
	}
	
	/*
	 * @GetMapping("/showquiz") public String showquiz() { return "/quiz/showquiz";
	 * 
	 * }
	 */
	
	@GetMapping("/login")
	public String login() {
		return "/login/login";
		
	}
	
	@GetMapping("/loafter")
	public String after() {
		return "/user/ulogafter";
		
	}
	
	
	@GetMapping("/result")
	public String result() {
		return "/user/result";
		
	}
	
	@GetMapping("/")
	public String firstpage() {
		return "/firstpage";

}
}
