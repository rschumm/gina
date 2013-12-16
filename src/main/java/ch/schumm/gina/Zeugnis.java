package ch.schumm.gina;

public class Zeugnis {
	
	
	public Zeugnis(float deutsch, float mathe, float franz, float englisch) {
		super();
		this.deutsch = deutsch;
		this.mathe = mathe;
		this.franz = franz;
		this.englisch = englisch;
	}


	public Zeugnis() {
	}


	public float mathe; 
	public float franz; 
	public float englisch; 
	public float deutsch; 
	
	public String name; 
	
	
	public float berechneDurchschnitt(){
		float durchschnitt = 0;
		durchschnitt = (2 * mathe + 2 * deutsch + englisch + franz) / 6; 
		return durchschnitt; 
	}
	
	

}
