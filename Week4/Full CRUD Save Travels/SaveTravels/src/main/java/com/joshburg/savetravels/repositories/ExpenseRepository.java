package com.joshburg.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.joshburg.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

	List<Expense> findAll();
	List<Expense> findByDescriptionContaining(String search);
}
