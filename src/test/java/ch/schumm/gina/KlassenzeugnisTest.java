package ch.schumm.gina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KlassenzeugnisTest {

	private Zeugnis hansZeugnis;
	private Zeugnis ritaZeugnis;
	private Klassenzeugnis klassenzeugnis;

	@Before
	public void setUp() throws Exception {
		hansZeugnis = new Zeugnis(4, 4, 4, 4); 
		hansZeugnis.name = "Hans"; 
		ritaZeugnis = new Zeugnis(5, 5, 5, 5); 
		ritaZeugnis.name = "Rita"; 
		
		klassenzeugnis = new Klassenzeugnis(); 
		klassenzeugnis.addZeugnis(hansZeugnis);; 
		klassenzeugnis.addZeugnis(ritaZeugnis);
		
	}

	@Test
	public void testGetBesteR() {
		assertEquals("Rita", klassenzeugnis.getBesteR());
	}		

	@Test
	public void testGetBesterDurchschnitt() {
		assertEquals(5, klassenzeugnis.getBesterDurchschnitt(), 0.1);
	}

}
