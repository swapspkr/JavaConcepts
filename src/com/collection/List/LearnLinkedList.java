package com.collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		
		List<Integer > list = new LinkedList<>();
		
		// List<Integer > list = new LinkedList<>();
		// same operation as ArrayList as its implementing List I 
		
		//list.offer(56);
		// add 
		list.add(2);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list);
		
		list.add(34);
		list.add(0, null);
		list.add(1, null);

		System.out.println(list);
		// remove
		list.remove(0);
		list.remove(1);

		
		list.add(0,59);
		list.add(1,98);
		System.out.println(list); 
		list.remove(2);
		System.out.println("check if element is present :"+list.contains(10));
		
		
		System.out.print("Using for loop :");
		for(int i=0;i<list.size();i++) {
			System.out.print(+list.get(i)+" ");
		}
		System.out.println();
		System.out.println("Using forEach loop :");
		for(int i :list) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Get operation in list : "+list.get(3));
		
		list.remove(3);
		
		System.out.println("After remove :"+list);
		
		//System.out.println(list.isEmpty());
		
		// using iterator
		
		System.out.println("using iterator --> ");
		  Iterator<Integer> it = list.iterator();
		  
		  while(it.hasNext()) { System.out.println("Iterator :" +it.next()); }
		 
	}

}
