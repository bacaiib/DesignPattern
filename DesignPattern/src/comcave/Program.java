package comcave;

import java.util.ArrayList;

import adapter.DESteckdose;
import adapter.DEStecker;
import adapter.DE_UK_Adapter;
import adapter.UKSteckdose;
import adapter.UKStecker;
import adapter.UKSteckerConnector;
import adapter.UK_DE_Adapter;
import adapter2.Artikel;
import adapter2.Item;
import adapter2.ItemToArtikelAdapter;
import builder.Auto;
import builder.Auto.Kraftstoff;
import builder.Auto.Typ;
import factory.PizzaFabrik;
import factory.PizzaInterface;
import factory.SommerTicket;
import factory.Ticket;
import factory.TicketFabrik;
import factory.WinterTicket;
import observer.Datenbank;
import observer.Export;
import observer.KundeGUI;
import observer.KundenAnzeigeGUI;
import observer.Mail;
import observer.Verwalter;
import singleton.Singleton;
import strategy.Drache;
import strategy.Monster;
import strategy.Zauberer;
import strategy.Zyklop;

public class Program {

	public static void main(String[] args) {
		System.out.println("Design-Pattern / Entwurfsmuster");
		
		// Singleton
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println( s1.equals(s2) );
		//---------------------------------------------
		
		
		// Observer Pattern
		
		// Auslöser Neue/geänderte Daten
		KundeGUI kundegui = new KundeGUI();
		kundegui.setVisible(true);
		
		// Observer/Beobachter, warten auf neue/geänderte Daten
		Datenbank db = new Datenbank();
		Mail mail = new Mail();
		Export export = new Export();
		KundenAnzeigeGUI anzeige = new KundenAnzeigeGUI();
		anzeige.setVisible(true);
		
		
		// Anmeldung der Beobachter
		Verwalter.getInstance().anmelden(db);
		Verwalter.getInstance().anmelden(mail);
		//Verwalter.getInstance().abmelden(mail);
		Verwalter.getInstance().anmelden(export);
		Verwalter.getInstance().anmelden(anzeige);
		
		//----------------------------------------------------------
		
		// Builder / Erbauer Pattern
		
		// OHNE Builder
		/*
		Auto auto1 = new Auto();
		auto1.setPs(1);
		auto1.setAnzahlSitze(50);
		auto1.setTyp(Typ.SPORTWAGEN);
		auto1.setKraftstoff(Kraftstoff.DIESEL);
		
		System.out.println(auto1.getPs());
		*/
		
		Auto ferrari = new Auto.Erbauer(Typ.SPORTWAGEN).kraftstoff(Kraftstoff.ELEKTRO).erbaue();
		System.out.println(ferrari.getTyp());
		System.out.println(ferrari.getPs());
		System.out.println(ferrari.getAnzahlSitze());
		System.out.println(ferrari.getKraftstoff());
		
		
		Auto ford_escord = new Auto.Erbauer(Typ.LIMOUSINE).anzahlSitze(5).kraftstoff(Kraftstoff.ELEKTRO).ps(250).erbaue();
		System.out.println(ford_escord.getTyp());
		System.out.println(ford_escord.getPs());
		System.out.println(ford_escord.getAnzahlSitze());
		System.out.println(ford_escord.getKraftstoff());
		
		// Factory Pattern / Fabrik Muster
		
		// Ohne Factory Pattern:
		/*
		Ticket t1;
		// Wenn Sommer (April bis Oktober) Dann
		t1 = new SommerTicket();
		// Wenn Winter (November bis März) Dann
		t1 = new WinterTicket();
		
		t1.drucken();
		*/
		
		
		// Mit Factory:
		Ticket t1 = TicketFabrik.getTicket(); // Farbik-Klasse/Fabrik-Methode liefert das richtige Objekt der Subklasse
		t1.drucken();
		
		PizzaInterface pizza = PizzaFabrik.getPizza("Peperoni");
		pizza.backen();
		
		// --------------------------------------------------------------------
		
		// Adapter Pattern
		DEStecker deStecker = new DEStecker();
		DESteckdose deSteckdose = new DESteckdose();
		deSteckdose.plugIn(deStecker);
		
		UKStecker ukStecker = new UKStecker();
		UKSteckdose ukSteckdose = new UKSteckdose();
		ukSteckdose.plugIn(ukStecker);
		
		// Ohne Adapter - funktioniert NICHT
		//deSteckdose.plugIn(ukStecker);
		//ukSteckdose.plugIn(deStecker);
		
		System.out.println("Mit Adapter:");
		DE_UK_Adapter de_uk_adapter = new DE_UK_Adapter(deStecker);
		ukSteckdose.plugIn(de_uk_adapter);
		
		UK_DE_Adapter uk_de_adapter = new UK_DE_Adapter(ukStecker);
		deSteckdose.plugIn(uk_de_adapter);
		//-------------------------------------------------------
		// Adapter Beispiel Artikel
		
		ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
		Artikel a1 = new Artikel(123, "IPhone", 1000.5f);
		artikelListe.add(a1);
		
		Item i1 = new Item("124", "Samsung Galaxy", 1300.55);
		//artikelListe.add(i1);
		
		ItemToArtikelAdapter adapter1 = new ItemToArtikelAdapter(i1);
		artikelListe.add(adapter1);
		
		for(Artikel artikel : artikelListe) {
			System.out.println( artikel.getNummer() );
			System.out.println( artikel.getBezeichnung() );
			System.out.println( artikel.getPreis() );
			System.out.println();
		}
		
		// -----------------------------------------------------------
		// Strategy Pattern / Stragie Entwurfsmuster
		// viele verwandte Klassen die sich durch ihre Verhaltensweisen(Methoden) unterscheiden
		// verschiedene austauschbare Algorithmen in ihren Verhaltensweisen haben
		// flexibilität, austauschbarkeit, leichtere Änderbarkeit/Wartbarkeit
		// Erweiterbarkeit!!!
		
		System.out.println("Monster:");
		Monster monster1 = new Monster();
		monster1.laufen();
		monster1.schwimmen();
		monster1.angreifen();
		
		System.out.println("Drache:");
		Monster monster2 = new Drache();
		monster2.laufen();
		monster2.schwimmen();
		monster2.angreifen();
		
		System.out.println("Zauberer:");
		Monster monster3 = new Zauberer();
		monster3.laufen();
		monster3.schwimmen();
		monster3.angreifen();
		
		System.out.println("Zyklop:");
		Monster monster4 = new Zyklop();
		monster4.laufen();
		monster4.schwimmen();
		monster4.angreifen();
		
		// Aufgabe Erweiterung des Strategy Muster um eine weiter Monster-Unterart
		// mit einer Neuen Angriffsart, z.B. Jedi + Lichtschwert
		
		
		
		
	}

}
