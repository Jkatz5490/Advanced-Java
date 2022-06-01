package terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample1 {

	public static void main(String[] args) {
		// Terminal Operations
		// count
		List<Integer> numList = Arrays.asList(7, 5, 18, -11, 22, -8);
		long elementCount = numList.stream().filter(n -> n > 0).count(); // counts amount fo numbers greater than 0
		System.out.println("Count of elements- " + elementCount);

		// max----
		List<Integer> numList1 = Arrays.asList(6, 8, 13, 2, 58, 22, 76, 9, 11, 3);
		Optional<Integer> max = numList1.stream().max(Integer::compare);
		if (max.isPresent()) {
			System.out.println("Maximum element: " + max.get());
		}

		// findfirst
		List<Integer> list = Arrays.asList(3, 9, 1, 9, 7, 8);
		Optional<Integer> firstNumFromStream = list.stream().findFirst();
		if (firstNumFromStream.isPresent()) {
			System.out.println("First Element in the Stream- " + firstNumFromStream.get());
		} else {
			System.out.println("No element found");
		}

		// findany
		List<Integer> list1 = Arrays.asList(3, 2, 6, 2, 7, 8);
		list1.stream().filter(e -> e > 5).findAny().ifPresent(System.out::println);

		// anymatch
		List<Integer> numList11 = Arrays.asList(97, 102, 60, 15, 20);
		boolean result = numList11.stream().anyMatch(n -> n > 100);
		System.out.println(result);
		// nonematch
		List<Integer> numList2 = Arrays.asList(30, 40, 22, 45, 27, 49, 47);
		boolean result1 = numList2.stream().noneMatch(n -> n > 50);
		System.out.println(result1);
		// allmatch
		List<Integer> numList22 = Arrays.asList(2, 4, 6, 12, 20);
		boolean result22 = numList22.stream().allMatch(n -> (n % 2 == 0));
		System.out.println(result22);

		/*
		 * List<Integer> listOfNumbers = Arrays.asList(5,9,14,19,47,56,72,89,90,18);
		 * Map<Boolean, List<Integer>> numbers = listOfNumbers.stream()
		 * .collect(Collectors.partitioningBy(n -> n%2 == 0)); // When key false -
		 * returns list with odd numbers System.out.println("Odd Numbers- " +
		 * numbers.get(false)); // When key true - returns list with even numbers
		 * System.out.println("Even Numbers- " + numbers.get(true));
		 */
	}

}