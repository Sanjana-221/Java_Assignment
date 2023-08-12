package com.lumen.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) {
		FileReader fileReader=null;
		FileWriter fileWriter=null;
		try {
			fileReader=new FileReader("demo.txt");
			fileWriter= new FileWriter("demo1.txt");
			int ch = fileReader.read();
			while (ch!=-1) {
				fileWriter.append((char)ch);
				ch = fileReader.read();
			}
		}
			catch(IOException e) {
				e.printStackTrace();
				
			}finally {
				try {
					fileReader.close();
					fileWriter.close();
					
				}catch (IOException e) {
					e.printStackTrace();
		
				}
	}
}
	}
