package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseSum {

	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("^^^^^^^^^ Only Once before all Test ^^^^^^^^^^^^^^^");
	}

	@Before
	public void beforeTest() {
		System.out.println("---Execute before every Test -------");

	}

	@Test
	public void testMySum() {
		Assert.assertEquals(4, test.Test.sum(2, 2));
		System.out.println("Hey ! First Test got passed");

	}

	@Test
	public void testMySum2() {
		Assert.assertEquals(0, test.Test.sum(-2, 2));
		System.out.println("Hey ! Second Test also got Passed");
	}

	@After
	public void afterTest() {
		System.out.println("******** execute after every test *********** ");
	}

	@AfterClass
	public static void afterAllTest() {
		System.out.println("^^^^^^^^^ Finished All Test Then Called ^^^^^^^^^^^^^^^");
	}

}

