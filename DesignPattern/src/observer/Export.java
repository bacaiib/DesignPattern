package observer;

public class Export implements IBeobachterInterface{

	public void exportieren(Kunde kunde) {
		System.out.println("Kunden Daten exportiert. " + kunde.getNachname());
	}

	@Override
	public void update(Kunde kunde) {
		exportieren(kunde);
	}
	
}
