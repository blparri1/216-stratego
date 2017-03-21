package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class Test {

	int a;
	
	@Before
	public void setUp() throws Exception {
		a = 1;
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		assertTrue (a == 1);
	}

}
