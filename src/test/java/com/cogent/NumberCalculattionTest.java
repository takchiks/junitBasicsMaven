package com.cogent;
import static  org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.commons.annotation.Testable;

public class NumberCalculattionTest {
	NumberCalculation nc;
	
	@BeforeEach
	void firsc() {
		nc = new NumberCalculation();
	}
	@Test
	void testAddition() {
		assertEquals(nc.add(10, 20), 30);
	}

	@Nested
	class AddTest{
		@Test
		void addPostive() {
			assertEquals(2,nc.add(1, 1));
		}
		@Test
		void addPostiveNegative() {
			assertEquals(-1,nc.add(-2, 1));
			
		}
		@Test
		void addNegative() {
			assertEquals(-8,nc.add(-4, -4));
			
		}
	}
	@Test
	void testMultiply() {
		assertAll(	()->assertEquals(16,nc.multiply(-4, -4)),
				()->assertEquals(-16,nc.multiply(4, -4)),
				()->assertEquals(20,nc.multiply(5, 4))
				);
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class,()->nc.divide(1, 3), "cant divide by 0");
		
	}

}
