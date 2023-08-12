package com.lumen.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BookStreamsDemo{

	public static void main(String[] args) {
		// create a list of Books-> convert to stream-> get books  by author-> print
	}
		List<Book> books =Arrays.asList(new Book("Java","Whiskey","Grief", 200,1))
		               new Book("Haunting Adrenalline","Zade Meadows",202,7),
		               new Book("it ends with us","Jackson",800,7),
		               new Book("Seven","Jungkook",23,20));
		               List<Integer>booklength =books.stream()

		            		   .filter( book ->book.getAuthor().equals("Ben John"))

		            		   .map(book->book.getTitle().length())

		            		   .map(square->(int)Math.pow(square, 2))

		            		   .collect(Collectors.toList());

		            		    

		            		booklength.forEach("square->System.out.println(square"));

		            		    

		            		    

}




		            		    

		

		
		
		



