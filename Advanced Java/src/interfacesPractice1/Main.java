package interfacesPractice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLambda1 printfun = () -> System.out.println("Lambda Example");
		printfun.print();

		MyLambda addfun = (x, y) -> (x + y);
		System.out.println("The sum is    " + addfun.add(5, 7));
		
		addfun.print();
		addfun.show();

		MyLambda2 dividefun = (x, y) -> (x/y);
		System.out.println("the division of x/y is     " + dividefun.divide(10, 2));
		dividefun.printtest();
		System.out.println("test doing addfun again: "+addfun.add(1, 3)); // can only use functions made for the specific lambda
		/*
		 * addfun for add method, dividefun for divide method
		 */
		
	}

}
