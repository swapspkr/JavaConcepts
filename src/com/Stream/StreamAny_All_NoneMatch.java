package com.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamAny_All_NoneMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listN = Arrays.asList(12,23,2,1,3,4,53,6,3,24,56);
		
		//anymatch()
		boolean contains1 = listN.stream().anyMatch(val -> {return String.valueOf(val).contains("1");});
		System.out.println("Numbers contains 1: "+contains1);
		
		
		//allmatch()
		contains1 = listN.stream().allMatch(val -> {return String.valueOf(val).contains("1");});
		System.out.println("Numbers contains 1: "+contains1);
		
		//nonematch()
		contains1 = listN.stream().noneMatch(val -> {return String.valueOf(val).contains("1");});
		System.out.println("Numbers contains 1: "+contains1);
	}

}
