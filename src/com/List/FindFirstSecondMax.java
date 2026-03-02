package com.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstSecondMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 50, 20, 40);
		Collections.sort(list);
		
		System.out.println("Sorted list in ascending :"+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Sorted list in decending :"+list);
		
		int FirstMax =0;
		int SecondMax= 0;
		
		for(int ele : list) {
			
			if(ele>FirstMax) {
				
				SecondMax=FirstMax;
				FirstMax = ele;
			}
			else if(ele>SecondMax && ele<FirstMax) {
				SecondMax=ele;
			}
		}
				
		System.out.println("FirstMax : "+FirstMax);
		System.out.println("SecondMax : "+SecondMax);
	}

}
