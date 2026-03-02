package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorted {

	public static void main(String[] args) {
		List<Integer> listN = Arrays.asList(12,23,2,1,3,4,53,6,3,24,56);
		
		// sorted 
		List<Integer> sortedList  = listN.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		// descending order
		
		listN.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));
		

	}

}
