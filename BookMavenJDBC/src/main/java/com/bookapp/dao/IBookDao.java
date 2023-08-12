package com.bookapp.dao;
import java.sql.SQLException;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookDao {
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	List<Book> findAll();
	List<Book> findByAuthorContains(String author);
	List<Book> findByCategory(String category) ;
	List<Book> findByPriceLessThan(double price);
	List<Book> findByAuthorContainsAndCategory(String author, String category);
	Book findById(int bookId) ;

}


	
	


