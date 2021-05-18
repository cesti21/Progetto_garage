package main;

import controller.Controller;
import controller.ScrollingBanner;
import model.Veicolo;
import view.Garage;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 * questa classe fa partire l'esecuzione del programma
 * 
 * @author andrea cestaro e francesco marsura
 *
 */
public class Main {
	/**
	 * inizio esecuzione programma
	 * 
	 * @param args args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		DefaultListModel listModel = new DefaultListModel<>();
		Garage g = new Garage(listModel);
		Controller c = new Controller(listModel, g);
		g.setVisible(true);

	}

}
