package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * questa classe serve per utilizzare il thread
 * 
 * @author andrea cestaro e francesco marsura
 *
 */
public class ScrollingBanner extends JPanel implements Runnable {
	private Thread banner; // animazione thread
	private String text; // testo da visualizzare
	private Font font; // font per il testo
	public int width; // larghezza finestra
	public int height; // altezza finestra
	private int x, y; // posizione del testo
	private int delay; // intervallo tra i frame in millisecondi
	private int offset; // distanza tra i due frame
	private Dimension size; // dimensioni area visualizzazione
	private Image image; // controlla che l'immagine non esca dalla finestra
	private Graphics offScreen; // controlla che la grafica non esca dalla finestra

	/**
	 * costruisce la schermata e viene inserito il testo
	 * 
	 * @param aWidth  larghezza
	 * @param aHeight altezza
	 */
	public ScrollingBanner(int aWidth, int aHeight) {
		// setta dimensioni
		width = aWidth;
		height = aHeight;
		setSize(width, height);

		// Setta il testo
		text = new String("Programma pensato e sviluppato da Cestaro Andrea e Marsura Francesco");

		// Setta il font
		font = new Font("Sans-serif", Font.BOLD, 24);

		// setta intervallo di tempo
		delay = 10;

		// Setta i valori iniziali per x e y
		x = width / 2;
		y = height / 2;

		// Setta l'offset
		offset = 1;

		// crea e starta thread
		banner = new Thread(this);
		banner.start();
	}

	/**
	 * componenti grafici del frame
	 */
	public void paintComponent(Graphics g) {
		// grandezza area visualizzazione
		size = this.getSize();

		// crea l'off-screen image
		if (image == null) {
			image = createImage(size.width, size.height);
			offScreen = image.getGraphics();
		}

		// determina la lunghezza del testo
		offScreen.setFont(font);
		FontMetrics fm = g.getFontMetrics();
		int length = fm.stringWidth(text);

		// aggiusta la posizione del testo nel frame
		x = x - offset;

		// se il testo è completamente scomparso al sinistra sposta la posizione del
		// banner a destra
		if (x < -length)
			x = size.width;

		// setta colore background
		offScreen.setColor(Color.black);
		offScreen.fillRect(0, 0, size.width, size.height);

		// setta colore testo
		offScreen.setColor(Color.green);
		offScreen.drawString(text, x, y);

		// copia la off-screen image nello schermo
		g.drawImage(image, 0, 0, this);
	}

	public void update(Graphics g) {
		paintComponent(g);
	}

	/**
	 * elimina ogni volta il frame precedente e lo aggiorna
	 */
	public void run() {
		while (Thread.currentThread() == banner) {
			repaint();
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}