package com.lumen.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
	//create an object for converting bytes to characters
		InputStreamReader reader = new InputStreamReader(System.in);
// create an object of bufferedReader
		BufferedReader  bufferedreader = new BufferedReader(reader);
		
		char value ;
		try{
			value =(char)bufferedreader.read();
		
		System.out.println(value);
		while(value!= 'q')
			value = (char)bufferedreader.read();
		System.out.print(value);
	
	}catch (IOException e) {
		System.out.println(e.getMessage());

}
}
}
