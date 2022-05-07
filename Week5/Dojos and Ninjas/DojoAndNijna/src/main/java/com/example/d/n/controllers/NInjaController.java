package com.example.d.n.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.d.n.models.Dojo;
import com.example.d.n.models.Ninja;
import com.example.d.n.services.DojoServices;
import com.example.d.n.services.NinjaServices;

public class NInjaController {

	@Autowired
	private NinjaServices ninjas;
	@Autowired
	private DojoServices dojos;
	
	
	
	@GetMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		List<Dojo> allDojos = this.dojos.all();
		viewModel.addAttribute("allDojos", allDojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/add")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel, BindingResult result) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = this.dojos.all();
			viewModel.addAttribute("allDojos", allDojos);
			return "ninja.jsp";
		}
		Ninja newNinja = ninjas.create(ninja);
		return "redirect:/dojos/" + newNinja.getDojo().getId();
	}
	
	
}
