package test.java.kata.implementation.OksanaKalynivska;

import org.testng.Assert;
import org.testng.annotations.Test;

import kata.implementations.OksanaKalynivska.EightImp;


public class EightImplFirstTaskTest {
	EightImp eight = new EightImp();

	@Test
	public void testKeepHydrated() {
		double expResult = eight.liters(2);
		Assert.assertEquals(1, expResult);
		
	}
}
