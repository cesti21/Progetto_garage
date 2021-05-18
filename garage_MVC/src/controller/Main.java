package controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Main {

	public static void main ( String[] args )
	  {
	      JFrame frame = new JFrame ( "Scrolling Banner" );
	      ScrollingBanner panel = new ScrollingBanner ( 899, 33 );
	      frame.getContentPane().add ( panel );
	      frame.setSize ( panel.width, panel.height );
	      frame.setVisible ( true );
	      frame.addWindowListener ( new WindowAdapter() {
	          public void windowClosing ( WindowEvent evt ) {
	              System.exit ( 0 );
	          }
	      } );
	  }
	}

