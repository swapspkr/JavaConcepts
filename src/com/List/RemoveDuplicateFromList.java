package com.List;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
		
		// Use Linked HashSet : keeps order + removes duplicates
		System.out.println(list);
		Set<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println(set);
	}

}
