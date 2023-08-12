package com.lumen.Collection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class States {
	public static void main(String[] args) {
		Map<String, List<String>> states = new HashMap<>();
		states.put("Karnataka", Arrays.asList("Bangalore","Hubli","Dharwad","Ooty"));
		states.put("Meghalaya", Arrays.asList("Shillong","Guwahati","Cherapunji"));
		states.put("Dheli", Arrays.asList("Majnu Ka Tilla","New Dheli","Noida","Oompa"));
		
		Set<Map.Entry<String, List<String>>> mapEntries = states.entrySet();
		for(Map.Entry<String, List<String>> mapEntry: mapEntries) {
			System.out.println("State : "+mapEntry.getKey());
			System.out.print("Cities: ");
			mapEntry.getValue().forEach(city->System.out.print(city+" "));
			System.out.println();
		}
	}
}


