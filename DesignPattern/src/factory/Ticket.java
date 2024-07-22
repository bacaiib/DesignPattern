package factory;

public abstract class Ticket {
	
	private String bezeichnung;
	
	public abstract void drucken();

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public Ticket() {
		
	}
	
	public Ticket(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}
