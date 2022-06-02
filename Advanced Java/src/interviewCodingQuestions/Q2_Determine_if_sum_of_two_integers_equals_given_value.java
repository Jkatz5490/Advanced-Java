package interviewCodingQuestions;

public class Q2_Determine_if_sum_of_two_integers_equals_given_value {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 4, 9, 5, 11 };

		int givenValue = 13;
		int flag = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int x = 0; x < arr.length; x++) {
				if ((arr[i] + arr[x]) == givenValue) {
					flag = 1;
					if (flag == 1) {
						System.out.println(
								"Match found. " + arr[i] +" + "+ arr[x] + " equals the given value: " + givenValue);
						break;
					}
				}

			}
			if (flag == 1)
				break;
		}

	}
	//

}
