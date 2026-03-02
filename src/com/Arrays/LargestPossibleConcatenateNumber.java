package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPossibleConcatenateNumber {

	public static void main(String[] args) {
		// 1.Convert int[] to String arr
		// 2. iterate in for loop
		// 3. sort using compartor
		
		/*
		 * Arrange numbers to form the largest possible concatenated number
		 * 
		 * Step 1 — Convert numbers to strings We convert because concatenation matters.
		 * 
		 * [5, 23, 90] ↓ ["5", "23", "90"]
		 * 
		 * Step 2 — Custom sorting rule We compare two elements a and b like this:
		 * 
		 * a + b vs b + aWhichever is larger should come first.
		 * 
		 * Comparison 1 — "5" vs "23"
		 * 
		 * "5" + "23" = "523" "23" + "5" = "235"Compare:
		 * 
		 * 523 > 235 Correct order:
		 * 
		 * "5" before "23"Array remains:
		 * 
		 * ["5", "23", "90"]
		 * 
		 * Comparison 2 — "23" vs "90"
		 * 
		 * "23" + "90" = "2390" "90" + "23" = "9023"Compare:
		 * 
		 * 9023 > 2390 Correct order:
		 * 
		 * "90" before "23"Array becomes:
		 * 
		 * ["5", "90", "23"]
		 * 
		 * Comparison 3 — "5" vs "90"
		 * 
		 * "5" + "90" = "590" "90" + "5" = "905"Compare:
		 * 
		 * 905 > 590 Correct order:
		 * 
		 * "90" before "5"Array becomes:
		 * 
		 * ["90", "5", "23"]
		 * 
		 * Final sorted array
		 * 
		 * ["90", "5", "23"]
		 * 
		 * Step 3 — Concatenate result
		 * 
		 * "90" + "5" + "23"Final output:
		 * 
		 * 90235
		 */

		int[] nums = { 5, 23, 90 };

		String[] arr = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {

			arr[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {

				String order1 = a + b;
				String order2 = b + a;
				return order2.compareTo(order1);
			}

		});

		StringBuilder sb = new StringBuilder();
		for (String num : arr) {
			sb.append(num);
		}
		
		System.out.println("Largest Possible concatenated number :" +sb);
	}

}
