package com.lumen.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
	public static void main(String[] args) {
		//create an object for converting bytes to characters
			InputStreamReader reader = new InputStreamReader(System.in);
	// create an object of bufferedReader
			BufferedReader  bufferedreader = new BufferedReader(reader);
			FileWriter fileWriter = null;

			try {
				fileWriter= new FileWriter("demo.txt");
				String value = bufferedreader.readLine();
				fileWriter.write(value);
				System.out.println(value);
				do {
					System.out.println(value);
					value = bufferedreader.readLine();
				}while(!value.equals("stop"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fileWriter.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}

	}
}
