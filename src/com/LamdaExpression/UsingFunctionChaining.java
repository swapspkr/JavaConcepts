package com.LamdaExpression;

import java.util.function.Function;

public class UsingFunctionChaining {

	// Function chaining 
	// andThen()
	// compose()
	// 
	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = n -> n*2;
		Function<Integer, Integer> f2 = n -> n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));// apply -> first f1 will be call and then f2 
		System.out.println(f1.compose(f2).apply(2)); // apply -> first f2 will be call and then f1

	}

}
