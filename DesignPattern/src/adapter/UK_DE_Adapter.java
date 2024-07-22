package adapter;

public class UK_DE_Adapter implements DESteckerConnector{
	private UKSteckerConnector ukSteckerConnector;
	
	public UK_DE_Adapter(UKSteckerConnector ukSteckerConnector){
		this.ukSteckerConnector = ukSteckerConnector;
	}
	
	@Override
	public void giveElectricity() {
		ukSteckerConnector.provideElectricity();		
	}
	
}
