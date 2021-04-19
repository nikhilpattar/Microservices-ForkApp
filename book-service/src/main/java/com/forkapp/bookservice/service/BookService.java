package com.forkapp.bookservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forkapp.bookservice.model.Book;
import com.forkapp.bookservice.repository.BookRepository;

@Service
public class BookService 
{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooksFromDb(){
		return bookRepository.findAll();
	}
	
	public Book getBookByIdFromDb(int id) {
		Book book = null;
		
		Optional<Book> op = bookRepository.findById(id);
		if(op.isPresent()) {
			book = op.get();
		}
		return book;
	}
	
	public String addBookToDb(Book book) {
		bookRepository.save(book);
		return "Book with Id: "+book.getbId()+" added successfully";
	}
}
