package observer;

import java.util.ArrayList;

public class Verwalter {
	private static Verwalter verwalter = null; // Singleton-Objekt Deklaration
	private ArrayList<IBeobachterInterface> beobachterListe;
	
	// Singleton-Methode
	public static Verwalter getInstance() {
		if(verwalter == null) {
			verwalter = new Verwalter(); // Nur 1 mal beim ersten Aufruf initialisiert
		}
		
		return verwalter;
	}
	
	
	public Verwalter() {
		beobachterListe = new ArrayList<IBeobachterInterface>();
	}
	
	public void anmelden(IBeobachterInterface beobachter) {
		beobachterListe.add(beobachter);
	}
	
	public void abmelden(IBeobachterInterface beobachter) {
		beobachterListe.remove(beobachter);
	}
	
	public void informiereBeobachter(Kunde kunde) {
		for(IBeobachterInterface beobachter : beobachterListe) {
			beobachter.update(kunde);
		}
	}
	
}
