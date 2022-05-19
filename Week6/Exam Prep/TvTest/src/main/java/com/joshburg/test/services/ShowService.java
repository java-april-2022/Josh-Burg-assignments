package com.joshburg.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joshburg.test.models.Show;
import com.joshburg.test.repositories.ShowRepository;

@Service
public class ShowService {

	@Autowired
	private ShowRepository repository;
	
	public Show findById(Long id) {
		Optional<Show> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public List<Show> all() {
		return repository.findAll();
	}
	
	public Show create(Show show) {
		return repository.save(show);
	}
	
	public Show update(Show show) {
		return repository.save(show);
	}
	
	public void delete(Show show) {
		repository.delete(show);
	}
	
}
