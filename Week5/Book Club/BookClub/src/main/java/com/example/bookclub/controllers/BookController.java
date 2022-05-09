package com.example.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookclub.models.BookClub;
import com.example.bookclub.models.User;
import com.example.bookclub.services.BookService;
import com.example.bookclub.services.UserService;

@Controller
public class BookController {

	@Autowired
	private UserService users;
	@Autowired
	private BookService books;
	
	
	@GetMapping("/add")
	public String addBook(@ModelAttribute("book") BookClub book, Model model, HttpSession session) {
		User user = users.findById((Long) session.getAttribute("userId" ));
		model.addAttribute("user", user); 
		return "addBook.jsp";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute("book") BookClub book, Model model, BindingResult result) {
		if ( result.hasErrors() ) {
			return "addBook.jsp";
		}
		books.create(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books")
    public String home(Model model, HttpSession session) {
    	
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	
    	model.addAttribute("book", books.all());
		model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
		return "dashboard.jsp";
   }
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		if ( session.getAttribute("usreId") == null ) {
			return "redirect:/";
		}
		BookClub book = books.findById(id);
		model.addAttribute("book", book);
		model.addAttribute("user", users.findById((Long)session.getAttribute("userId")) );
		
		return "showbook.jsp";
	}

	
}
