package testing;

import static org.junit.Assert.assertEquals;

public class ABCTest {

	@org.junit.Test
	public void testMYLogic() {
		assertEquals(4, Cal.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Cal.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

}
