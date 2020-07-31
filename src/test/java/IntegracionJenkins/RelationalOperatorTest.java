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
	public void notEqualTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.notEqual(3, 1));
	}
	
	@Test
	public void notEqualTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.notEqual(2, 2));
	}
	
	@Test
	public void isGoodHeigth1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodHeight(9,6,13));
	}
}
