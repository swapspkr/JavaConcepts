package com.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamToArrays {

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog","cat","cow");

			Object[] arr = animals.stream().toArray();
			
			for(Object o : arr) {
				if(o.toString().contains("o")) {
				System.out.println(o);}
			}
	}

}
