package factory;

public class Margarita implements PizzaInterface {

	public Margarita() {
		System.out.println("Standard-Pizza Margarita erzeugt");
	}
	
	@Override
	public void backen() {
		System.out.println("Heute backen wir Standard-Pizzen");
	}

}
