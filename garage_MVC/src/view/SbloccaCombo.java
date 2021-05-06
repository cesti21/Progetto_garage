package view;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;

public class SbloccaCombo implements FocusListener {

	private JComboBox combo_entrata;
	private JComboBox combo_entrata_fur;
	private JComboBox combo_entrata_moto;

	public SbloccaCombo(JComboBox combo_entrata, JComboBox combo_entrata_fur, JComboBox combo_entrata_moto) {

		this.combo_entrata = combo_entrata;
		this.combo_entrata_fur = combo_entrata_fur;
		this.combo_entrata_moto = combo_entrata_moto;
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	private void sblocca() {
		// TODO Auto-generated method stub
		combo_entrata.addItem("ciao");
		combo_entrata.removeItem("ciao");
		if (combo_entrata_fur != null) {
			combo_entrata_fur.addItem("ciao");
			combo_entrata_fur.removeItem("ciao");
		}
		if (combo_entrata_moto != null) {
			combo_entrata_moto.addItem("ciao");
			combo_entrata_moto.removeItem("ciao");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		sblocca();

	}

}
