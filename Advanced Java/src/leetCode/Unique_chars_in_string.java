package leetCode;

import java.util.ArrayList;

public class Unique_chars_in_string {

	public static void main(String[] args) {
		/*
		 * not working
		 */
		
		
		String str = "Hello WorldX";
		int count = 0;
		boolean unique = true;
		ArrayList<Character> uniqueChars = new ArrayList<Character>();
		int strLenght = str.length();

		for (int i = 0; i < str.length(); i++) {

			for (int x = 0; x < str.length(); x++) {
				unique = false;
				char chI = str.charAt(i);
				char chX = str.charAt(x);
				if (str.charAt(i) == (str.charAt(x))) {
					unique = false;
					count = count + 1;

				} else if (count == 1 && x == str.length() - 1) {
					unique = true;
				}

				else
					System.out.println("Still testing");

				if (unique == true && count == 1) {
					count = 0;
					uniqueChars.add(str.charAt(i));
				}
			}

		}

	}

}
