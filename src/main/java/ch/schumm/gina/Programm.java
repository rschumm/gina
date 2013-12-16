package ch.schumm.gina;

/**
 * Hauptklasse für die Steuerung des Programms. 
 * @author rschumm
 *
 */
public class Programm {

	public static void main(String[] args) {
		Zeugnis ritasZeugnis = new Zeugnis(); 
		
		ritasZeugnis.name = "Rita"; 
		
		ritasZeugnis.deutsch = 5; 
		ritasZeugnis.mathe = 6; 
		ritasZeugnis.franz = 4; 
		ritasZeugnis.englisch = 5.5; 
		
		System.out.println(ritasZeugnis.berechneDurchschnitt());

	}

}
