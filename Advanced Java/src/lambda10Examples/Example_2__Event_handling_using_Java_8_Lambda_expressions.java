package lambda10Examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;

import stream.User;
import stream.UserMainComparator;

public class Example_2__Event_handling_using_Java_8_Lambda_expressions extends UserMainComparator{

	public static void main(String[] args) {
		// Before Java 8:
		JButton show = new JButton("Show");
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handling without lambda expression is boring");
			}
		});

		// Java 8 way:
		show.addActionListener((e) -> {
			System.out.println("Light, Camera, Action !! Lambda expressions Rocks");
		});
		
		/*
		 * ------------------------------------------------------------------
		 */
		
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
			System.out.print(st.getAge() + " ");
		}
		System.out.println();
		List<User> UsersSortedByName = new ArrayList<User>();
		
		UsersSortedByName = Users.stream()
		.sorted(Comparator.comparing(User::getName)
				.thenComparing(Comparator.comparing(User::getName)))
		.collect(Collectors.toList());
		
		System.out.println(UsersSortedByName);

	}


	/*
	 * Another place where Java developers frequently use anonymous class is for
	 * providing custom Comparator to Collections.sort() method. In Java 8, you can
	 * replace your ugly anonymous class with a more readable lambda expression. I
	 * leave that to you for exercise, should be easy if you follow the pattern, I
	 * have shown during implementing Runnable and ActionListener using a lambda
	 * expression.
	 */

}
