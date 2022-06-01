package terminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> houseBriff = Arrays.asList("one", "two", "three");
		List<String> houseDriff = Arrays.asList("ten", "eleven", "Twelve");
		List<String> houseZiff = Arrays.asList("one-hundred", "two-hundred", "three-hundred");

		List<List<String>> mansions = new ArrayList<List<String>>();

		mansions.add(houseZiff);
		mansions.add(houseDriff);
		mansions.add(houseBriff);

		List<String> listOfAllHouses = new ArrayList<String>();
		for (List<String> houses : mansions) {
			for (String mansionName : houses) {
				listOfAllHouses.add(mansionName);
			}
		}
		System.out.println(listOfAllHouses);

		/*
		 * flat map prints out all elements that you would normally have to create a
		 * nested for loop for
		 */
		List<String> flatMapList = mansions.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList());
		System.out.println(flatMapList);

	}

}
