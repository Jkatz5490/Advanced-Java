package lambdaQuestion;

public interface LambdaQ1vars {

	@FunctionalInterface
	public interface ArrayProcessor {
		double apply(double[] array);
	}
	
	default void print() {
		System.out.println("inside print of default method 2 ");
	}
	
}
