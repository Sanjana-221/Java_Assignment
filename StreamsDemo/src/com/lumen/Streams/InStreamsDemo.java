package com.lumen.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class InStreamsDemo {

	public static void main(String[] args) {
		 
	List<String> courses =  Arrays.asList("Java","Angular","Node","Spring","CSS","React");
	// convert to a stream
	Iterator<String> iterator = courses.stream()
			                    .filter(str->str.length()>4)
			                    .skip(2)
			                    .iterator(); // terminal
	while(iterator.hasNext()) {
		String cname = iterator.next();
		System.out.println(cname);
	}
	System.out.println();
	courses.stream()
	.filter(str->str.length()>4)
	.distinct()
	.limit(2)
	.forEach(str->System.out.println(str.toUpperCase()));
	
	
	
	System.out.println();
	        List<Integer>ncourses= courses.stream()
	        		                      .sorted()
	                                      .map(str->str.length()) //i/p is string o/p is integer
	                                      .filter(num->num>5)
	                                      .collect(Collectors.toList()); // convert into list
	        
	        ncourses.forEach(num->System.out.println(num));
	}
}
// convert the list to stream 

