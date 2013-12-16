package ch.schumm.gina;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZeugnisTest {

	@Test
	public void testBerechneDurchschnitt() {
		Zeugnis testzeugnis = new Zeugnis(); 
		testzeugnis.deutsch = 4; 
		testzeugnis.mathe = 5; 
		testzeugnis.englisch = 4;
		testzeugnis.franz = 5; 
		
		assertEquals(4.5, testzeugnis.berechneDurchschnitt(), 0.1);
		
	}

}
