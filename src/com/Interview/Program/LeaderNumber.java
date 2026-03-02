package com.Interview.Program;

public class LeaderNumber {

	public static void main(String[] args) {
		// LeaderNumber in Array : is a number which will have smaller number to the right of array
		// eg : [15,17,5,6,4,7,2] 
		// 17 , 7 , 2 are Leader Number
		
		// logic : 1. will print rightmost number and assign with MaxRight , as its doesn't have any no after that
		// traverse array in reverse and check if current number is greater than MaxRight
		// if yes, then print 
		
		int[] arr = {15,17,5,6,4,7,2};
		
		int length=arr.length;
		int MaxRight = arr[length-1];
		
		System.out.print(MaxRight);
		for(int i=length-2;i>=0;i--) {
			
			if(arr[i]>MaxRight) {
				MaxRight=arr[i];
				System.out.print(" "+MaxRight);
				
			}
		}

	}

}
