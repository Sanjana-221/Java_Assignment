package com.lumen.Streams;

import java.util.Arrays;

public class FlatDemo {

	public static void main(String[] args) {
		String[]names={"Whiskey","Sanjay","Sathish","Hari"};
		Arrays.stream(names).forEach(name->System.out.println(name));
		String[][]courses={{"Java","Angular"},{"CSS","HTML"}};
		Arrays.stream(courses)
		.flatMap(oneArr->Arrays.stream(oneArr)).map(String::length).forEach(System.out::println);
		
		
		

	}

}
