package adapter2;

public class Artikel {

	private int nummer;
	private String bezeichnung;
	private float preis;
	
	public Artikel() {
		// TODO Auto-generated constructor stub
	}
	
	public Artikel(int nummer, String bezeichnung, float preis) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}

	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
	
}
