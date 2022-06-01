package interfacesPractice1;

// lambda expressions only work with functional interfaces
@FunctionalInterface
interface MyLambda1 {
	void print();
	// void show();

}

// functional interface can only have 1 abstract method
//SAM interface
@FunctionalInterface
interface MyLambda {

	int add(int x, int y); // abstract method

	default void show() {
		System.out.println("Inside show method of MyLambda");
	}

	default void print() {
		System.out.println("inside print of default method 2 ");
	}

}

@FunctionalInterface
interface MyLambda2 {
	int divide(int x, int y); // abstract method

	default void printtest() {
		System.out.println("test MyLambda2");
	}
}
