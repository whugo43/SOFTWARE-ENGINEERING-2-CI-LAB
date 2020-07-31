package IntegracionJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelationalOperatorTest {

	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));
	}

	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(2, 4));
	}
	
	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}
	
	@Test
	public void isGoodHeigth1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodHeight(7,5,15));
	}
	@Test
	public void isGoodHeigth2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodHeight(12,5,14));
	}
	
	@Test
	public void isGoodWidth1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodWidth(10,2,10));
	}
}
