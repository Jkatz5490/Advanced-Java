package lambda10Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * EXTREMELY IMPORTANT: 
 */

public class Example_4__Using_Lambda_expression_and_Functional_interface_Predicate {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		System.out.println("Languages which starts with J: ");
		filter(languages, (str) -> ((String) str).startsWith("J"));

		System.out.println("Languages which ends with a ");
		filter(languages, (str) -> ((String) str).endsWith("a"));

		System.out.println("Print all languages:");
		filter(languages, (str) -> true);

		System.out.println("Print no language: ");
		filter(languages, (str) -> false);

		System.out.println("Print language whose length greater than 4: ");
		filter(languages, (str) -> ((String) str).length() > 4);
		
		System.out.println("Print language whose length less than 4: ");
		filter(languages, (str) -> ((String) str).length() < 4);
		
		
		
		/*
		 * use the filter method, filter(), pass the parameter for the list,
		 * filter(languages)
		 * pass the parameter for the Condition
		 * filter(languages, (str)
		 * perform the operation
		 * ->((String) str).length() < 4); 
		 */
	}
	/*
	 * Even better Java 8 method
	 */
	public static void filter(List<String> names, Predicate<String> condition) {
		names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
			System.out.println(name + " ");
		});
	}

	/*
	 * Java 8 method one
	 */
	
	/*
	public static void filter1(List<String> names, Predicate<String> condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}
	*/

	/*
	 * You can see that the filter method from Stream API also accepts a Predicate,
	 * which means you can actually replace our custom filter() method with the
	 * in-line code written inside it, that's the power of lambda expression. By the
	 * way, the Predicate interface also allows you to test for multiple conditions,
	 * which we will see in our next example.
	 */

}
