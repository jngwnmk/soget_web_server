package com.soget.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.soget.backend.Model.Book;

public interface BookRepository extends MongoRepository<Book,String>{
	public Book findById(Long id);
	
}
