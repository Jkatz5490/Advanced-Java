package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_Add_Two_Numbers {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		// ListNode l3 = new LinkedList<Integer>();

		for (int i = 1; i < 10; i++) {
			l1.add(i);
		}
		for (int i = 9; i > 0; i--) {
			l2.add(i);
		}

		// reverse the linked lists
		/* convert linked list into array so indexes can be accessed */
		List<Integer> intList = l1.stream().map(Integer::valueOf).collect(Collectors.toList());

		/*
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		arrList2 = (ArrayList<Integer>) l1.stream().map(Integer::valueOf).collect(Collectors.toList());
		*/
		//System.out.println(arrList2);

		// convert arrayList to an array
		Integer[] arr = intList.toArray(new Integer[intList.size()]);
		Collections.reverse(
				Arrays.asList(arr)); /*
										 * reverses in real time and saves the changes to the array variable arr.
										 */
		// String arr1Str = Arrays.toString(arr);
		//System.out.println(arr1Str);
		String emptyStr = "";
		for(int i = 0; i < arr.length; i++) {
			emptyStr = emptyStr + arr[i];
		}
		//System.out.println(emptyStr);
		int i=Integer.parseInt(emptyStr);
		System.out.println(i);
		emptyStr = "";
		// System.out.println(intList);
		// System.out.println(Arrays.toString(arr));

	}

}
