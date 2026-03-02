package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoStreamFindAny_First {

	public static void main(String[] args) {
		
		
		List<Integer> listN = Arrays.asList(12,23,2,1,3,4,53,6,3,24,56);
		// if empty list then throws NoSuchElementException
		
		//findAny
		
		Optional<Integer> op = listN.stream().findAny();
		System.out.println(op.get());
		
		
		//findFirst
		Optional<Integer> findFirst = listN.stream().findFirst();
		System.out.println(findFirst.get());

	}

}
