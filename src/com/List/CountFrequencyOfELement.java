package com.List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyOfELement {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("QA", "Dev", "QA", "SDET");

		Map<String,Integer> hmap = new HashMap<>();
		
		for(String ele : list) {
			
			hmap.put(ele, hmap.getOrDefault(ele, 0)+1);
		}
		
		System.out.println(hmap);
		
	}

}
