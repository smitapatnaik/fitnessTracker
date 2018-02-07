package com.patnaik.programmingTests;

public class StringReverser {

	public static void main(String[] args) {
		
//		System.out.println("Reversed string for abba is "+recursiveReverse("abba")+" with degree of palindrome = "+degreeOfPalindromeWithoutReversing("abba"));	
//		System.out.println("Reversed string for abcdcaa is "+recursiveReverse("abcdcaa")+" with degree of palindrome = "+degreeOfPalindromeWithoutReversing("abcdcaa"));
//		System.out.println("Reversed string for abcdef is "+recursiveReverse("abcdef")+" with degree of palindrome = "+degreeOfPalindromeWithoutReversing("abcdef"));
//		System.out.println("Reversed string for qwerty is "+recursiveReverse("qwerty")+" with degree of palindrome = "+degreeOfPalindromeWithoutReversing("qwerty"));
		recursiveReverse("qwerty");
	}
	
	static String reverseString(String string) {
		char[] stringChars = string.toCharArray();
		String reversedString = "";
		for(int i = stringChars.length - 1; i>=0; i--) {
			reversedString += String.valueOf(stringChars[i]);
		}
		return reversedString;
	}
	
	static int degreeOfPalindrome(String string) {
		char[] stringArray = string.toCharArray();
		char[] reversedStringArray = reverseString(string).toCharArray();
		int degreeOfPalindrome = 0;
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] != reversedStringArray[i]) {
				degreeOfPalindrome++;
			}
		}
		return degreeOfPalindrome;
	}
	
	static int degreeOfPalindromeWithoutReversing(String string) {
		char[] stringArray = string.toCharArray();
		int degreeOfPalindrome = 0;
		int reversedIndex = stringArray.length - 1;
		for(int i = 0; i < stringArray.length; i++,reversedIndex--) {
			if(stringArray[i] != stringArray[reversedIndex]) {
				degreeOfPalindrome++;
			}
		}
		return degreeOfPalindrome;
	}
	
	static String recursiveReverse(String string) {
		if(string.length() < 2) {
			System.out.println("string finally returned = "+string);
			return string;
		}
		System.out.println("string = "+string);
		return recursiveReverse(string.substring(1)) + string.charAt(0);
	}
}
