package factory;

public class SommerTicket extends Ticket{
	// spezielle Eigenschaften & Methoden eines Sommertickets
	
	public SommerTicket() {
		
	}
	
	public SommerTicket(String bezeichnung) {
		super(bezeichnung);
	}

	@Override
	public void drucken() {
		System.out.println("Sommer-Ticket wird gedruckt");
		
	}

}
