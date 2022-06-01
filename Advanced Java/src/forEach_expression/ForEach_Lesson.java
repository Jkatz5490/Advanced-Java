package forEach_expression;

import java.util.Arrays;
import java.util.List;

public class ForEach_Lesson {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","B","C","D");

		list1.forEach(inputParam->System.out.println(inputParam));
		
		list1.forEach((x) -> System.out.println(x));
		
		list1.forEach(System.out::println);
		
	}

}
