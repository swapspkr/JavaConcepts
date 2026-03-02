package com.collection.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap {

	// HashMap :  store in K,V pair 
	//            uses hashing concept to store data
	//            if not check entry then it override in put()
	
	public static void main(String[] args) {
		HashMap<String,Integer> numbers = new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		
		System.out.println(numbers);
		
		numbers.put("Two", 99); // if not check entry then it override in put()
		
		numbers.putIfAbsent("One", 254); // check if already present or not
		
		// iterate using entrySet
		
		Set<Entry<String, Integer>> entry = numbers.entrySet();
		
		for(Entry<String, Integer> e : entry) {
			System.out.print(e.getKey()+":"+e.getValue() +" ");
			
		}
		
	}

}
