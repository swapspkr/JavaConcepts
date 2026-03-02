package com.collection.ArraysClass;

import java.util.ArrayList;

public class StringLenInArray {

	public static void main(String[] args) {
		String[] input = { "Anidita", "is", "in", "the", "interview" };
		
		for(int i =0;i<=input.length-1 ; i++) {			
			System.out.print(input[i] +" ");
		}

		ArrayList<Integer> intLen = new ArrayList<Integer>();
		
		int len = input.length-1;
		
		System.out.println(" ");
		for(int i =0;i<=len ; i++) {			
			//
			intLen.add(input[i].length());
		}

		System.out.println(intLen);
		
		
	}

}
