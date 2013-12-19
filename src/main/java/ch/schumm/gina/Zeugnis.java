package ch.schumm.gina;

/**
 * Dies ist die Klasse für alle Zeugnisse. Eine Instanz dieser Klasse - sprich: ein Objekt davon - ist ein 
 * individuelles Zeugnis, z.B. das Zeugnis von Hans: <code>Zeugnis hansZeugnis = new Zeugnis();</code> <br>
 * Dieses Zeugnis kann selbst seinen Durchschnitt ausrechnen, wenn man ihm die Nachricht <code>berechneDurchschnitt();</code>
 * schickt. 
 * 
 * @author Rémy Schumm
 *
 */
public class Zeugnis {
	
	
	public Zeugnis(double deutsch, double mathe, double franz, double englisch) {
		super();
		this.deutsch = deutsch;
		this.mathe = mathe;
		this.franz = franz;
		this.englisch = englisch;
	}


	public Zeugnis() {
	}


	public double mathe; 
	public double franz; 
	public double englisch; 
	public double deutsch; 
	
	public String name; 
	
	
	public double berechneDurchschnitt(){
		double durchschnitt = 0;
		durchschnitt = (2 * mathe + 2 * deutsch + englisch + franz) / 6; 
		return durchschnitt; 
	}
	
	

}
