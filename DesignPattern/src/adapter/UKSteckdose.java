package adapter;

public class UKSteckdose {
	public void plugIn(UKSteckerConnector plug) {
		System.out.println("UK-Steckdose");
		plug.provideElectricity();
	}
}
