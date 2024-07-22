package observer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KundeGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField textVorname;
	JTextField textNachname;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JButton btnKundeSpeichern;
		
	
	public KundeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textVorname = new JTextField();
		textVorname.setBounds(93, 35, 154, 20);
		contentPane.add(textVorname);
		textVorname.setColumns(10);
		
		textNachname = new JTextField();
		textNachname.setBounds(93, 78, 154, 20);
		contentPane.add(textNachname);
		textNachname.setColumns(10);
		
		lblNewLabel = new JLabel("Vorname");
		lblNewLabel.setBounds(10, 38, 73, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nachname");
		lblNewLabel_1.setBounds(10, 81, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		btnKundeSpeichern = new JButton("speichern");
		btnKundeSpeichern.addActionListener(this);
		btnKundeSpeichern.setBounds(93, 123, 131, 23);
		contentPane.add(btnKundeSpeichern);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnKundeSpeichern) {
			do_btnKundeSpeichern_actionPerformed(e);
		}
	}
	protected void do_btnKundeSpeichern_actionPerformed(ActionEvent e) {
		Kunde kunde = new Kunde(textVorname.getText(), textNachname.getText());
		
		// ohne Observer Pattern
		/*
		Datenbank db = new Datenbank();
		db.speichern(kunde);
		
		Mail mail = new Mail();
		mail.senden(kunde);
		*/
		
		// mit Observer Pattern
		Verwalter.getInstance().informiereBeobachter(kunde);
		
	}
}
