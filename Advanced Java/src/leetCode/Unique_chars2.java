package leetCode;

import java.util.ArrayList;

public class Unique_chars2 {

	public static void main(String[] args) {
		int count;
		ArrayList<Character> unique = new ArrayList<Character>();
		String str = "Hello World";

		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				}
			}
			if (count == 1) {
				unique.add(str.charAt(i));
			}
		}
		System.out.println(unique);
		
		
		

	}

}
