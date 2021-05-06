package view;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;

public class SbloccaCombo implements FocusListener{
	
	private JComboBox combo_entrata;
	
	public SbloccaCombo(JComboBox combo_entrata) {
		this.combo_entrata=combo_entrata;
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	private void sblocca() {
		// TODO Auto-generated method stub
		combo_entrata.addItem("ciao");
		combo_entrata.removeItem("ciao");
	}

	@Override
	public void focusLost(FocusEvent e) {
		sblocca();
		// TODO Auto-generated method stub
		
	}

}
