package com.example.d.n.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.d.n.models.Dojo;
import com.example.d.n.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
