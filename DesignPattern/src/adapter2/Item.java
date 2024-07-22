package adapter2;

public class Item {
	private String nr;
	private String name;
	private double price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String nr, String name, double price) {
		this.nr = nr;
		this.name = name;
		this.price = price;
	}

	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
