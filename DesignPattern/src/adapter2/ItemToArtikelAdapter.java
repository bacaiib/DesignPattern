package adapter2;

public class ItemToArtikelAdapter extends Artikel{

	public ItemToArtikelAdapter(Item item) {
		super.setBezeichnung( item.getName() );
		super.setNummer( Integer.parseInt( item.getNr() ) );
		super.setPreis( (float)item.getPrice() );
	}
	
}
