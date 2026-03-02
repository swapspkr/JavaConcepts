package com.collection.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnTreeMap {

	// HashTree : store in K,V pair 
	//			  all are in sorted order based on key
	//            uses hashing concept to store data
	//            if not check entry then it override in put()
	
	public static void main(String[] args) {
		Map<String,Integer> numbers = new TreeMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		numbers.put("Two", 20);
		
		System.out.println(numbers);  // Printed in sorted order
		
		numbers.put("Two", 99); // if not check entry then it override in put()
		
		numbers.putIfAbsent("One", 254); // check if already present or not
		
		// iterate using entrySet
		
		Set<Entry<String, Integer>> entry = numbers.entrySet();
		
		for(Entry<String, Integer> e : entry) {
			System.out.print(e.getKey()+":"+e.getValue() +" ");
			
		}
		
		// remove
		
		numbers.remove("Two");
		
		System.out.println(numbers);
		
	}

}
