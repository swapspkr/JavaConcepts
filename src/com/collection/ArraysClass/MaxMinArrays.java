package com.collection.ArraysClass;

public class MaxMinArrays {

	public static void main(String[] args) {
		int[] arr = {10,20,50,65,685,3,32,32};
		// min max initial first a[i];
		int minValue = arr[0];
		int maxValue = arr[0];
		
		for(int i=1;i<arr.length-1;i++) {
			
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}else if(arr[i]<minValue) {
				minValue =arr[i];
			}
			
		}
		System.out.println("MINVALUE : "+minValue);
		System.out.println("MAXVALUE : "+maxValue);

	}

}
