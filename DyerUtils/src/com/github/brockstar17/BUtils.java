package com.github.brockstar17;

public class BUtils
{
	/**
	 * A System.out.println() shortcut
	 * 
	 * Will also print out all elements of an array with a space in between each
	 * 
	 * @param s
	 *            the string to output
	 */
	public static void sout(Object s) {

		SystemOut.output(s);
	}
	
	/**
	 * 
	 * @param s the string[] to sort
	 * @return a string[] sorted alphabetically
	 */
	public static String[] alphaSort(String[] s){
		return AlphabeticSort.alphaSort(s);
	}
	
	/**
	 * 
	 * @param base the double to be squared
	 * @return base * base
	 */
	public static double square(double base){
		return Math.pow(base, 2);
	}

}
