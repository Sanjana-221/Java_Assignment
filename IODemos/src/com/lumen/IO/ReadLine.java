package com.lumen.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) {
		//create an object for converting bytes to characters
			InputStreamReader reader = new InputStreamReader(System.in);
	// create an object of bufferedReader
			BufferedReader  bufferedreader = new BufferedReader(reader);
			
			String value ;
			try{
				value =(String)bufferedreader.readLine();
			
			System.out.println(value);
			while(!value.equals("stop")) {
				value = (String)bufferedreader.readLine();
			System.out.print(value);
		
		}
			}
			catch (IOException e) {
			System.out.println(e.getMessage());

	}
	}
	}



