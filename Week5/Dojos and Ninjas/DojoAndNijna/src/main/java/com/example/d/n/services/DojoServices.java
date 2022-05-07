package com.example.d.n.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.d.n.models.Dojo;
import com.example.d.n.repositories.DojoRepository;


@Service
public class DojoServices {

	private final DojoRepository repository;

	public DojoServices(DojoRepository repository) {
		this.repository = repository;
	}
	
	public List<Dojo> all() {
		return repository.findAll();	
	}
	
	public Dojo create(Dojo dojo) {
		return repository.save(dojo);
	}
	
	public Dojo find(Long id) {
		Optional<Dojo> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}
	
	
}
