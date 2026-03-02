package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsingFiltersDemo2 {

	public static void main(String[] args) {
		
		// filter the collection : filter null values from collections
		
		List<String> names = Arrays.asList("cup",null,"sky",null,"books","thetre");
		
		List<String> longNames = new ArrayList<String>();
		
		longNames = names.stream().filter(s -> Objects.nonNull(s)).collect(Collectors.toList());
		System.out.println(longNames);
		
	}

}
