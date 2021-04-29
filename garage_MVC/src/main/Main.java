package main;

import controller.Controller;
import model.Veicolo;
import view.Garage;


import java.awt.EventQueue;

import javax.swing.DefaultListModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		DefaultListModel listModel = new DefaultListModel<>();
		Garage g = new Garage(listModel);
		Controller c = new Controller(listModel, g);
		g.setVisible(true);
	}

}
