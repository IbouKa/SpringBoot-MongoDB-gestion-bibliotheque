package com.biblitheque.biblio.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblitheque.biblio.model.Book;
import com.biblitheque.biblio.repository.BookRerository;

@Service
public class BookService {
    @Autowired
    private BookRerository bookRep;

    public Iterable<Book> getBooks(){
        return bookRep.findAll();
    }

    public Optional<Book> getBook(int id){
        return bookRep.findById(id);
    }

    public Book saveBook(Book book){
        return bookRep.save(book);
    }
/* 
    public Book updateBook(Book book){
       return bookRep.insert(book);
    }
*/
    public void deleteBook(int id){
        bookRep.deleteById(id);
    }



}
