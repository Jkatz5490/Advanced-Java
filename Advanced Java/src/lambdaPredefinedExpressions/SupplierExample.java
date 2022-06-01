package lambdaPredefinedExpressions;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// will take anything but not return anything
		Supplier<LocalDateTime> currDateTime = () -> LocalDateTime.now();

		Supplier<Integer> intobj = () -> 23;
		System.out.println(intobj.get());

		System.out.println(currDateTime.get());

	}

}
