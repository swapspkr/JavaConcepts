package com.collection.Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

	
	// HashSet : insertion is not maintained 
	//           duplicates are not allowed
	//           uses hashing concept to store element
	//			 operation : add() , remove() , contains () , clear()
	
	public static void main(String[] args) {
		Set<Integer> hset = new HashSet<>();
		
		hset.add(20);
		hset.add(10);
		hset.add(30);
		hset.add(40);
		
		System.out.println(hset);
		
		System.out.println();
		
		System.out.println("remove :"+hset.remove(20)+ " HashSet : "+hset);
		
		System.out.println("check if element is present using contains():" +hset.contains(10));
		
	}

}
