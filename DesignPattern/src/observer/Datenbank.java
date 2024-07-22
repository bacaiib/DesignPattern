package observer;

public class Datenbank implements IBeobachterInterface {

	public void speichern(Kunde kunde) {
		System.out.println( "daten in DB gespeichert. " + kunde.getNachname());
	}

	@Override
	public void update(Kunde kunde) {
		speichern(kunde);	
	}
	
	
}
