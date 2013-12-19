package ch.schumm.gina;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse modelliert ein Klassenzeugnis, sozusagen alle Zeugnisse einer Klasse.<br>
 * Diese Klasse aggregiert alles Zeugnisse einer Klasse und kann der/die beste einer Klasse herausfinden - und 
 * den besten Durchschnitt.  
 * 
 * @author Rémy Schumm
 *
 */
public class Klassenzeugnis {
	
	private List<Zeugnis> zeugnisse = new ArrayList<Zeugnis>(); 
	
	public void addZeugnis(Zeugnis zeugnis){
		this.zeugnisse.add(zeugnis); 	
	}
	
	public String getBesteR(){
		Zeugnis bestesZeugnis = sucheBestesZeugnis(); 
		return bestesZeugnis.name; 
	}
	
	public double getBesterDurchschnitt(){
		Zeugnis bestesZeugnis = sucheBestesZeugnis();
		return bestesZeugnis.berechneDurchschnitt(); 
	}

	private Zeugnis sucheBestesZeugnis() {
		double bisJetztBesterDurchschnitt = 0; 
		Zeugnis bestesZeugnis = null; 
		for (Zeugnis zeugnis : zeugnisse) {
			if (zeugnis.berechneDurchschnitt() > bisJetztBesterDurchschnitt){
				bisJetztBesterDurchschnitt = zeugnis.berechneDurchschnitt(); 
				bestesZeugnis = zeugnis; 
			}
		}
		return bestesZeugnis;
	}

}
