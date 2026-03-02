package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFilters {

	public static void main(String[] args) {
		
		// filter the collection : length of name should be greater than 6 and less than 8
		
		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Joffrey");
		
		List<String> longNames = new ArrayList<String>();
		
		//longNames = names.stream().filter(str -> str.length()>6 && str.length()<8).collect(Collectors.toList());
		
		//System.out.println(longNames);
		
		names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
	}

}
