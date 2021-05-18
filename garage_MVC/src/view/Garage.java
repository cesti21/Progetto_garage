package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import controller.Controller;
import model.Veicolo;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Panel;
import java.awt.CardLayout;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * questa classe crea la grafica
 * 
 * @author andrea cestaro e francesco marsura
 *
 */
public class Garage {

	private JFrame frame;
	private Panel panel_1;
	private Panel panel_2;
	private Panel panel_3;
	private Panel panel_4;
	public JTextField modello_auto;
	public JTextField cognome_auto;
	public JTextField nome_auto;
	public JTextField targa_auto;
	public JTextField cognome_fur;
	public JTextField modello_fur;
	public JTextField nome_fur;
	public JTextField targa_fur;
	public JTextField cognome_moto;
	public JTextField modello_moto;
	public JTextField nome_moto;
	public JTextField targa_moto;
	public JList<Veicolo> list;
	public DefaultListModel<Veicolo> listModel;
	public JTextField targa;
	public JTextField modello;
	public JTextField cognome;
	public JTextField nome;
	private JButton btnModificaMezzo;
	private JButton btnSalvaAuto;
	private JButton btnSalvaFur;
	private JButton btnSalvaMoto;
	private JButton btnCancella;
	private JButton btnPosti;
	private JButton btnPosti_1;
	private JButton btnHomeAuto;
	private JButton btnHomeFur;
	private JButton btnHomeMoto;
	private JButton btnHomeInfo;
	private JButton btnCosto;
	public JComboBox combo_entrata;
	public JComboBox combo_uscita;
	public JComboBox combo_entrata_fur;
	public JComboBox combo_uscita_fur;
	public JComboBox combo_entrata_moto;
	public JComboBox combo_uscita_moto;
	private JLabel lblMoto;
	private JLabel lblFur;
	private JButton btnCrediti;

