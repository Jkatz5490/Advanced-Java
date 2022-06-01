package test;

public class Cal {

	public static int findMax(int arr[]) {
		// int max=0; // will break test if arr max is negative, because 0 is greater
		// than any negative number
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
