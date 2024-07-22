package factory;

public class WinterTicket extends Ticket{
	// spezielle Eigenschaften & Methoden eines Wintertickets
	
	public WinterTicket() {
		
	}	
	
	public WinterTicket(String bezeichnung) {
		super(bezeichnung);
	}
	
	@Override
	public void drucken() {
		System.out.println("Winter-Ticket wird gedruckt");
	}
}
