package adapter;

public class DESteckdose {

	public void plugIn(DESteckerConnector plug) {
		System.out.println("DE-Steckdose");
		plug.giveElectricity();
	}
	
}
