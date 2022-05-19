package com.joshburg.test.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.joshburg.test.models.LoginUser;
import com.joshburg.test.models.Show;
import com.joshburg.test.models.User;
import com.joshburg.test.services.ShowService;
import com.joshburg.test.services.UserService;

@Controller
public class ShowController {

	@Autowired
	private UserService users;
	@Autowired
	private ShowService shows;
	
	@GetMapping("/show/new")
	public String addShow(@ModelAttribute("show") Show show, Model model, HttpSession session) {
		User user = users.findById((Long) session.getAttribute("userId" ));
		model.addAttribute("user", user); 
		return "new_show.jsp";
	}
	
	@PostMapping("/addShow")
	public String addShow(@ModelAttribute("show") Show show, Model model, BindingResult result) {
		if ( result.hasErrors() ) {
			return "new_show.jsp";
		}
		shows.create(show);
		return "redirect:/shows";
	}
	
	@GetMapping("/shows")
    public String home(Model model, HttpSession session) {
    	
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	
 
    	model.addAttribute("show", shows.all());
		model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
		
		return "shows.jsp";
   }
	
	@GetMapping("/shows/{id}")
	public String showShow(@PathVariable("id") Long id, Model model, HttpSession session) {
		if ( session.getAttribute("userId") == null ) {
			return "redirect:/";
		}
		Show show = shows.findById(id);
		model.addAttribute("show", show);
		model.addAttribute("user", users.findById((Long)session.getAttribute("userId")) );
		
		return "view_show.jsp";
	}

	@GetMapping("/shows/edit/{id}")
	public String edit(@PathVariable("id") Long id, HttpSession session, Model model) {	
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		 
		Show show = shows.findById(id);
		model.addAttribute("show", show);
		return "edit_show.jsp";
	}
	
	@PutMapping("/shows/edit/{id}")
	public String update(
			@PathVariable("id") Long id,
			@Valid @ModelAttribute("show") Show show, 
			BindingResult result, 
			HttpSession session) {	
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		 
		if(result.hasErrors()) {
			return "edit_show.jsp";
		}else {
			shows.update(show);
			return "redirect:/shows";
		}
	}
	
	
	@RequestMapping("/shows/delete/{id}")
	public String delete(@PathVariable("id") Long id, HttpSession session) {
		 
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
    	 
    	shows.delete(shows.findById(id));
    	 
    	return "redirect:/shows";
	}
	
}