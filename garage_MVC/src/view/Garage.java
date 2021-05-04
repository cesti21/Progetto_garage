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
	private JTextField cognome_fur;
	private JTextField modello_fur;
	private JTextField nome_fur;
	private JTextField targa_fur;
	private JTextField cognome_moto;
	private JTextField modello_moto;
	private JTextField nome_moto;
	private JTextField targa_moto;
	public JList<Veicolo> list;
	DefaultListModel<Veicolo> listModel;
	private JTextField targa;
	private JTextField modello;
	private JTextField cognome;
	private JTextField nome;
	private JButton btnModificaMezzo;
	private JComboBox combo_entrata;
	private JComboBox combo_uscita;
	//int i=0;

	int posti = 25;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 * 
	 * @param listModel2
	 */
	public Garage(DefaultListModel listModel) {
		initialize();
		this.listModel = listModel;
		list.setModel(listModel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 864, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		Panel panel = new Panel();
		frame.getContentPane().add(panel, "name_779414315319400");

		JButton btnInformazioni_1_1 = new JButton("INFORMAZIONI");
		btnInformazioni_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		btnInformazioni_1_1.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnInformazioni_1_1.setBackground(Color.WHITE);

		JButton btnNewButton = new JButton("AUTO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				System.out.println(combo_entrata.getModel().getSize());
				combo_entrata.addItem("ciao");
				combo_entrata.removeItem("ciao");
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnNewButton.setBackground(Color.WHITE);

		JButton btnFurgone_1 = new JButton("FURGONE");
		btnFurgone_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnFurgone_1.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnFurgone_1.setBackground(Color.WHITE);

		JButton btnMoto = new JButton("MOTO");
		btnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_3.setVisible(true);
			}
		});
		btnMoto.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnMoto.setBackground(Color.WHITE);

		JLabel lblNewLabel = new JLabel("THE GARAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Playbill", Font.PLAIN, 55));
		
		JButton btnPosti = new JButton("POSTI DISPONIBILI");
		btnPosti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println(posti);
				JOptionPane.showMessageDialog(null,"rimangono " + posti + " posti" );
			}
		});
		btnPosti.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnPosti.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(335, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(335))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(130)
					.addComponent(btnNewButton)
					.addGap(132)
					.addComponent(btnFurgone_1)
					.addGap(124)
					.addComponent(btnMoto)
					.addContainerGap(121, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(177)
					.addComponent(btnInformazioni_1_1)
					.addGap(84)
					.addComponent(btnPosti)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnFurgone_1)
						.addComponent(btnMoto))
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInformazioni_1_1)
						.addComponent(btnPosti, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

		panel_1 = new Panel();

		frame.getContentPane().add(panel_1, "name_779424883668900");

		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
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

		JButton btnNewButton_1_1 = new JButton("SALVA");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = targa_auto.getText();
				String b = modello_auto.getText();
				String c = cognome_auto.getText();
				String d = nome_auto.getText();
				String ore = JOptionPane.showInputDialog("Inserisci le ore");
				Veicolo temporanei = new Veicolo(a, b, c, d, ore);
				if(posti<=25) {
					listModel.addElement(temporanei);
					posti=posti-1;
					}else {JOptionPane.showMessageDialog(null,"POSTI ESAURITI" );}
			}
		});
		
		combo_entrata = new JComboBox();
		combo_entrata.setModel(new DefaultComboBoxModel(new String[] {"ORARIO ENTRATA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		
		combo_uscita = new JComboBox();
		combo_uscita.setModel(new DefaultComboBoxModel(new String[] {"ORARIO USCITA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(244)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_5)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_6))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(cognome_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(targa_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
										.addComponent(modello_auto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
									.addGap(52)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(combo_uscita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(combo_entrata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(360)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(289)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(159, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(targa_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(combo_entrata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(combo_uscita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_auto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);

		panel_2 = new Panel();
		frame.getContentPane().add(panel_2, "name_91278755178400");

		JButton btnNewButton_1_2 = new JButton("HOME");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(true);
			}
		});

		JButton btnNewButton_1_1_1 = new JButton("SALVA");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String e = targa_fur.getText();
				String f = modello_fur.getText();
				String g = cognome_fur.getText();
				String h = nome_fur.getText();
				String ore_2 = JOptionPane.showInputDialog("Inserisci le ore");
				Veicolo temporanei = new Veicolo(e, f, g, h, ore_2);
				if(posti<=25) {
					listModel.addElement(temporanei);
					posti=posti-1;
					}else {JOptionPane.showMessageDialog(null,"POSTI ESAURITI" );}
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
		
		JComboBox combo_entrata_fur = new JComboBox();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(244)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_5_1)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4_1)
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_6_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(cognome_fur, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(modello_fur, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome_fur, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(targa_fur, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
									.addGap(65)
									.addComponent(combo_entrata_fur, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(289)
							.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(360)
							.addComponent(lblNewLabel_3_1)))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(targa_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(combo_entrata_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_fur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);

		panel_3 = new Panel();
		frame.getContentPane().add(panel_3, "name_91363835423600");

		JButton btnNewButton_1_3 = new JButton("HOME");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel.setVisible(true);
			}
		});
		
		JButton btnNewButton_1_1_2 = new JButton("SALVA");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String m = targa_moto.getText();
				String j = modello_moto.getText();
				String k = cognome_moto.getText();
				String l = nome_moto.getText();
				String ore_3 = JOptionPane.showInputDialog("Inserisci le ore");
				Veicolo temporanei = new Veicolo(m, j, k, l, ore_3);
				if(posti<=25) {
				listModel.addElement(temporanei);
				posti=posti-1;
				}else {JOptionPane.showMessageDialog(null,"POSTI ESAURITI" );}
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
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(244)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel_5_2)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4_2)
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_6_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(cognome_moto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(modello_moto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome_moto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(302, Short.MAX_VALUE))
						.addComponent(targa_moto, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(289)
							.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(360)
							.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(389, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(targa_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(modello_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_2))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(cognome_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_2))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(nome_moto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_2))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);

		panel_4 = new Panel();
		frame.getContentPane().add(panel_4, "name_93696244716700");

		JLabel lblNewLabel_3_2_1 = new JLabel("INFORMAZIONI");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		list = new JList();

		JLabel lblNewLabel_7 = new JLabel("0,50\u20AC all'ora");

		JButton btnNewButton_1_3_1 = new JButton("HOME");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(false);
				panel.setVisible(true);
			}
		});

		JButton btnNewButton_2 = new JButton("CANCELLA MEZZO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.removeElementAt(list.getSelectedIndex());
				posti=posti+1;
			}
		});

		btnModificaMezzo = new JButton("MODIFICA MEZZO");
		btnModificaMezzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veicolo d = listModel.getElementAt(list.getSelectedIndex());
				d.setTarga(targa.getText());
				d.setModello(modello.getText());
				d.setCognome(cognome.getText());
				d.setNome(nome.getText());
				listModel.setElementAt(d, list.getSelectedIndex());
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
		
		JButton btnPosti_1 = new JButton("POSTI DISPONIBILI");
		btnPosti_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"rimangono " + posti + " posti" );
			}
		});
		btnPosti_1.setFont(new Font("Poor Richard", Font.PLAIN, 25));
		btnPosti_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton btnNewButton_3 = new JButton("calcola costo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//int ora = ;
			//JOptionPane.showInputDialog(String ore * 0.5);
			 
				
			}
		});
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(362)
							.addComponent(lblNewLabel_3_2_1))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(targa, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(modello, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(cognome, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_3_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(43)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addGap(30)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_2)
										.addGroup(gl_panel_4.createSequentialGroup()
											.addComponent(lblNewLabel_7)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnNewButton_3))
										.addComponent(btnModificaMezzo, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(12)
									.addComponent(btnPosti_1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(109, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2_1)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7)
								.addComponent(btnNewButton_3))
							.addGap(12)
							.addComponent(btnNewButton_2)
							.addGap(13)
							.addComponent(btnModificaMezzo))
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(targa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(modello, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(cognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(40)
							.addComponent(btnNewButton_1_3_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(18)
							.addComponent(btnPosti_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
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

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	public void registraController(Controller controller) {
		// TODO Auto-generated method stub
		btnModificaMezzo.addActionListener(controller);
	}
}
