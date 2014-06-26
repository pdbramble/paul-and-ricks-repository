package org.pdb.lambda;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StringsWithLambdaTest {

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	private static void printChar(int aChar) {
		System.out.println((char)(aChar));
	}
	

	@Test
	public void test() {
		String str = "A8B1C2D3E0";
		
		str.chars()
		.filter(Character::isDigit)
		.forEach(StringsWithLambdaTest::printChar);

	}

}
