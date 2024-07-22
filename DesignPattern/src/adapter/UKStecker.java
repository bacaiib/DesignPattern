package adapter;

public class UKStecker implements UKSteckerConnector{

	@Override
	public void provideElectricity() {
		System.out.println("UK-Stecker : Typ G");
	}

}
