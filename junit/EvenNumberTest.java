package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberTest {

	@Test
	void test() {
		assertEquals(true, EvenNumber.FindEvenOddNumber());
		assertTrue((EvenNumber.DivisibleByNumber()) == 0);
	}

}
