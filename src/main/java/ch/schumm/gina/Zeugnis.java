package ch.schumm.gina;

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
