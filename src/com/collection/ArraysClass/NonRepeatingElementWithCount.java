package com.collection.ArraysClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingElementWithCount {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,5,6,6};
		
		Map<Integer, Integer> hmap = new LinkedHashMap<>();
		
		for(int a : arr) {
			hmap.put(a,hmap.getOrDefault(a,0)+1);
		}
		//System.out.println(hmap);
		
		 for(Map.Entry<Integer, Integer> entry :hmap.entrySet()){
			 if(entry.getValue()==1) {
			 System.out.println(entry.getKey());
			 //break;
		 }}
	}

}
