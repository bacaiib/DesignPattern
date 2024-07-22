package builder;

public class Auto {
	private int ps;
	private int anzahlSitze;
	private Typ typ;
	private Kraftstoff kraftstoff;
	
	
	// interne Erbauer Klasse ist für das erzeugen der Autos verantwortlich und 
	// für die Zuweisung gültiger Eigenschaftswerte
	public static class Erbauer{
		private Auto auto;
		
		public Erbauer(Typ typ) {
			auto = new Auto();
			auto.typ = typ;
			auto.kraftstoff = Kraftstoff.BENZIN;
			
			if(typ == Typ.SPORTWAGEN) {
				auto.ps = 150;
				auto.anzahlSitze = 2;
			}else{
				auto.ps = 80;
				auto.anzahlSitze = 4;
			}
		}
		
		public Erbauer kraftstoff(Kraftstoff kraftstoff) {
			if(
				auto.typ == Typ.KOMBI | 
				auto.typ == Typ.LIMOUSINE | 
				auto.typ == Typ.VAN
			) {
				auto.kraftstoff = kraftstoff;
			}else if(auto.typ == Typ.SPORTWAGEN & kraftstoff == Kraftstoff.BENZIN) {
				auto.kraftstoff = kraftstoff;
			}else if(auto.typ == Typ.SUV & kraftstoff != Kraftstoff.ELEKTRO){
				auto.kraftstoff = kraftstoff;
			}
			
			return this;
		}
		
		public Erbauer ps(int ps) {
			if(auto.typ == Typ.SPORTWAGEN & (ps >= 120 & ps <= 300) ) {
				auto.ps = ps;
			}else if(auto.typ != Typ.SPORTWAGEN & (ps >= 45 & ps <= 200) ) {
				auto.ps = ps;
			}else {
				// gilt Default des Konstruktors
			}
			return this;
		}
		
		public Erbauer anzahlSitze(int sitze) {
			if(sitze == 2 & auto.typ == Typ.SPORTWAGEN) {
				auto.anzahlSitze = sitze;
			}else if(sitze == 5 & auto.typ != Typ.SPORTWAGEN ) {
				auto.anzahlSitze = sitze;
			}else if(sitze == 7 & auto.typ == Typ.VAN) {
				auto.anzahlSitze = sitze;
			}
			return this;
		}
		
		
		public Auto erbaue() {
			return auto;
		}
		
	}
	
	public Auto() {
		
	}

	public int getPs() {
		return ps;
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public Typ getTyp() {
		return typ;
	}

	public Kraftstoff getKraftstoff() {
		return kraftstoff;
	}

	public enum Kraftstoff{
		DIESEL,
		BENZIN,
		ELEKTRO
	}
	
	public enum Typ{
		SUV,
		LIMOUSINE,
		VAN,
		SPORTWAGEN,
		KOMBI
	}
}
