package com.StringProgram;

public class ValidatePalindrome {

	public static void main(String[] args) {
		String input = "A man , A plan, A canal: Panama";
		StringBuilder sb = new StringBuilder();
		
		char[] arr = input.toCharArray();

		for (Character ch : arr) {
			if(Character.isLetterOrDigit(ch)) {
				//System.out.print(ch);
				sb.append(Character.toLowerCase(ch));
				
			}
		}
		//System.out.print(sb);
		String cleanedInput = sb.toString();
		String reverInput = sb.reverse().toString();
		if(cleanedInput.equals(reverInput)) {
			System.out.println("Valid palindrome");
		} else {
			System.out.println("Not a palindrome!");
		}
	}

}
