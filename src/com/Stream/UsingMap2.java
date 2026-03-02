package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5);
		List<Integer> multiList = Arrays.asList(2,3,4,5);
		
		
		//list.stream().map(num -> num*3).forEach(System.out::println);
		
		// to collect in other list
		multiList = list.stream().map(num -> num*3).collect(Collectors.toList());
				  
		
		System.out.println(multiList);
	}

}
