package factory;

public class PizzaFabrik {

	public static PizzaInterface getPizza(String typ) {
		PizzaInterface pizza = null;
		
		if(typ.equals("Cheese")) {
			pizza = new CheesePizza();
		}else if(typ.equals("Peperoni")) {
			pizza = new PeperoniPizza();
		}else {
			pizza = new Margarita();
		}
		
		return pizza;
	}
	
}
