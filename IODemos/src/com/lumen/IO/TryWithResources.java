package com.lumen.IO;

import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResources {

	public static void main(String[] args) {
		try(
			FileWriter writer = new FileWriter("trial.txt");
				FileReader fileReader = new FileReader("demo.txt");
		){
			int num = fileReader.read();
			FileWriter.write((char));
			do {
				num = fileReader.read();
				FileWriter.write();
			
		
                }
			
			
		}catch(Exception e) {

	}

}
}
