package strategy;

public class Monster {
	
	protected Angriffsart angriffsart;
	
	public Monster() {
		angriffsart = new AngriffsartStandard();
	}
	
	// Verhaltensweisen
	public void laufen() {
		System.out.println("Monster läuft");
	}
	
	public void schwimmen() {
		System.out.println("Monster schwimmt");
	}
	
	public void angreifen() {
		angriffsart.angriff();
	}
	
}
