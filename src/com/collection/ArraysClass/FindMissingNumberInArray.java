package com.collection.ArraysClass;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};
		
		int n = arr.length+1;
		int expectedSum = n*(n+1)/2;
		int sum=0;
		for(int a : arr) {
			sum = sum+a;
		}
		
		System.out.println("Missing number"+(expectedSum-sum));
	}

}
