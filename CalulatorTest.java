package andycpp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalulatorTest {

    private static Calulator calulator=new Calulator();
	@Before
	public void setUp() throws Exception {
		calulator.clear();
		System.out.println("setUp()");
	}

	@Test
	public void testAdd() {
		calulator.add(2);
		calulator.add(3);
		assertEquals(5, calulator.getResult());
	}

	@Test
	public void testSubstract() {
		calulator.add(10);
		calulator.substract(2);
		assertEquals(8, calulator.getResult());
	}
	@Ignore("Multiply() not yet implemented")
	@Test
	public void testMultiply() {
		fail("‚Ü‚¾ŽÀ‘•‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
	}

	@Test
	public void testDivide() {
		calulator.add(10);
		calulator.divide(5);
	    assertEquals(2, calulator.getResult());
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}



	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

}
