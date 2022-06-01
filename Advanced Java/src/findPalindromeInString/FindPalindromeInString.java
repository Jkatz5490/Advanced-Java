package findPalindromeInString;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindPalindromeInString {

	public static void main(String[] args) {
		String str = "Lmadamcdodbmazzam";

		// String[] arr = str.split("");
		// List<String> strList= new ArrayList<String>();

		Set<String> set1 = new HashSet<String>();

		for (int i = 0; i < str.length() - 1; i++) {
			String temp;
			for (int j = i + 1; j < str.length() + 1; j++) {
				temp = str.substring(i, j); 
										/*
											 * when you have a number, another number for substring(number, number),
											 * the first number is the start of the substring, and the last number is
											 * the end of the substring.
											 * subustring here starts at i, then it goes through all of J
											 * once it increments from all of J, I increments up one, so it starts
											 * from the second place since I is incremented up 1, and goes through 
											 * all of J again. this collects every substring, which is tested in the
											 * code below to see if it equals the reverse of itself, to check if 
											 * it is a palindrome. if it does, then the palindrome is added to
											 * the set. 
											 * 
											 */

				if (temp.equals(new StringBuilder(temp).reverse().toString())) {
					set1.add(temp);
				}
			}
		}
		Optional<String> LongestPaladrome = set1.stream().max((str1, str2) -> str1.length() - str2.length());
		System.out.println(LongestPaladrome);
		System.out.println(LongestPaladrome.get());
		System.out.println("-------------------------------");
		String LongestPaladromeStr = set1.stream().max((str1, str2) -> str1.length() - str2.length()).get();
		System.out.println(LongestPaladromeStr);
		System.out.println("-------------------------------");
		String longest = set1.stream().max(Comparator.comparingInt(String::length)).get();
		int max = longest.length();
		System.out.println(max + " " + longest);
		
		
		
		
	}
}
