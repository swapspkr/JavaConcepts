package com.Stream;

import java.util.Arrays;
import java.util.List;

public class UsingMap {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("cup","sky","books","thetre");
		
		names.stream().map(nameLen -> nameLen.length())
					  .forEach(System.out::println);
		
		// convert to Uppercase
		
		names.stream().map(namesU -> namesU.toUpperCase())
					 .forEach(name -> System.out.println(name));

	}

}
