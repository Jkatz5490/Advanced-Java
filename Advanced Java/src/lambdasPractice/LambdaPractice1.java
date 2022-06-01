package lambdasPractice;

import java.util.ArrayList;
import java.util.function.Function;

public class LambdaPractice1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    numbers.forEach((n) -> { System.out.println(n);});
	    
	    numbers.forEach((n) -> { System.out.println(n);});
	    
	    numbers.stream().map((Function<? super Integer, ? extends R>) (n) -> {System.out.println(n);
		return null;});

	}

}
