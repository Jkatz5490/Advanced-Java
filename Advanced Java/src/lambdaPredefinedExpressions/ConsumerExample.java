package lambdaPredefinedExpressions;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// consumes something but will not return anything
		Consumer<String> consumer = s -> System.out.println(s);

		List<String> alphaList = Arrays.asList("A", "B", "C", "D");

		for (String str : alphaList) {
			// functional interface accept() method called

			// System.out.println(str);
			// replacing the above line with the below line
			consumer.accept(str);
		}

		String str1 = "abcde";
		consumer.accept(str1);
	}

}
