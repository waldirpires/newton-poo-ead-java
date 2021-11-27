package ead.poo.u8.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test_soma() {
		var calc = new Calc();
		
		Assertions.assertEquals(5, calc.somar(3,  2));
	}

}
