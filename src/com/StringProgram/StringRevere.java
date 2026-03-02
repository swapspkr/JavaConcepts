package com.StringProgram;

public class StringRevere {

	public static void main(String[] args) {
		
		String input = "Automation";
		String temp ="";
		
		// using loop
		/*for(int i=input.length()-1;i>=0 ;i--) {
			
			temp = ""+input.charAt(i);
			System.out.print(temp);
		}*/
		
		// using charArray
		
		char[] str = input.toCharArray();
		int strlen =str.length;
		System.out.println("String length :- "+strlen);
		
		for(int i=strlen-1;i>=0;i--) {
			System.out.print("After reverse : "+str[i]);
		}
	}

}
