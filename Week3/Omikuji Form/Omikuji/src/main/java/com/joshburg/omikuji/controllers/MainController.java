package com.joshburg.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	private String index() {
		return "redirect:/omikuji";
	}
		
	@GetMapping("/omikuji")
	private String omikuji() {
		return "omikuji.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("fortunes");
		model.addAttribute("result", result);
		return "omikujiShow.jsp";
	}
	
	@PostMapping("/formData")
	public String data(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby")String hobby,
			@RequestParam("thing")String thing,
			@RequestParam("statement")String statement,
			HttpSession session) {
		
		String fortunes = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, hobby, thing, statement);
		
		session.setAttribute("fortunes", fortunes);
		return "redirect:/omikuji/show";
	}
	
	
	
}
