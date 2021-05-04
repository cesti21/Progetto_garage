package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Veicolo;
import view.Garage;

public class Controller implements ActionListener {
	private Veicolo d;
	private Garage g;
	int posti = 5;
	private DefaultListModel<Veicolo> listModel;

	public Controller(DefaultListModel listModel, Garage g) {
		this.listModel = listModel;
		this.g = g;
		g.registraController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * JButton b = (JButton) arg0.getSource(); Panel p = (Panel) b.getParent();
		 */
		if (arg0.getActionCommand().equalsIgnoreCase("SALVA AUTO")) {
			String a = g.targa_auto.getText();
			String b = g.modello_auto.getText();
			String c = g.cognome_auto.getText();
			String e = g.nome_auto.getText();
			Veicolo temporanei = new Veicolo(a, b, c, e, null);
			System.out.println("salva auto");
			if (posti <= 5 && posti > 0) {
				g.listModel.addElement(temporanei);
				posti = posti - 1;
				g.targa_auto.setText("");
				g.modello_auto.setText("");
				g.cognome_auto.setText("");
				g.nome_auto.setText("");
				JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
			} else {
				JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
			}
		}
		if (arg0.getActionCommand().equalsIgnoreCase("SALVA FURGONE")) {
			String f = g.targa_fur.getText();
			String h = g.modello_fur.getText();
			String i = g.cognome_fur.getText();
			String l = g.nome_fur.getText();
			Veicolo temporanei = new Veicolo(f, h, i, l, null);
			System.out.println("salva fur");
			if (posti <= 5 && posti > 0) {
				g.listModel.addElement(temporanei);
				posti = posti - 1;
				g.targa_fur.setText("");
				g.modello_fur.setText("");
				g.cognome_fur.setText("");
				g.nome_fur.setText("");
				JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
			} else {
				JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
			}
		}
		if (arg0.getActionCommand().equalsIgnoreCase("SALVA MOTO")) {
			String m = g.targa_moto.getText();
			String n = g.modello_moto.getText();
			String o = g.cognome_moto.getText();
			String p = g.nome_moto.getText();
			Veicolo temporanei = new Veicolo(m, n, o, p, null);
			System.out.println("salva moto");
			if (posti <= 5 && posti > 0) {
				g.listModel.addElement(temporanei);
				posti = posti - 1;
				g.targa_moto.setText("");
				g.modello_moto.setText("");
				g.cognome_moto.setText("");
				g.nome_moto.setText("");
				JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
			} else {
				JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
			}

		}
		if (arg0.getActionCommand().equalsIgnoreCase("USCITA")) {
			System.out.println("uscita");
			g.listModel.removeElementAt(g.list.getSelectedIndex());
			posti = posti + 1;
			JOptionPane.showMessageDialog(null, "ARRIVEDERCI");
		}
		if (arg0.getActionCommand().equalsIgnoreCase("MODIFICA MEZZO")) {
			Veicolo d = g.listModel.getElementAt(g.list.getSelectedIndex());
			d.setTarga(g.targa.getText());
			d.setModello(g.modello.getText());
			d.setCognome(g.cognome.getText());
			d.setNome(g.nome.getText());
			listModel.setElementAt(d, g.list.getSelectedIndex());
			g.listModel.setElementAt(d, g.list.getSelectedIndex());
			g.targa.setText("");
			g.modello.setText("");
			g.cognome.setText("");
			g.nome.setText("");
			JOptionPane.showMessageDialog(null, "MODIFICATO CON SUCCESSO");

		}
		if (arg0.getActionCommand().equalsIgnoreCase("POSTI DISPONIBILI")) {
			JOptionPane.showMessageDialog(null, "rimangono " + posti + " posti");
		}

	}
}
