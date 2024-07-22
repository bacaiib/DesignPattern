package singleton;

public class Singleton {
	private static Singleton singleton = null;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	private Singleton() {
		System.out.println("Konstruktor ausgeführt");
		
	}
	
}
