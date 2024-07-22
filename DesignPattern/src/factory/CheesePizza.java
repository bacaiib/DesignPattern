package factory;

public class CheesePizza implements PizzaInterface{
	public CheesePizza() {
		System.out.println("Cheese Pizza erzeugt");
	}

	@Override
	public void backen() {
		System.out.println("Pizza mit viel Käse ist fertig gebacken");
	}
}
