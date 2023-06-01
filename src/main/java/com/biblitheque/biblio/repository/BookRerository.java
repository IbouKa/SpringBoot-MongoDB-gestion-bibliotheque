package com.biblitheque.biblio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.biblitheque.biblio.model.Book;

@Repository
public interface  BookRerository extends MongoRepository<Book,Integer> {
    
}
