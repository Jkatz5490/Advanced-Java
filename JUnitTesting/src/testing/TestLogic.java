package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogic {

	@Test
	public void test() {
		assertEquals(4, Cal.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Cal.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

}
