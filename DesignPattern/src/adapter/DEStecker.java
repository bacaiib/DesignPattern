package adapter;

public class DEStecker implements DESteckerConnector{

	@Override
	public void giveElectricity() {
		System.out.println("DE-Stecker : Typ F");		
	}
	
}