	/**
	 * costruttore garage
	 * 
	 * @param listModel listmodel
	 */
	public Garage(DefaultListModel listModel) {
		initialize();
		this.listModel = listModel;
		list.setModel(listModel);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 897, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		Panel panel = new Panel();
		panel.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(panel, "name_779414315319400");

		JButton btnInformazioni = new JButton("INFORMAZIONI");
		btnInformazioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		btnInformazioni.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnInformazioni.setBackground(Color.WHITE);

		JButton btnAuto = new JButton("AUTO");
		btnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				// System.out.println(combo_entrata.getModel().getSize());
				combo_entrata.addItem("ciao");
				combo_entrata.removeItem("ciao");

			}
		});
		btnAuto.setForeground(Color.BLACK);
		btnAuto.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnAuto.setBackground(Color.WHITE);

		JButton btnFurgone = new JButton("FURGONE");
		btnFurgone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_2.setVisible(true);
				combo_entrata_fur.addItem("ciao");
				combo_entrata_fur.removeItem("ciao");
			}
		});
		btnFurgone.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnFurgone.setBackground(Color.WHITE);

		JButton btnMoto = new JButton("MOTO");
		btnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_3.setVisible(true);
				combo_entrata_moto.addItem("ciao");
				combo_entrata_moto.removeItem("ciao");
			}
		});
		btnMoto.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnMoto.setBackground(Color.WHITE);

		JLabel lblNewLabel = new JLabel("THE GARAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Playbill", Font.PLAIN, 55));

		btnPosti = new JButton("POSTI DISPONIBILI");
		btnPosti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPosti.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnPosti.setBackground(Color.WHITE);

		lblMoto = new JLabel("");
		lblMoto.setIcon(new ImageIcon(Garage.class.getResource("/view/moto.png")));

		lblFur = new JLabel("");
		lblFur.setIcon(new ImageIcon(Garage.class.getResource("/view/furgone.png")));

		JLabel lblMacchina = new JLabel("");
		lblMacchina.setIcon(new ImageIcon(Garage.class.getResource("/view/auto.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(177).addComponent(btnInformazioni).addGap(84)
						.addComponent(btnPosti).addContainerGap(155, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addGap(130).addComponent(btnAuto)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblMacchina, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addGap(54).addComponent(btnFurgone).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblFur).addGap(40).addComponent(btnMoto)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblMoto, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(335, Short.MAX_VALUE)
						.addComponent(lblNewLabel).addGap(335)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblMoto, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblFur, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblMacchina, 0, 0, Short.MAX_VALUE)
														.addGroup(Alignment.TRAILING,
																gl_panel.createParallelGroup(Alignment.BASELINE)
																		.addComponent(btnAuto).addComponent(btnFurgone)
																		.addComponent(btnMoto))))))
						.addGap(52)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(btnInformazioni)
								.addComponent(btnPosti, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(97, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		panel_1 = new Panel();
		panel_1.setBackground(new Color(0, 255, 127));

		frame.getContentPane().add(panel_1, "name_779424883668900");

		btnHomeAuto = new JButton("HOME");
		btnHomeAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});

		modello_auto = new JTextField();
		modello_auto.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("TARGA");

		JLabel lblNewLabel_3 = new JLabel("DATI AUTO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		cognome_auto = new JTextField();
		cognome_auto.setColumns(10);

		nome_auto = new JTextField();
		nome_auto.setColumns(10);

		targa_auto = new JTextField();
		targa_auto.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("MODELLO");

		JLabel lblNewLabel_5 = new JLabel("COGNOME");

		JLabel lblNewLabel_6 = new JLabel("NOME");

		btnSalvaAuto = new JButton("SALVA AUTO");
		btnSalvaAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		combo_entrata = new JComboBox();
		SbloccaCombo sbloccatore = new SbloccaCombo(combo_entrata, combo_entrata_fur, combo_entrata_moto);
		targa_auto.addFocusListener(sbloccatore);
		modello_auto.addFocusListener(sbloccatore);
		cognome_auto.addFocusListener(sbloccatore);
		nome_auto.addFocusListener(sbloccatore);
		combo_entrata.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO ENTRATA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

		combo_uscita = new JComboBox();
		combo_uscita.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO USCITA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1.createSequentialGroup()
						.addGap(244)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_5)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4).addComponent(lblNewLabel_2,
														GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_6))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(cognome_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(targa_auto, GroupLayout.PREFERRED_SIZE, 229,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(modello_auto, GroupLayout.PREFERRED_SIZE, 229,
														GroupLayout.PREFERRED_SIZE))
										.addGap(52)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(combo_uscita, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(combo_entrata, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(360).addComponent(lblNewLabel_3,
								GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
								.addComponent(btnHomeAuto, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGap(289).addComponent(btnSalvaAuto)))
				.addContainerGap(112, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(targa_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(combo_entrata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4).addComponent(combo_uscita, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
				.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHomeAuto, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvaAuto, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		panel_2 = new Panel();
		panel_2.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(panel_2, "name_91278755178400");

		btnHomeFur = new JButton("HOME");
		btnHomeFur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(true);
			}
		});

		btnSalvaFur = new JButton("SALVA FURGONE");
		btnSalvaFur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JLabel lblNewLabel_5_1 = new JLabel("COGNOME");

		JLabel lblNewLabel_4_1 = new JLabel("MODELLO");

		JLabel lblNewLabel_2_1 = new JLabel("TARGA");

		JLabel lblNewLabel_6_1 = new JLabel("NOME");

		cognome_fur = new JTextField();
		cognome_fur.setColumns(10);

		modello_fur = new JTextField();
		modello_fur.setColumns(10);

		nome_fur = new JTextField();
		nome_fur.setColumns(10);

		targa_fur = new JTextField();
		targa_fur.setColumns(10);

		JLabel lblNewLabel_3_1 = new JLabel("DATI FURGONE");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		combo_entrata_fur = new JComboBox();
		SbloccaCombo sbloccatore1 = new SbloccaCombo(combo_entrata_fur, combo_entrata, combo_entrata_moto);

		targa_fur.addFocusListener(sbloccatore1);
		modello_fur.addFocusListener(sbloccatore1);
		cognome_fur.addFocusListener(sbloccatore1);
		nome_fur.addFocusListener(sbloccatore1);
		combo_entrata_fur.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO ENTRATA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

		combo_uscita_fur = new JComboBox();
		combo_uscita_fur.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO USCITA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(244)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
										.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_5_1)
										.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4_1).addComponent(lblNewLabel_2_1,
														GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblNewLabel_6_1))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel_2
										.createParallelGroup(Alignment.LEADING)
										.addComponent(cognome_fur, GroupLayout.PREFERRED_SIZE, 229,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nome_fur, GroupLayout.PREFERRED_SIZE, 229,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_2.createSequentialGroup()
														.addComponent(targa_fur, GroupLayout.PREFERRED_SIZE, 229,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(combo_entrata_fur,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel_2.createSequentialGroup()
														.addComponent(modello_fur, GroupLayout.PREFERRED_SIZE, 229,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(combo_uscita_fur,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
								.addComponent(btnHomeFur, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGap(267).addComponent(btnSalvaFur))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(360).addComponent(lblNewLabel_3_1)))
						.addContainerGap(152, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_2
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(targa_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(combo_entrata_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1).addComponent(combo_uscita_fur, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1))
				.addGap(18)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1))
				.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHomeFur, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvaFur, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		panel_2.setLayout(gl_panel_2);

		panel_3 = new Panel();
		panel_3.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(panel_3, "name_91363835423600");

		btnHomeMoto = new JButton("HOME");
		btnHomeMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel.setVisible(true);
			}
		});

		btnSalvaMoto = new JButton("SALVA MOTO");
		btnSalvaMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JLabel lblNewLabel_5_2 = new JLabel("COGNOME");

		JLabel lblNewLabel_4_2 = new JLabel("MODELLO");

		JLabel lblNewLabel_2_2 = new JLabel("TARGA");

		JLabel lblNewLabel_6_2 = new JLabel("NOME");

		cognome_moto = new JTextField();
		cognome_moto.setColumns(10);

		modello_moto = new JTextField();
		modello_moto.setColumns(10);

		nome_moto = new JTextField();
		nome_moto.setColumns(10);

		targa_moto = new JTextField();
		targa_moto.setColumns(10);

		JLabel lblNewLabel_3_2 = new JLabel("DATI MOTO");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		combo_entrata_moto = new JComboBox();
		SbloccaCombo sbloccatore2 = new SbloccaCombo(combo_entrata, combo_entrata_fur, combo_entrata_moto);

		targa_moto.addFocusListener(sbloccatore2);
		modello_moto.addFocusListener(sbloccatore2);
		cognome_moto.addFocusListener(sbloccatore2);
		nome_moto.addFocusListener(sbloccatore2);
		combo_entrata_moto.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO ENTRATA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

		combo_uscita_moto = new JComboBox();
		combo_uscita_moto.setModel(
				new DefaultComboBoxModel(new String[] { "ORARIO USCITA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup().addGap(244)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
										.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_5_2)
										.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4_2).addComponent(lblNewLabel_2_2,
														GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblNewLabel_6_2))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
										.addComponent(cognome_moto, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(
												nome_moto, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
												.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
														.addComponent(targa_moto, GroupLayout.PREFERRED_SIZE, 229,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(modello_moto, GroupLayout.PREFERRED_SIZE, 229,
																GroupLayout.PREFERRED_SIZE))
												.addGap(63)
												.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
														.addComponent(combo_uscita_moto, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(combo_entrata_moto, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
								.addComponent(btnHomeMoto, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGap(266).addComponent(btnSalvaMoto, GroupLayout.PREFERRED_SIZE, 120,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup().addGap(360).addComponent(lblNewLabel_3_2,
								GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(208, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(targa_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(combo_entrata_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_2).addComponent(combo_uscita_moto, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_2))
				.addGap(18)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_2))
				.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHomeMoto, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvaMoto, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		panel_3.setLayout(gl_panel_3);

		panel_4 = new Panel();
		panel_4.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(panel_4, "name_93696244716700");

		JLabel lblNewLabel_3_2_1 = new JLabel("INFORMAZIONI");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		list = new JList();

		JLabel lblNewLabel_7 = new JLabel("0,50\u20AC all'ora");

		btnHomeInfo = new JButton("HOME");
		btnHomeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(false);
				panel.setVisible(true);
			}
		});

		btnCancella = new JButton("USCITA");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnModificaMezzo = new JButton("MODIFICA MEZZO");
		btnModificaMezzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		targa = new JTextField();
		targa.setColumns(10);

		modello = new JTextField();
		modello.setColumns(10);

		cognome = new JTextField();
		cognome.setColumns(10);

		nome = new JTextField();
		nome.setColumns(10);

		btnPosti_1 = new JButton("POSTI DISPONIBILI");
		btnPosti_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPosti_1.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnPosti_1.setBackground(new Color(240, 240, 240));

		btnCosto = new JButton("CALCOLA COSTO");
		btnCosto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JLabel lblNewLabel_1 = new JLabel("TARGA");

		JLabel lblNewLabel_8 = new JLabel("MODELLO");

		JLabel lblNewLabel_9 = new JLabel("COGNOME");

		JLabel lblNewLabel_10 = new JLabel("NOME");

		btnCrediti = new JButton("CREDITI");
		btnCrediti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCrediti.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnCrediti.setBackground(new Color(240, 240, 240));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addGap(362).addComponent(lblNewLabel_3_2_1))
						.addGroup(gl_panel_4.createSequentialGroup().addGap(102).addComponent(lblNewLabel_1))
						.addGroup(gl_panel_4.createSequentialGroup().addGroup(gl_panel_4
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
												.addComponent(targa, GroupLayout.PREFERRED_SIZE, 229,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnHomeInfo, GroupLayout.PREFERRED_SIZE, 78,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(cognome, GroupLayout.PREFERRED_SIZE, 229,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_4.createSequentialGroup().addGap(102).addComponent(lblNewLabel_10))
								.addGroup(gl_panel_4.createSequentialGroup().addGap(92).addComponent(lblNewLabel_9))
								.addGroup(gl_panel_4.createSequentialGroup().addGap(95).addComponent(lblNewLabel_8))
								.addGroup(gl_panel_4.createSequentialGroup().addContainerGap().addComponent(modello,
										GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
								.addGap(21)
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addComponent(btnCancella)
										.addGroup(gl_panel_4.createSequentialGroup().addComponent(lblNewLabel_7)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnCosto))
										.addComponent(btnModificaMezzo, GroupLayout.PREFERRED_SIZE, 140,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addComponent(nome, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnPosti_1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnCrediti, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(108, Short.MAX_VALUE)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_4
				.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_3_2_1)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel_1)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_panel_4.createSequentialGroup()
								.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
										.addGroup(gl_panel_4.createSequentialGroup()
												.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_7).addComponent(btnCosto))
												.addGap(12).addComponent(btnCancella).addGap(13)
												.addComponent(btnModificaMezzo))
										.addComponent(list, GroupLayout.PREFERRED_SIZE, 114,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(
								gl_panel_4.createSequentialGroup()
										.addComponent(targa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(4).addComponent(lblNewLabel_8).addGap(3)
										.addComponent(modello, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_9).addGap(1)
										.addComponent(cognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(2).addComponent(lblNewLabel_10).addGap(6)))
				.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
								.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
								.addComponent(btnHomeInfo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup().addGap(15)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCrediti, GroupLayout.PREFERRED_SIZE, 37,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPosti_1, GroupLayout.PREFERRED_SIZE, 37,
												GroupLayout.PREFERRED_SIZE))))
				.addContainerGap()));
		panel_4.setLayout(gl_panel_4);

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// Se l'utente seleziona un elemento della lista
				// popoliamo le caselle di testo con l'elemento selezionato
				/*
				 * System.out.println(list.getSelectedIndex());
				 * System.out.println(listModel.getSize());
				 */
				if (list.getSelectedIndex() >= 0) {

					Veicolo d = listModel.getElementAt(list.getSelectedIndex());
					targa.setText(d.getTarga() + "");
					modello.setText(d.getModello() + "");
					cognome.setText(d.getCognome() + "");
					nome.setText(d.getNome() + "");
				}

			}
		});
	}

	/**
	 * 
	 * @param b b
	 */
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	/**
	 * fa eseguire delle operazioni tramite la classe controller
	 * 
	 * @param controller controller
	 */
	public void registraController(Controller controller) {
		// TODO Auto-generated method stub
		btnModificaMezzo.addActionListener(controller);
		btnSalvaAuto.addActionListener(controller);
		btnSalvaFur.addActionListener(controller);
		btnSalvaMoto.addActionListener(controller);
		btnCancella.addActionListener(controller);
		btnPosti_1.addActionListener(controller);
		btnPosti.addActionListener(controller);
		btnCosto.addActionListener(controller);
		btnCrediti.addActionListener(controller);
		combo_entrata.addActionListener(controller);
	}
}
