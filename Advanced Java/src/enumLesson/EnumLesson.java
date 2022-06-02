package enumLesson;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, test
}

/*
 * cant do enum with numbers 
 * 
 */
//

// enum Numbers { 1, 5, 6,}

public class EnumLesson {

	public static void main(String[] args) {

		Day[] allDays = Day.values();
		
		

		for (Day day : allDays) {
			System.out.print(day + " ");
		}
		System.out.println();
		System.out.println(allDays[0]);
	}
}