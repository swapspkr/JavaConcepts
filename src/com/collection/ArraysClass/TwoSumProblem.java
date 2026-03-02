package com.collection.ArraysClass;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
		// find index whos sum add to find target
		int[] arr = {3,11,6,15};
		int target =9;
		
		Map<Integer,Integer> hmap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int complement = target-arr[i];
			
			if(hmap.containsKey(complement)) {
				System.out.println(" Indexes :" +hmap.get(complement)+" and "+i);
				return;
			}
			hmap.put(arr[i], i);
		}

	}

}
