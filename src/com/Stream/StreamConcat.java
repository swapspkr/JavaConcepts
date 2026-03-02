package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		
		List<String> animals = Arrays.asList("dog","cat","cow");
		List<String> birds = Arrays.asList("parrot","piegons","sparrow");
		
		Stream<String> stream1 = animals.stream();
		Stream<String> stream2 = birds.stream();
		
		List<String> concatenatedStream =Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		for(String con : concatenatedStream) {
			System.out.println(con);
		}

	}

}
