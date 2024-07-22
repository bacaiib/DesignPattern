package factory;

public class PeperoniPizza implements PizzaInterface{
	public PeperoniPizza() {
		System.out.println("Peperoni Pizza wurde erzeugt");
	}
	
	@Override
	public void backen() {
		System.out.println("Pizza mit viel Peperoni ist fertig gebacken");
	}
}
