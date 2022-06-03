package interviewCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers_divisible_by_7 {

	public static void main(String[] args) {
		/* numbers divisible by 7 */

		//System.out.println("------------------------------------------------");
		System.out.println("Program to print out all numbers divisible by 7, in the range of 10 to 100: ");
		ArrayList<Integer> numsDivisibleBy7 = new ArrayList<Integer>();
		for (int i = 10; i < 100; i++) {
			if (i % 7 == 0)
				numsDivisibleBy7.add(i);
		}
		System.out.println("Numbers divisible by 7: " + numsDivisibleBy7);

		/* reverse a string */

		System.out.println("------------------------------------------------");
		System.out.println("Program to reverse a string without using in-built functions: ");
		String hello = "hello";
		System.out.println("String: " + hello);
		String emptyStr = "";
		int helloLength = hello.length();
		String[] arr = hello.split("");
		for (int i = 0; i < hello.length(); i++) {
			emptyStr = emptyStr + arr[helloLength - 1];
			helloLength--;
		}
		System.out.println("Reverse String: " + emptyStr);

		/* 3 highest numbers in an array */

		System.out.println("------------------------------------------------");
		System.out.println("Program to find 3 highest numbers in an unsorted array and then add them together: ");
		int[] arr1 = { 5, 4, 6, 3, 7, 2, 8 };
		System.out.println("Original array: " + Arrays.toString(arr1));
		int temp = arr1[0];
		int temp2 = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			for (int x = 0; x < arr1.length; x++) {
				while (arr1[i] < arr1[x]) {
					/* must figure out swapping logic here to sort array */
					temp2 = arr1[x];
					temp = arr1[i];
					arr1[i] = temp2;
					arr1[x] = temp;

				}

			}
		}
		System.out.println("Array sorted: " + Arrays.toString(arr1));
		System.out.println("Largest 3 nums in array: " + arr1[arr1.length - 1] + " " + arr1[arr1.length - 2] + " "
				+ arr1[arr1.length - 3]);
		System.out.println("Sum of the 3 highest numbers in array: "
				+ (arr1[arr1.length - 1] + arr1[arr1.length - 2] + arr1[arr1.length - 3]));

		/* find all duplicate chars in string */
		System.out.println("------------------------------------------------");
		System.out.println("Program to find all duplicate characters within a string: ");
		String str1 = "hello world h";
		System.out.println("String: " + str1);
		ArrayList<Character> dupeChars = new ArrayList<Character>();
		int dupeTrue = 0;

		for (int i = 0; i < str1.length(); i++) {
			dupeTrue = 0;
			for (int x = 0; x < str1.length(); x++) {
				if (str1.charAt(i) == str1.charAt(x)) {
					dupeTrue = dupeTrue + 1;
					if (dupeTrue > 1) {
						dupeChars.add(str1.charAt(i));
						break;
					}
				}
			}
		}
		System.out.println("Duplicates in String: " + dupeChars);
		//

	}

}
