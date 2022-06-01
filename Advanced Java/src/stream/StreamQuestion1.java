package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion1 {

	public static void main(String[] args) {
		/*
		 * List<String> strList=Arrays.asList("abcd","abc","ab","efg","e","f"); Create a
		 * List with String of more than 2 characters
		 */

		List<String> strList = Arrays.asList("abcd", "abc", "ab", "efg", "e", "f");

		List<String> nameList1 = strList.stream().filter(n -> n.length() > 2).collect(Collectors.toList());
		System.out.println(nameList1);

		/*
		 * List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
		 * "Italy","U.K.","Canada"); Convert String to uppercase and collect it in a
		 * list
		 */
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		List<String> nameListUpper = G7.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nameListUpper);

		/*
		 * List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); Create a List of
		 * the square of all distinct numbers
		 */

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Double> sqrtNumbers = numbers.stream().map(i -> Math.sqrt(i)).collect(Collectors.toList());
		System.out.println(sqrtNumbers);

		/*
		 * Create a list of Users. User is a POJO having a name and age. Filter out
		 * users younger than 18 years and sort them in list by their age, ascending.
		 * create pojo class with gettings and setters
		 * user is class
		 * name and age is instance variables
		 * 
		 */
		
		

	}

}
