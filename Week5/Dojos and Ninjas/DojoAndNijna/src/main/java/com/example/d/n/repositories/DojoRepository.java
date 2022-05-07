package com.example.d.n.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.d.n.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();

}
