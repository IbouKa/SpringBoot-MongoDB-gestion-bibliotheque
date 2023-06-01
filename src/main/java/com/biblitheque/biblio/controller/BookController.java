package com.biblitheque.biblio.controller;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.biblitheque.biblio.model.Book;
import com.biblitheque.biblio.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RestController
public class BookController {
    @Autowired
    private BookService bs;

    @GetMapping(value="/book/{id}")
    public Optional<Book> getMethodName(@PathVariable int id) {
        return bs.getBook(id);
    }

    @GetMapping(value="/books")
    public Iterable<Book> getBooks() {
        return bs.getBooks();
    }

    @PostMapping(value="/book")
    public Book postMethodName(@RequestBody Book book) {
        return bs.saveBook(book);
    }

    @DeleteMapping("/book/{id}") 
    public boolean deleteBook(@PathVariable int id){
        bs.deleteBook(id);
        return true;
    }
    
    
}
