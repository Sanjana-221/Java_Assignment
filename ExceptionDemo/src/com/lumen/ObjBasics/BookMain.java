package com.lumen.ObjBasics;

public class BookMain {
public static void main(String[] args) {
		
		Book book=new Book();
		book.title="It Ends With US";
		book.author="Collen HOoover";
		book.price=1200;
		book.showbook();
		int amount=(int) book.getDiscountedPrice(500);
		System.out.println(amount);
		

	}

}


