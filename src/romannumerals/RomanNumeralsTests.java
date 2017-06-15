package romannumerals;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTests {
	RomanNumeralTranslator translator = new RomanNumeralTranslator();

	@Before
	public void setUp() throws Exception {
		translator = new RomanNumeralTranslator();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_for_nums_that_both_add_and_subtract_numerals() {
		String expected9 = "IX";
		String expected19 = "XIX";
		String expected99 = "XCIX";
		
		assertEquals(expected9, translator.translateToRoman(9));
		assertEquals(expected19, translator.translateToRoman(19));
		assertEquals(expected99, translator.translateToRoman(99));
	}

	@Test
	public void test_for_nums_that_only_add_numerals() {
		String expected8 = "VIII";
		String expected18 = "XVIII";
		String expected518 = "DXVIII";
		
		assertEquals(expected8, translator.translateToRoman(8));
		assertEquals(expected18, translator.translateToRoman(18));
		assertEquals(expected518, translator.translateToRoman(518));
	}
	
	
	

}
