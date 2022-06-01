package forEach_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach_Lesson2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("DC", "MD", "VA", "MA", "NC"); // creating a list
		// forEach and Method Reference
		/*
		 * for(String str:list) { System.out.println(str); }
		 */

		list.forEach((st) -> System.out.println(st));

		System.out.println("Printing below using method reference");

		list.forEach(System.out::println); // use :: to reference a method

		List<Employee100> listEmp = new ArrayList<>();
		listEmp.add(new Employee100("emp001", 12, "ady", 'M', 1234));
		listEmp.add(new Employee100("emp002", 23, "swe", 'F', 2345));

		listEmp.forEach((empobj) -> System.out.println(empobj));

		// Iterating map thru forEach lambda
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);

		prices.forEach((k, v) -> System.out.println("Fruit: " + k + ", Price: " + v));

	}

}
