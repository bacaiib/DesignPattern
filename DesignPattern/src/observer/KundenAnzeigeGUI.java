package observer;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class KundenAnzeigeGUI extends JFrame implements IBeobachterInterface{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JScrollPane scrollpane;
	JList liste;
	DefaultListModel dlm;
	
	public KundenAnzeigeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		scrollpane = new JScrollPane();
		contentPane.add(scrollpane);
		
		dlm = new DefaultListModel();
		liste = new JList(dlm);
		scrollpane.setViewportView(liste);
	}

	@Override
	public void update(Kunde kunde) {
		dlm.addElement( kunde.getVorname() + " " + kunde.getNachname() );
	}

}
