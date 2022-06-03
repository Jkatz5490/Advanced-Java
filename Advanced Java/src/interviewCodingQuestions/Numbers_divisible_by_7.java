package interviewCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers_divisible_by_7 {

	public static void main(String[] args) {
		/* numbers divisible by 7 */

		ArrayList<Integer> numsDivisibleBy7 = new ArrayList<Integer>();
		for (int i = 10; i < 100; i++) {
			if (i % 7 == 0)
				numsDivisibleBy7.add(i);
		}
		System.out.println(numsDivisibleBy7);

		/* reverse a string */

		String hello = "hello";
		String emptyStr = "";
		int helloLength = hello.length();
		String[] arr = hello.split("");
		for (int i = 0; i < hello.length(); i++) {
			emptyStr = emptyStr + arr[helloLength - 1];
			helloLength--;
		}
		System.out.println(emptyStr);

		/* 3 highest numbers in an array */

		int[] arr1 = { 5, 4, 6, 3, 7, 2, 8 };
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
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[arr1.length - 1] + " " + arr1[arr1.length - 2] + " " + arr1[arr1.length - 3]);
		System.out.println("The sum of the 3 highest numbers in the array is: "
				+ (arr1[arr1.length - 1] + arr1[arr1.length - 2] + arr1[arr1.length - 3]));

		/* find all duplicate chars in string */

		String str1 = "hello world h";
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
		System.out.println(dupeChars);
		
		

	}

}
