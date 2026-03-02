package com.collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	
	// TreeSet : insertion order is maintained as the element are added 
	//           duplicates are not allowed
	//           all element are in sorted order
	//			 operation : add() , remove() , contains () , clear()
	
	public static void main(String[] args) {
		Set<Integer> hset = new TreeSet<>();
		hset.add(60);
		hset.add(20);
		hset.add(10);
		hset.add(30);
		hset.add(40);
		
		System.out.println(hset);
		
		System.out.println();
		
		System.out.println("remove :"+hset.remove(20)+ " TreeSet : "+hset);
		
		System.out.println("check if set is empty / not :" +hset.isEmpty());
		System.out.println("check if element is present using contains():" +hset.contains(10));
		
	}

}
