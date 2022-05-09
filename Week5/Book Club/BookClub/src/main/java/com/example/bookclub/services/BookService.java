package com.example.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookclub.models.BookClub;
import com.example.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public BookClub findById(Long id) {
		Optional<BookClub> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public List<BookClub> all() {
		return repository.findAll();
	}
	
	public BookClub create(BookClub book) {
		return repository.save(book);
	}
	
	public BookClub update(BookClub book) {
		return repository.save(book);
	}
	
	public void delete(BookClub book) {
		repository.delete(book);
	}
	
}
