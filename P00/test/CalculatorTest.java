import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * lihuaaaa, 26 May 2023 11:54:21 am
 */

public class CalculatorTest {
	public void testAdd()
	{
		int a = 1234;
		int b = 5678;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	public final void testSubtract()
	{
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(actual,expected);
	}
	public final void testMultiply()
	{
		int a = 12;
		int b = 56;
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected =  672;
		assertEquals(actual,expected);
	}
	public final void testDivide()
	{
		int a = 9876;
		int b = 12;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =  823;
		assertEquals(actual,expected);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
}
