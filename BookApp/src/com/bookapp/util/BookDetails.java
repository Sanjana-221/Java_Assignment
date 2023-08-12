package com.bookapp.util;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Whiskey","Grief", "Truestory",1,900.90),
				new Book ("Haunting Adrenalline","Zade Meadows","Fictoional",2202,7),
				new Book ("It ends with us","Jackson","Sci-Fi", 3, 1900.45),
				new Book (" Seven", "Jungkook", "Fiction", 4,700.08), 
				new Book("Like Crazy","Park Jimin", "Selfhelp", 5,800.56)
				);
	}
}


