package lambda10Examples;

import java.util.Arrays;
import java.util.List;

public class Example_3__Iterating_over_List_using_Lambda_expressions {

	public static void main(String[] args) {
		//Prior Java 8 :
		System.out.println("Prior to Java 8: ");
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API",
		                              "Date and Time API");
		for (String feature : features) {
		   System.out.println(feature);
		}
		
		System.out.println("-----------------------------------------------------");

		//In Java 8:
		System.out.println("In Java 8: ");
		features.forEach(n -> System.out.println(n));
		
		System.out.println("----------------------------------------------------");

		System.out.println("In Java 8 using method references: ");
		// Even better use Method reference feature of Java 8
		// method reference is denoted by :: (double colon) operator
		// looks similar to score resolution operator of C++
		features.forEach(System.out::println);

	}

}
