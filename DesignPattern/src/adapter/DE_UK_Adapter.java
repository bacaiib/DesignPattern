package adapter;

public class DE_UK_Adapter implements UKSteckerConnector{
	private DESteckerConnector deSteckerConnector;
	
	public DE_UK_Adapter(DESteckerConnector deSteckerConnector) {
		this.deSteckerConnector = deSteckerConnector;
	}

	@Override
	public void provideElectricity() {
		this.deSteckerConnector.giveElectricity();
	}
	
}
