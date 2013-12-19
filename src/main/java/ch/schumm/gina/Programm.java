package ch.schumm.gina;

/**
 * Hauptklasse fÃ¼r die Steuerung des Programms. <br>
 * Diese Klasse ist eine spezielle Klasse, die die Kontrolle über dieses erste kleine Programm übernimmt. <br>
 * Das Betriebsystem des Computers (bzw. die JVM) schickt dieser Klasse die Meldung <code>main(...);</code>, um 
 * das Programm zu starten (das ist Abmachung).  
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
