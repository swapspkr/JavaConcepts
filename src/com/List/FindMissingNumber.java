package com.List;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,5);
		int n = list.size()+1;
		//System.out.println(len);
		
		int sum = n*(n+1)/2;
		int actualSum=0;
		for(int e : list) {
			actualSum = actualSum+e;
		}
		
		System.out.println("Missing number : "+(sum -actualSum));
	}

}
