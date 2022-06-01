package lambda10Examples;

public class Example_1__implementing_Runnable_using_Lambda_expression {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start();

		// Java 8 way:
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();

	}
	/*
	 * This example brings us the syntax of lambda expression in Java 8. You can
	 * write following kind of code using lambdas : (params) -> expression (params)
	 * -> statement (params) -> { statements }
	 * 
	 * for example, if your method doesn't change/write a parameter and just print
	 * something on the console, you can write it like this :
	 * 
	 * () -> System.out.println("Hello Lambda Expressions");
	 * 
	 * If your method accepts two parameters then you can write to them like below :
	 * 
	 * (int even, int odd) -> even + odd
	 * 
	 * By the way, it's general practice to keep the variable name short inside
	 * lambda expressions. This makes your code shorter, allowing it to fit in one
	 * line. So in the above code, the choice of variable names as a,b or x, y is
	 * better than even and odd.
	 */

}
