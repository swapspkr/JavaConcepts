package com.collection.ArraysClass;

public class FindFirstMaxSecondMaxInArray {

	public static void main(String[] args) {
		int a[] = {5,6,10,8};
		
		int firstMax= Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		//int thirdMax = Integer.MIN_VALUE;
		
		for( int num : a ) {
			
			if(num> firstMax) {
				//thirdMax = secondMax;
				 secondMax = firstMax;
				  firstMax = num;
			}
			else if (num>secondMax && num<= firstMax) {
				//thirdMax = secondMax;
				secondMax = num;
			}
			/*
			 * else if(num>thirdMax && num<=secondMax) { thirdMax = num; }
			 */
			
		}
		
		System.out.println("FirstMAX : "+firstMax );
		System.out.println("SecondMAX : "+secondMax );
		//System.out.println(thirdMax );

	}

}
