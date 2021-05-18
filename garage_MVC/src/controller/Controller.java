package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Veicolo;
import view.Garage;

/**
 * questa classe esegue le operazioni del programma
 * 
 * @author andrea cestaro e francesco marsura
 *
 */
public class Controller implements ActionListener {

	private Veicolo d;
	private Garage g;
	int posti = 5;
	int ora;
	int ore;
	float prezzo;

	private DefaultListModel<Veicolo> listModel;

	/**
	 * costruzione controller
	 * 
	 * @param listModel lista di veicoli
	 * @param g         collegamento a garage
	 */
	public Controller(DefaultListModel listModel, Garage g) {
		this.listModel = listModel;
		this.g = g;
		g.registraController(this);
	}

	@Override
	/**
	 * esegue tutte le operazioni del programma: salvataggio veicolo, controllo che
	 * tutti i campi siano riempiti, eliminazione e modifica del veicolo, esecuzione
	 * di tutte le varie eccezioni possibili
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equalsIgnoreCase("SALVA AUTO")) {
			String a = g.targa_auto.getText();
			String b = g.modello_auto.getText();
			String c = g.cognome_auto.getText();
			String e = g.nome_auto.getText();
			if (c.matches(".*\\d.*")) {
				JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL COGNOME!");
			} else {
				if (e.matches(".*\\d.*")) {
					JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL NOME!");
				} else {
					if (g.combo_entrata.getSelectedIndex() > 0 && g.combo_uscita.getSelectedIndex() > 0) {
						String n1 = g.combo_entrata.getSelectedItem().toString();
						String n2 = g.combo_uscita.getSelectedItem().toString();

						int en = Integer.parseInt(n1);
						int us = Integer.parseInt(n2);

						ora = us - en;
					}
					ore = ora;
					if (ore < 0) {
						ore = 24 + ore;
					}
					if (a.equals("") || b.equals("") || c.equals("") || e.equals("")
							|| g.combo_entrata.getSelectedIndex() == 0 || g.combo_uscita.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "TUTTI I CAMPI DEVONO ESSERE COMPILATI!!");
					} else {
						Veicolo temporanei = new Veicolo(a, b, c, e, ore);
						if (posti <= 5 && posti > 0) {
							g.listModel.addElement(temporanei);
							posti = posti - 1;
							g.targa_auto.setText("");
							g.modello_auto.setText("");
							g.cognome_auto.setText("");
							g.nome_auto.setText("");
							g.combo_entrata.setSelectedIndex(0);
							g.combo_uscita.setSelectedIndex(0);

							JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
						} else {
							JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
						}
					}
				}
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("SALVA FURGONE")) {
			String f = g.targa_fur.getText();
			String h = g.modello_fur.getText();
			String i = g.cognome_fur.getText();
			String l = g.nome_fur.getText();
			if (i.matches(".*\\d.*")) {
				JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL COGNOME!");
			} else {
				if (l.matches(".*\\d.*")) {
					JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL NOME!");
				} else {
					if (g.combo_entrata_fur.getSelectedIndex() > 0 && g.combo_uscita_fur.getSelectedIndex() > 0) {
						String n3 = g.combo_entrata_fur.getSelectedItem().toString();
						String n4 = g.combo_uscita_fur.getSelectedItem().toString();

						int enf = Integer.parseInt(n3);
						int usf = Integer.parseInt(n4);

						ora = usf - enf;
					}
					ore = ora;
					if (ore < 0) {
						ore = 24 + ore;
					}
					if (f.equals("") || h.equals("") || i.equals("") || l.equals("")
							|| g.combo_entrata_fur.getSelectedIndex() == 0
							|| g.combo_uscita_fur.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "TUTTI I CAMPI DEVONO ESSERE COMPILATI!!");
					} else {
						Veicolo temporanei = new Veicolo(f, h, i, l, ore);
						if (posti <= 5 && posti > 0) {
							g.listModel.addElement(temporanei);
							posti = posti - 1;
							g.targa_fur.setText("");
							g.modello_fur.setText("");
							g.cognome_fur.setText("");
							g.nome_fur.setText("");
							g.combo_entrata_fur.setSelectedIndex(0);
							g.combo_uscita_fur.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
						} else {
							JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
						}
					}
				}
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("SALVA MOTO")) {
			String m = g.targa_moto.getText();
			String n = g.modello_moto.getText();
			String o = g.cognome_moto.getText();
			String p = g.nome_moto.getText();
			if (o.matches(".*\\d.*")) {
				JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL COGNOME!");
			} else {
				if (p.matches(".*\\d.*")) {
					JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL NOME!");
				} else {
					if (g.combo_entrata_moto.getSelectedIndex() > 0 && g.combo_uscita_moto.getSelectedIndex() > 0) {
						String n5 = g.combo_entrata_moto.getSelectedItem().toString();
						String n6 = g.combo_uscita_moto.getSelectedItem().toString();

						int enm = Integer.parseInt(n5);
						int usm = Integer.parseInt(n6);

						ora = usm - enm;
					}
					ore = ora;
					if (ore < 0) {
						ore = 24 + ore;
					}
					if (m.equals("") || n.equals("") || o.equals("") || p.equals("")
							|| g.combo_entrata_moto.getSelectedIndex() == 0
							|| g.combo_uscita_moto.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "TUTTI I CAMPI DEVONO ESSERE COMPILATI!!");
					} else {
						Veicolo temporanei = new Veicolo(m, n, o, p, ore);
						if (posti <= 5 && posti > 0) {
							g.listModel.addElement(temporanei);
							posti = posti - 1;
							g.targa_moto.setText("");
							g.modello_moto.setText("");
							g.cognome_moto.setText("");
							g.nome_moto.setText("");
							g.combo_entrata_moto.setSelectedIndex(0);
							g.combo_uscita_moto.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "SALVATO CON SUCCESSO");
						} else {
							JOptionPane.showMessageDialog(null, "POSTI ESAURITI");
						}
					}
				}
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("calcola costo")) {
			if (g.list.getSelectedIndex() > -1) {
				Veicolo d = g.listModel.getElementAt(g.list.getSelectedIndex());
				// System.out.println(ore);
				prezzo = ore * 0.5f;
				JOptionPane.showMessageDialog(null, "DEVI PAGARE " + prezzo + "€");
			} else {
				JOptionPane.showMessageDialog(null, "SELEZIONA UN VEICOLO");
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("USCITA")) {
			if (g.list.getSelectedIndex() > -1) {
				g.listModel.removeElementAt(g.list.getSelectedIndex());
				posti = posti + 1;
				g.targa.setText("");
				g.modello.setText("");
				g.cognome.setText("");
				g.nome.setText("");
				JOptionPane.showMessageDialog(null, "DEVI PAGARE " + prezzo + "€");
				JOptionPane.showMessageDialog(null, "ARRIVEDERCI");
			} else {
				JOptionPane.showMessageDialog(null, "SELEZIONA UN VEICOLO");
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("MODIFICA MEZZO")) {
			if (g.list.getSelectedIndex() > -1) {
				Veicolo d = g.listModel.getElementAt(g.list.getSelectedIndex());
				d.setTarga(g.targa.getText());
				d.setModello(g.modello.getText());
				d.setCognome(g.cognome.getText());
				d.setNome(g.nome.getText());
				if (d.getCognome().matches(".*\\d.*")) {
					JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL COGNOME!");
				} else {
					if (d.getNome().matches(".*\\d.*")) {
						JOptionPane.showMessageDialog(null, "NON CI POSSONO ESSERE NUMERI NEL NOME!");
					} else {
						listModel.setElementAt(d, g.list.getSelectedIndex());
						g.listModel.setElementAt(d, g.list.getSelectedIndex());
						g.targa.setText("");
						g.modello.setText("");
						g.cognome.setText("");
						g.nome.setText("");

						JOptionPane.showMessageDialog(null, "MODIFICATO CON SUCCESSO");
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "SELEZIONA UN VEICOLO");
				g.targa.setText("");
				g.modello.setText("");
				g.cognome.setText("");
				g.nome.setText("");
			}
		} else if (arg0.getActionCommand().equalsIgnoreCase("POSTI DISPONIBILI")) {
			JOptionPane.showMessageDialog(null, "RIMANGONO " + posti + " POSTI");
		} else if (arg0.getActionCommand().equalsIgnoreCase("CREDITI")) {
			JOptionPane.showMessageDialog(null, "in fase di sviluppo");
		}

	}
}
