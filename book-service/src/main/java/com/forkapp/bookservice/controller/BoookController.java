package com.forkapp.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forkapp.bookservice.model.Book;
import com.forkapp.bookservice.service.BookService;

@RestController
public class BoookController 
{
	@Autowired
	private BookService bookService;
	
	@GetMapping("books")
	public List<Book> getBooks(){
		return bookService.getBooksFromDb();
	}
	
	@PostMapping("books")
	public String addBook(@RequestBody Book book) {
		return bookService.addBookToDb(book);
	}
	
	@GetMapping("books/{id}")
	public Book getBookById(@PathVariable int id){
		return bookService.getBookByIdFromDb(id);
	}
}
