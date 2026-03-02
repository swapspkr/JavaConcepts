package com.collection.ArraysClass;

public class Ararys {

	public static void main(String[] args) {
		
		int[] arr = {10,20,50,65,685,3,32,32};
		
		for(int a : arr) {
			System.out.print(a+" , " );
		}

		int len = arr.length-1;
		System.out.println(len);
		//arr[len+1]=45;
		//arr[len+2] = 46;
		
		int count =1;
		int val = 48;
		for(int i =len ;i<=len+5;i++) {
			
			arr[len+count]=val;
			val++;
			count++;
			System.out.println(arr[len+count] +" " +val+" "+count);
		}
	}

}
