package practice;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		String str1 = "";
		String str2 = "";
		int count = 0;
		
		for(int i=0;i<5;i++){
			numsList.add(i);

		}

		for(int i=-5;i<0;i++){
			numsList.add(i);

		}

		for(int i=-2;i<3;i++){
			numsList.add(i);

		}

		//int numsListLength = numsList.size();
		
		/*
		 * CONVERTING from ArrayList to Array: easy
		 */
		Integer[] arr = new Integer[numsList.size()];
		  
        // ArrayList to Array Conversion
        for (int i = 0; i < numsList.size(); i++)
            arr[i] = numsList.get(i);
		
        // Conversion Complete
        

		for(int i=0;i<numsList.size(); i++){
			if(arr[i].equals(1))
				count = count + 1;
		

		}

		System.out.println("number of times the number 1 has occured: "+count);
		
		// ArrayList to Array Conversion (Using streams) 
        int[] arr2 = numsList.stream().mapToInt(i -> i).toArray();

	}

}
