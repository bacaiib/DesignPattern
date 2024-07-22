package observer;

public class Mail implements IBeobachterInterface{

	public void senden(Kunde kunde) {
		System.out.println("Email an neuen Kunden gesendet. " + kunde.getNachname());
	}

	@Override
	public void update(Kunde kunde) {
		senden(kunde);
	}
	
}
