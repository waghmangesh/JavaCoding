package com.examples.programs;

import java.util.Arrays;

public class CheckIftwoStringAreAnagram {
	
	public static void main(String[] args) {
		String s1 = "abcdefgh";
		String s2 = "ghefcdab";
		
		boolean result = checkifAnagram(s1,s2);
		if(result)
			System.out.println("Given Strings are anagram");
		else
			System.out.println("###### Given Strings are not anagram ######");
	}

	private static boolean checkifAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i] != c2[i])
				return false;
		}
		
		return true;
	}	

}
