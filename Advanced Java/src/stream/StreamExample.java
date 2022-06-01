package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class StreamExample {

	public static void main(String args[]) {

		// create streams
		Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");
		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Stream<Integer> streamOfArrayOfIntegers = Stream.of(array);

		// streamOfStrings.forEach(s->System.out.println(s));
		/*
		 * streamOfStrings.forEach(System.out::println);
		 * 
		 * List<String> list = Arrays.asList("DC","MD","VA","MA","NC"); //creating a
		 * list
		 * 
		 * list.stream().forEach(System.out::println);
		 * 
		 * intermediate operations: filter distinct map sorted
		 * terminal operations: for each, collect
		 */ 

		Stream<String> s = Stream.of("cat", "cat", "monkey", "cow", "cat");
		s.distinct().forEach(System.out::println);

		List<String> nameList = Arrays.asList("Ram", "Amit", "Ashok", "Manish", "Rajat");
		nameList.stream().filter(n -> n.startsWith("A")) // Predicate implementation
				.forEach(System.out::println);

		Stream<String> strOfNames = Stream.of("amy", "nick", "margo", "mike");
		List<String> nameList1 = strOfNames.map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Names in upper case" + nameList1);
		List<Integer> myList = Arrays.asList(7000, 5000, 4000, 24000, 17000, 6000);
		myList.stream().map(i -> (i + (i * 10 / 100))).forEach(System.out::println);

		List<String> strList = Arrays.asList("Rome ", "Tokyo ", "London ", "Berlin ", "DC ");
		strList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
		
		// can indent on . to make it so you can comment out single operations at a time
		
		// print random numbers in n*100
		Stream.generate(Math::random)
		.map(n -> (int)(n * 100))
		.limit(10) // amount of items printed
		.forEach(System.out::println);
		
		
		// print odd numbers up to 20
		Stream.iterate(0, n -> n + 1)
		.filter(x -> x % 2 != 0)
		.limit(10) // n + 1, 10 times reaches max of 20
		.forEach(System.out::println);

		
		// new intStream
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		
	}

}