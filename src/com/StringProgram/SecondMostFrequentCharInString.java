package com.StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostFrequentCharInString {

	public static void main(String[] args) {
		String x = "aabbbbccc";
		
		Map<Character,Integer> hmap = new HashMap<>();
		//char[]strA = x.toCharArray();

		for(int i =0;i<x.length();i++) {
			hmap.put(x.charAt(i), hmap.getOrDefault(x.charAt(i), 0)+1);
		}
		
		System.out.println("Get ch with count");
		
		Set<Entry<Character, Integer> > entryset =hmap.entrySet();
		
		int firstFreq=0 ,secondFreq=0;
		
		for(Map.Entry<Character,Integer> entry : entryset) {
			
			//System.out.println(entry.getKey()+":"+entry.getValue());
			
			int currentFreq = entry.getValue();
			
			if(currentFreq>firstFreq) {
				secondFreq = firstFreq;
				firstFreq = currentFreq;
				
			}else if (currentFreq>secondFreq && currentFreq<firstFreq){
				secondFreq = currentFreq;
			}
		}

		//System.out.println("First:"+firstFreq +" "+"Second:"+secondFreq);
		
		for(Map.Entry<Character,Integer> entry : entryset) {
			if(entry.getValue().equals(secondFreq)) {
				System.out.println("Second Most Frequent Char in provided String.");
				System.out.println("Key:"+entry.getKey() +" " +"Value:"+entry.getValue());
			}
		}
	}

}
