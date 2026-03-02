package com.collection.ArraysClass;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,5,6,6};
		
		Set<Integer> hashSet = new HashSet<>();
		
		for(int a : arr) {
			hashSet.add(a);
		}
		System.out.println(hashSet);
	}

}
