package classNameCreator;

import java.util.Scanner;

public class Class_Name_Creator {

	public static void main(String[] args) {
		Class_Name_Creator cr = new Class_Name_Creator();
		//String className = "Example 2 - Event handling using Java 8 Lambda expressions";
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Class Name: ");
	    String className = myObj.nextLine();  // Read user input
		cr.removeSpacesAndReplaceWithUnderScores(className);

	}
	
	public void removeSpaces(String className) {
		
		if(className.contains(" ")) {
			className = className.replaceAll(" ", "");
			className = className.replaceAll("-", "");
			System.out.println(className);
		}
	}
	
	public void replaceSpacesWithUnderScores(String className) {
		if(className.contains(" ")) {
			//System.out.println(className.replaceAll(" ", "_"));
			className = className.replaceAll(" ", "_");
			className = className.replaceAll("-", "");
			System.out.println(className);
		}
	}
	
	public void removeSpacesAndReplaceWithUnderScores(String className){
		Class_Name_Creator cr = new Class_Name_Creator();
		cr.removeSpaces(className);
		cr.replaceSpacesWithUnderScores(className);
	}

}
