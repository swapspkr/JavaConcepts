package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {
		List<Integer> listN = Arrays.asList(1,2,33,4,5,6,3,24,56);
		
		// using distinct
		List<Integer> distL = listN.stream().distinct().collect(Collectors.toList());
		System.out.println(distL);
		
		// using min
		Optional<Integer>  minL = listN.stream().min((val1,val2)-> {return val1.compareTo(val2);});
		System.out.println("Min:"+minL.get());
		
		// using max
		Optional<Integer>  maxL = listN.stream().max((val1,val2)-> {return val1.compareTo(val2);});
		System.out.println("Max:"+maxL.get());
		
		// using count
		long count = listN.stream().filter(n->n%2==0).count();
		System.out.println("Event no. :"+count);
		
		//using reduce
		
		List<String> listN2 = Arrays.asList("A","B","V","C");
		
		Optional<String> rev = listN2.stream().reduce((value,combinedVal)-> 
								{return combinedVal+value;});
		System.out.println("Reverse : "+rev.get());
		
		Optional<Integer> totalFromList = listN.stream().reduce((value,combinedVal)-> 
		{return combinedVal+value;});
		
		System.out.println("Total :"+totalFromList.get());

	}

}
