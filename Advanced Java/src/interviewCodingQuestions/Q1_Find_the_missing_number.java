package interviewCodingQuestions;

public class Q1_Find_the_missing_number {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 1, 6, 2, 8 };
		int n = arr.length;
		
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/* excess use of memory way: */
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i]+1 != arr[i+1])
				System.out.println("The missing number is: " + (arr[i]+1));
		}
		
		/* incompleted */
		
		int sum = 0;
		int expectedSum;
		int missingNumber;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		/* incompleted */

	}

}
