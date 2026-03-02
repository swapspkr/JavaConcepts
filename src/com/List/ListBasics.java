package com.List;

import java.util.ArrayList;
import java.util.List;



public class ListBasics {

	public static void main(String[] args) {
		// Basic list and perform CRUD operations
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Selenium");
		list.add("1");
		list.add("Java");
		
		System.out.println("Print list :- "+list);
		
		
		list.remove(0);
		System.out.println("Print list after remove from index :- "+list);
		
		System.out.println(" Length of list :- "+list.size());
		
		list.set(2, "JavaCollections");
		
		System.out.println("Print list after adding object at index:- "+list);
		
		
		
		

	}

}
