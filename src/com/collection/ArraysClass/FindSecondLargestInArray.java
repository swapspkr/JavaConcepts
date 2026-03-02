package com.collection.ArraysClass;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		int a[] = {5,6,10,8};
		
		int firstMax= Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : a) {
			
			if(num>firstMax) {
				secondMax=firstMax;
				firstMax =num;
			}else if(num>secondMax && num<firstMax) {
				secondMax= num;
			}
		}
		System.out.println("Second Largest Number :"+secondMax);

	}

}
