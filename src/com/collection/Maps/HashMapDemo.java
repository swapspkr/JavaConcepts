package com.collection.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> countryCapitalhmap = new HashMap<>();
		countryCapitalhmap.put("India","New Delhi");
		countryCapitalhmap.put("USA","Washington DC");
		countryCapitalhmap.put("UK","London");
		
		System.out.println("Location of India is at :"+"India".hashCode() %16);
		System.out.println("Location of USA is at :"+"USA".hashCode() %16);
		System.out.println("Location of UK is at:"+"UK".hashCode() %16);
		System.out.println(countryCapitalhmap.get("India"));
		
		Set<String> result = countryCapitalhmap.keySet();
		
		System.out.println(result);
		
		// traversing hashmap
		
		 for (Map.Entry<String, String> entrys : countryCapitalhmap.entrySet()) {
			 
			 System.out.println(entrys.getKey()+"--->"+entrys.getValue());
		 }
	}
}
