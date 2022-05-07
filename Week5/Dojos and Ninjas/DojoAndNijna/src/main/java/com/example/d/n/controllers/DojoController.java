package com.example.d.n.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.d.n.models.Dojo;
import com.example.d.n.services.DojoServices;


@Controller
public class DojoController {
	
	
	@Autowired
	private DojoServices dojos;
	
	
	@GetMapping("/")
	public String index() {

		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		System.out.println("hi");
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		Dojo newDojo = dojos.create(dojo);
		return String.format("redirect:/dojos/%s", newDojo.getId());
	}
	
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		return "dojo.jsp";
	}
	
}
