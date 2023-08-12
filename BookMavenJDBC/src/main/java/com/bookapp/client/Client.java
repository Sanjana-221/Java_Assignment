package com.bookapp.client;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {
	public static void main(String[] args) {
		IBookService bookService=(IBookService) new BookServiceImpl();
		List<Book>boo=Arrays.asList(new Book("Seven ","Jungkook","Nostalgia",205,289.8),
				new Book("August-D","Suga","SavageKing",208,219.8));
		List <Book>books;
		for(Book book:boo) {
			
			bookService.addBook(book);
		}
		bookService.deleteBook(101);
		
		books=bookService.getByAuthorContains("Jungkook");
		System.out.println("Books by author");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getBycategory("Nostalgia");
		System.out.println("Books by Category");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByPricelessThan(500.0);
		System.out.println("Books by price");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByAuthorContainsAndCategory("Jungkook","Nostalgia");
		System.out.println("Books by author and Category");
		books.forEach(System.out::println);
		
		Book book=bookService.getById(109);
	    System.out.println("Books by id");
	    System.out.println(book);
	    
	    bookService.updateBook(208,897.0);
	    bookService.deleteBook(3);
	    books=bookService.getAll();
	    System.out.println("All Books");
	    books.forEach(System.out::println);
	    System.out.println();
	    
	}

}


