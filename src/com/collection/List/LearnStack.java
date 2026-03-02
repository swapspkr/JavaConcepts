package com.collection.List;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		// 3 Operation in Stack : push pop peek 
		// to add : push
		// to remove : pop
		// to check which is at top : peek
		
		// Eg : Book of stack 
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Lion");
		stack.push("Tiger");
		stack.push("Dog");
		stack.push("cat");
		
		System.out.println("Stack :"+stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Stack :"+stack);
	}

}
