package com.StringProgram;

import java.util.Arrays;

public class ReverseStringTwoPointerApproach {

	public static void main(String[] args) {
		String x = "WebAutomation";

		/*
		 * char[] xArr = x.toCharArray();
		 * 
		 * for(int i=xArr.length-1;i>=0;i--) { System.out.print(xArr[i]); }
		 */
		
		char[] charArr = x.toCharArray();
		
		int left =0 , right=charArr.length-1;
		char temp;
		
		while(left<right) {
			temp = charArr[left];
			charArr[left]=charArr[right];
			charArr[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(charArr));
	}

}
