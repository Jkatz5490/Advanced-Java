package innerClass;

class OuterClass {
	int x = 10;

	/*
	 * similar to super class, subclass. can declare variable, method, and class.
	 * access to value and methods in inner class a different form of inheritance
	 */

	class InnerClass {

		class InsideInnerClass {

			int z = 15;

			public int myInnerInnerMethod() {
				return x + y;

			}
		}

		int y = 5;

		public int myInnerMethod() {
			return x; // inner class can reference the variable in the outer class
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {

		OuterClass myOuter = new OuterClass();

		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		
		// InnerClass myInnerInner = myInner.new InnerInnerClass();

		// OuterClass.InnerClass myInner = new OuterClass.InnerClass();

		System.out.println(myInner.y + myOuter.x);

		System.out.println(myInner.myInnerMethod() + myInner.y);
		
		System.out.println();

	}
}