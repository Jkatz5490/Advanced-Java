package lambdaQuestion;

import java.util.stream.DoubleStream;

import lambdaQuestion.LambdaQ1vars.ArrayProcessor;

public class LambdaQuestion1 {
	
	public static void main(String[] args) {

		double[] arr = { 1.1, 1.2, 1.3, 1.5 };

		final ArrayProcessor INTERVAR1 = (array) -> {
			return DoubleStream.of(arr).sum();
		};
		final ArrayProcessor INTERVAR2 = (array) -> {
			return DoubleStream.of(arr).sum() / arr.length;
		};
		System.out.println("The sume is: " + INTERVAR1.apply(arr));
		System.out.println("The average is: " + INTERVAR2.apply(arr));
		// arrProcess.apply([5.0]);

		/*
		 * Suppose that a functional interface ArrayProcessor is defined as
		 * 
		 * A functional interface that defines a function that has one parameter of type
		 * double[] and that returns a value of type double.
		 * 
		 * public interface ArrayProcessor { double apply( double[] array ); }
		 * 
		 * Write a class that defines two public static final variables of type
		 * ArrayProcessor that process an array in the following ways: find the sum of
		 * the values in the array, and find the average of the values in the array. In
		 * each case, the value of the variable should be given by a lambda expression
		 */

	}

}
