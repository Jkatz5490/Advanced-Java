package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class UserMainComparator {

	public static void main(String[] args) {
		List<User> Users = new ArrayList<User>();
		for (int i = 2; i < 8; i++) {
			Users.add(new User("test", 12 + i));
		}
		Users.add(new User("test", 15));
		Users.add(new User("aest", 15));
		Users.add(new User("zest", 15));
		Users.add(new User("best", 15));
		Users.add(new User("yest", 15));

		//Collections.sort(Users);

		for (User st : Users) {
			System.out.print(st.getName() + " ");
			System.out.println(st.getAge());
		}
		
		/* COMPARATOR FOR SORTING OBJECTS */
		/*
		//Comparator.comparingInt(User::getAge);
		*/
		
		List<User> UsersSortedByAge = new ArrayList<User>();
		List<User> UsersSortedByName = new ArrayList<User>();
		
		Users.stream().filter(n -> n.getAge() > 15).sorted(Comparator.comparingInt(User::getAge))
				.forEach(System.out::println);
		
		// sort the objects by age in ascending order
		UsersSortedByAge = Users.stream()
				.sorted(Comparator.comparing(User::getAge)
						.thenComparing(Comparator.comparing(User::getName)))
				.collect(Collectors.toList());
		
		// sort the objects by name in alphabetical order
		UsersSortedByName = Users.stream()
				.sorted(Comparator.comparing(User::getName)
						.thenComparing(Comparator.comparing(User::getName)))
				.collect(Collectors.toList());
		
		System.out.println("Sorted by age: ");
		System.out.println(UsersSortedByAge);
		System.out.println("Sorted by name: ");
		System.out.println(UsersSortedByName);

		UsersSortedByName = 
		Users.stream()
				.sorted(Comparator.comparing(User::getName)
				.thenComparing(Comparator.comparing(User::getName)))
				.collect(Collectors.toList());
		
	}

}
