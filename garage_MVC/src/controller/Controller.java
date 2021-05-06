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
	int ora;
	int ore;
	private DefaultListModel<Veicolo> listModel;

	public Controller(DefaultListModel listModel, Garage g) {
		this.listModel = listModel;
		this.g = g;
		g.registraController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equalsIgnoreCase("SALVA AUTO")) {
			String a = g.targa_auto.getText();
			String b = g.modello_auto.getText();
			String c = g.cognome_auto.getText();
			String e = g.nome_auto.getText();
			if (g.combo_entrata.getSelectedIndex() > 0 && g.combo_uscita.getSelectedIndex() > 0) {
				String n1 = g.combo_entrata.getSelectedItem().toString();
				String n2 = g.combo_uscita.getSelectedItem().toString();

				int en = Integer.parseInt(n1);
				int us = Integer.parseInt(n2);

				ora = us - en;
				// System.out.println(ora);
			}
			int ore = ora;

			Veicolo temporanei = new Veicolo(a, b, c, e, ore);
			// System.out.println("salva auto");
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
		} else if (arg0.getActionCommand().equalsIgnoreCase("SALVA FURGONE")) {
			String f = g.targa_fur.getText();
			String h = g.modello_fur.getText();
			String i = g.cognome_fur.getText();
			String l = g.nome_fur.getText();
			if (g.combo_entrata_fur.getSelectedIndex() > 0 && g.combo_uscita_fur.getSelectedIndex() > 0) {
				String n3 = g.combo_entrata_fur.getSelectedItem().toString();
				String n4 = g.combo_uscita_fur.getSelectedItem().toString();

				int enf = Integer.parseInt(n3);
				int usf = Integer.parseInt(n4);

				ora = usf - enf;
				// System.out.println(ora);
			}
			int ore = ora;
			Veicolo temporanei = new Veicolo(f, h, i, l, ore);
			// System.out.println("salva fur");
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
		} else if (arg0.getActionCommand().equalsIgnoreCase("SALVA MOTO")) {
			String m = g.targa_moto.getText();
			String n = g.modello_moto.getText();
			String o = g.cognome_moto.getText();
			String p = g.nome_moto.getText();
			if (g.combo_entrata_moto.getSelectedIndex() > 0 && g.combo_uscita_moto.getSelectedIndex() > 0) {
				String n5 = g.combo_entrata_moto.getSelectedItem().toString();
				String n6 = g.combo_uscita_moto.getSelectedItem().toString();

				int enm = Integer.parseInt(n5);
				int usm = Integer.parseInt(n6);

				ora = usm - enm;
				// System.out.println(ora);
			}
			int ore = ora;
			Veicolo temporanei = new Veicolo(m, n, o, p, ore);
			// System.out.println("salva moto");
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

		} else if (arg0.getActionCommand().equalsIgnoreCase("USCITA")) {
			System.out.println("uscita");
			g.listModel.removeElementAt(g.list.getSelectedIndex());
			posti = posti + 1;
			JOptionPane.showMessageDialog(null, "ARRIVEDERCI");
		} else if (arg0.getActionCommand().equalsIgnoreCase("MODIFICA MEZZO")) {
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

		} else if (arg0.getActionCommand().equalsIgnoreCase("POSTI DISPONIBILI")) {
			JOptionPane.showMessageDialog(null, "rimangono " + posti + " posti");
		}
	}
}
