package ch.schumm.gina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KlassenzeugnisTest {

	private Zeugnis hans;
	private Zeugnis rita;
	private Klassenzeugnis klassenzeugnis;

	@Before
	public void setUp() throws Exception {
		hans = new Zeugnis(4, 4, 4, 4); 
		hans.name = "Hans"; 
		rita = new Zeugnis(5, 5, 5, 5); 
		rita.name = "Rita"; 
		
		klassenzeugnis = new Klassenzeugnis(); 
		klassenzeugnis.addZeugnis(hans);; 
		klassenzeugnis.addZeugnis(rita);
		
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
