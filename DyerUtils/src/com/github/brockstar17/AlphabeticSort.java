package com.github.brockstar17;

import java.util.Arrays;

public class AlphabeticSort {

	private static String[] alphaRef = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "g", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	/**
	 * 
	 * @param s
	 *            the string[] to be sorted
	 * @return a string[] sorted in alphabetic order
	 */
	public static String[] alphaSort(String[] s) {
		int[] numericRep = new int[s.length];

		int i = 0;
		for (String t : s) {
			t.toLowerCase();
			numericRep[i] = getAlphaNumeric(t);
			i++;
		}
		
		Arrays.sort(numericRep);
		
		for(int j = 0; j < s.length; j++){
			s[j] = alphaRef[numericRep[j]];
		}
		
		return s;

	}

	private static int getAlphaNumeric(String s) {
		int i = 0;
		for (String a : alphaRef) {
			if(s.equals(a))
				break;
			else
				i++;
		}
		
		return i;
	}
}
