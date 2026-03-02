package com.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,60,350,5,2,7,-1);
		
		for(int e : list) {
			
			//System.out.println(e);
		}
		
		// using iterator
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
