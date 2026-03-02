package com.StringProgram;

public class ValidatePalindromeUsingPointerApproach {

	public static void main(String[] args) {
		String input = "A man , A plan, A canal: Panama";
		
		System.out.println("String isPalindrome:"+isPalindrome(input));
		
	}

	private static boolean isPalindrome(String input) {
		
		char[] a = input.toCharArray();
		int left =0 ;
		int right = a.length-1;
		
		while(left< right) {
			// Character.isLetterOrDigit -- return false if (! ,& ....) non alphanumberic char
			
			while(left<right && !Character.isLetterOrDigit(a[left])) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(a[right])) {
				right--;
			}
			if(Character.toLowerCase(a[left])!=Character.toLowerCase(a[right])) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
