package com.example.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bookclub.models.BookClub;


@Repository
public interface BookRepository extends CrudRepository<BookClub, Long> {

	List<BookClub> findAll();
 
}