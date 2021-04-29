package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model.Veicolo;
import view.Garage;

public class Controller implements ActionListener {
	private Veicolo d;
	private Garage g;
	private DefaultListModel<Veicolo> listModel;

	public Controller(DefaultListModel listModel, Garage g) {
		this.listModel = listModel;
		this.g = g;
		g.registraController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Veicolo d = listModel.getElementAt(g.list.getSelectedIndex());
		 d.setTarga(g.targa_auto.getText());
		 d.setModello(g.modello_auto.getText());
		 d.setCognome(g.cognome_auto.getText());
		 d.setCognome(g.nome_auto.getText());
		 listModel.setElementAt(d, g.list.getSelectedIndex());
	}

}
