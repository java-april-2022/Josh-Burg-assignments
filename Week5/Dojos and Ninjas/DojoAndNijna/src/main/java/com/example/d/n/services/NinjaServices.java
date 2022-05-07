package com.example.d.n.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.d.n.models.Dojo;
import com.example.d.n.models.Ninja;
import com.example.d.n.repositories.NinjaRepository;


@Service
public class NinjaServices {

	private final NinjaRepository repository;

	public NinjaServices(NinjaRepository repository) {
		this.repository = repository;
	}
		
	public List<Ninja> all() {
		return repository.findAll();	
	}
		
	public Ninja create(Ninja ninja) {
		return repository.save(ninja);
	}
		
	public Ninja find(Long id) {
		Optional<Ninja> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
			}
	}
	
	public List<Ninja> byDojo(Dojo dojo){
		return repository.findAllByDojo(dojo);
	}
	
}

