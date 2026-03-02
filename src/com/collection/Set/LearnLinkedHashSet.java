package com.collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	
	// LinkedHashSet : insertion order is maintained as the element are added 
	//           duplicates are not allowed
	//           uses hashing concept to store element
	//			 operation : add() , remove() , contains () , clear()
	
	public static void main(String[] args) {
		Set<Integer> hset = new LinkedHashSet<>();
		
		hset.add(20);
		hset.add(10);
		hset.add(30);
		hset.add(40);
		
		System.out.println(hset);
		
		System.out.println();
		
		System.out.println("remove :"+hset.remove(20)+ " HashSet : "+hset);
		
		System.out.println("check if set is empty / not :" +hset.isEmpty());
		System.out.println("check if element is present using contains():" +hset.contains(10));
		
	}

}
