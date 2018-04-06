package br.com.victor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.victor.MathMethods;

public class MyClassTest {
	
	@Test
	public void testeSoma() {
		MathMethods math=new MathMethods();
		assertEquals("5 + 5 should return 10",10,math.soma(5, 5));
	}
	@Test
	public void testSub() {
		MathMethods math=new MathMethods();
		assertEquals("5 - 5 should return 0",0,math.sub(5, 5));
	}
	@Test
	public void testMult() {
		MathMethods math=new MathMethods();
		assertEquals("5 * 5 should return 25",25,math.mult(5, 5));
	}
	@Test
	public void testeDiv() {
		MathMethods math=new MathMethods();
		assertEquals("5 / 5 should return 10",1,math.div(5, 5));
	}

}
