package com.StringProgram;

public class KeyChangeInString {

	// count number of key change in String
	public static void main(String[] args) {

		String input = "abBcC";

		// String input2 = input.toLowerCase();
		// System.out.println("String length => "+input2.length());

		/*
		 * int count=0; char currentChar = input2.charAt(0); for(int
		 * i=1;i<input2.length();i++){
		 * 
		 * char nextChar = input2.charAt(i); if(currentChar!=nextChar) { count++;
		 * 
		 * } currentChar=nextChar; } System.out.println(""+count);
		 */

		int count = 0;
		char lastKey = input.charAt(0);
		lastKey = Character.toLowerCase(lastKey);

		for (int i = 1; i < input.length(); i++) {

			char currentKey = Character.toLowerCase(input.charAt(i));

			if (currentKey != lastKey) {
				count++;
			}
			lastKey = currentKey;

		}
		System.out.println("" + count);
	}

}
