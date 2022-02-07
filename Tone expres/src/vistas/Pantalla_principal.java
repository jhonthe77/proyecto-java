package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;

import org.apache.batik.w3c.dom.events.KeyboardEvent;
import org.bouncycastle.util.Pack;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import java.util.prefs.Preferences;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import controladores.*;
import modelos.Producion;
import modelos.Usuario;

import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings({ "unused", "serial" })
public class Pantalla_principal extends JFrame {

	private JPanel contentPane;
	private int xx, yy;
	private JPanel panel_biembenida;
	private JPanel panel_producion;
	private JPanel panel_Rmaquina;
	private JPanel panel_barrademenu;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_11;
	private JTextField txtcodigo;
	private JTextField txtdescriccion;
	private JTextField txtCDmq;
	private JTextField txtcliente;
	private JTextField txtCD;
	private JTable table;
	private JTextField txt_peso;
	private JTextField txtnom;
	private JTextField txtDPT;
	private JTextField txtCM;
	private JLayeredPane layeredPane;
	private JPanel panel_1;
	private JLabel lblNewLabel_10;
	private JTextField textField_9;
	private JLabel lblNewLabel_10_1_9;
	private JLabel lblNewLabel_10_1_10;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_10_1_11;
	private JLabel lblNewLabel_11_3;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_11_4;
	private JLabel lblNewLabel_11_5;
	private JTable table_1;
	private JPanel panel_Rcoodigo;
	private JPanel panel_3;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_11_6;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_11_7;
	private JLabel lblNewLabel_11_8;
	private JTextField textField_12;
	private JLabel lblNewLabel_10_2;
	private JLabel lblNewLabel_10_1_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblNewLabel_10_1_13;
	private JPanel panel_Reportes;
	private JPanel panel_4;
	private JLabel lblNewLabel_13;
	private JScrollPane scrollPane_3;
	private JLabel lblNewLabel_11_11;
	private JLabel lblNewLabel_10_3;
	private JTextField txtcmqpreporte;
	private JLabel lblNewLabel_10_1_14;
	private JLabel lblNewLabel_11_10;
	private JLabel lblNewLabel_10_4;
	private JLabel lblNewLabel_10_5;
	private JTable table_codigo;
	private JTable table_3;
	private JPanel panel_5;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_11_1;
	private JLabel lblNewLabel_11_2;
	private JLabel lblNewLabel_11_1_1;
	private JTextField txtcdpreporte;
	private JLabel lblNewLabel_10_1_14_3;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_11_9;
	private JPanel panel_R_usuario;
	private JTextField txtNM;
	private JTextField txtCRRP;
	private JTextField txtCG;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_11_9_1;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_7_1;
	private JLabel lblNewLabel_18;
	private JLabel validacion1;
	private JLabel validacion1_1;
	private JLabel validacion1_2;
	private JLabel validacion1_3;
	private JLabel validacion1_4;
	private JLabel validacion1_5;
	private JLabel lblNewLabel_11_4_1;
	private JLabel lblNewLabel_11_7_1;
	private JLabel lblNewLabel_6;
	private JLabel lbltototal;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	JLabel USUARIO;
	private JLabel lblNewLabel_11_9_1_1;
	private JLabel lblNewLabel_11_9_1_2;
	JLabel USUARIO_1;
	JLabel USUARIO_2;
	JLabel USUARIO_3;
	JLabel USUARIO_4;
	JLabel USUARIO_5;
	private JLabel lblNewLabel_11_9_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_principal frame = new Pantalla_principal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public boolean validacion(String d) {

		return d.matches("[0-9]{1,5}");

	}

	public boolean validacion2(String d) {

		return d.matches("[0-9]*");

	}

	public void cambiopanel(JPanel panel) {

		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Pantalla_principal() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Pantalla_principal.class.getResource("/img/escala-de-peso (3).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1024, 720);

		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();

		layeredPane.setBounds(88, 0, 940, 720);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
//----------------------inicio del panel bienbenida--------------------------------------------------------------	

		panel_biembenida = new JPanel();
		panel_biembenida.setBorder(null);

		panel_biembenida.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_1.setOpaque(true);
				lblNewLabel_1.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion.png")));
				lblNewLabel.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso.png")));
				lblNewLabel_1.setBorder(null);
				lblNewLabel_3.setBorder(null);
				lblNewLabel_3.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario.png")));
				lblNewLabel_3.setBackground(SystemColor.activeCaptionBorder);

				lblNewLabel_2
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica.png")));
				lblNewLabel_2.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_2.setForeground(Color.BLACK);
				lblNewLabel_2.setBorder(null);

				lblNewLabel_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor.png")));
				lblNewLabel_7.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_7.setForeground(Color.BLACK);
				lblNewLabel_7.setBorder(null);

				separator.setBackground(new Color(180, 221, 86));
				separator_1.setBackground(new Color(120, 193, 171));
				separator_2.setBackground(new Color(65, 168, 247));

				lblNewLabel_7_1.setOpaque(false);
				lblNewLabel_7_1.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_7_1.setBorder(null);
				lblNewLabel_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (1).png")));
				lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/customer.png")));
				panel_barrademenu.setBackground(new Color(240, 240, 240));

				lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (2).png")));

				lblNewLabel_5.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
				lblNewLabel_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));

				lblNewLabel_14
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso (3).png")));
				lblNewLabel.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/s.png")));

				lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));

			}
		});

		panel_biembenida.setBackground(SystemColor.activeCaptionBorder);
		layeredPane.add(panel_biembenida, "name_151746442212000");
		panel_biembenida.setLayout(null);

		lblNewLabel = new JLabel("BIENVENIDO A TON EXPRESS    ");
		lblNewLabel.setBounds(285, 33, 362, 128);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_biembenida.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("REGISTRAR  PRODUCCI\u00D3N ");
		lblNewLabel_1.setBounds(101, 237, 198, 149);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_producion);
			}
		});

		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (3).png")));
				lblNewLabel_1.setOpaque(true);
				lblNewLabel_1.setBackground(new Color(255, 250, 205));
				lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (4).png")));
				panel_barrademenu.setBackground(new Color(255, 250, 205));
			}
		});

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion.png")));
		panel_biembenida.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("REGISTRAR MAQUINA ");
		lblNewLabel_2.setBounds(107, 478, 165, 149);
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Rmaquina);
			}
		});

		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_2.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (1).png")));
				lblNewLabel_2.setBackground(Color.DARK_GRAY);
				lblNewLabel_2.setOpaque(true);
				lblNewLabel_2.setForeground(Color.WHITE);
				lblNewLabel_2.setBorder(new LineBorder(Color.WHITE, 2, true));

				lblNewLabel_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabri.png")));
				panel_barrademenu.setBackground(Color.DARK_GRAY);
			}
		});

		lblNewLabel_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica.png")));
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_biembenida.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("REGISTRAR C\u00D3DIGO ");
		lblNewLabel_3.setBounds(694, 220, 154, 149);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Rcoodigo);
			}
		});
		lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_3
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (2).png")));
				lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_3.setBackground(new Color(128, 128, 128));
				lblNewLabel_3.setOpaque(true);

				lblNewLabel_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1)64.png")));
				panel_barrademenu.setBackground(new Color(128, 128, 128));
			}
		});
		
				lblNewLabel_7_1 = new JLabel("REGISTRAR USUARIO ");
				lblNewLabel_7_1.setBounds(394, 356, 161, 149);
				lblNewLabel_7_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						cambiopanel(panel_R_usuario);
					}
				});
				
						lblNewLabel_7_1.addMouseMotionListener(new MouseMotionAdapter() {
							@Override
							public void mouseMoved(MouseEvent e) {
								lblNewLabel_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
								lblNewLabel_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (4).png")));
								lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (5).png")));
				
								panel_barrademenu.setBackground(Color.GRAY);
								lblNewLabel_7_1.setOpaque(true);
				
								lblNewLabel_7_1.setBackground(Color.GRAY);
				
							}
						});
						lblNewLabel_7_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						lblNewLabel_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (1).png")));
						lblNewLabel_7_1.setVerticalTextPosition(SwingConstants.BOTTOM);
						lblNewLabel_7_1.setHorizontalTextPosition(SwingConstants.CENTER);
						lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
						panel_biembenida.add(lblNewLabel_7_1);

		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario.png")));
		lblNewLabel_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_biembenida.add(lblNewLabel_3);

		lblNewLabel_7 = new JLabel("GENERAR PRODUCION");
		lblNewLabel_7.setBounds(620, 478, 198, 149);
		lblNewLabel_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (2).png")));
				lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				lblNewLabel_7.setBackground(new Color(173, 216, 230));
				lblNewLabel_7.setOpaque(true);
				panel_barrademenu.setBackground(new Color(173, 216, 230));
				lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor64.png")));

			}
		});
		lblNewLabel_7.setBorder(null);
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Reportes);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor.png")));
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_biembenida.add(lblNewLabel_7);

		separator = new JSeparator();
		separator.setBounds(447, 731, 0, 2);
		separator.setBackground(new Color(0, 0, 0));
		panel_biembenida.add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(547, 731, 0, 2);
		separator_1.setBackground(new Color(0, 0, 0));
		panel_biembenida.add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBounds(647, 731, 0, 2);
		separator_2.setBackground(new Color(0, 0, 0));
		panel_biembenida.add(separator_2);

		USUARIO_1 = new JLabel("");
		USUARIO_1.setBounds(747, 732, 0, 0);
		USUARIO_1.setHorizontalAlignment(SwingConstants.CENTER);
		USUARIO_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_biembenida.add(USUARIO_1);

//-----------------fin del panel biembenida------------------------------

//----------------------inicio del panel producion--------------------------------------------------------------			

		panel_producion = new JPanel();
		panel_producion.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				panel_5.setBackground(new Color(255, 250, 205));
				lblNewLabel_9.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (4).png")));

				lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (4).png")));
				panel_barrademenu.setBackground(new Color(255, 250, 205));
				lblNewLabel_11_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_11_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_19.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (6).png")));

			}
		});
		panel_producion.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(panel_producion, "name_151769868554800");
		panel_producion.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(349, 333, 164, 2);
		panel_producion.add(separator_3);

		lblNewLabel_11 = new JLabel("REGISTRAR  C\u00D3DIGO ");
		lblNewLabel_11.setBorder(null);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(335, 310, 190, 25);
		panel_producion.add(lblNewLabel_11);

		txtcodigo = new JTextField();
		txtcodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (txtcodigo.getText().length() == 5) {

					e.consume();
				}

				if (c < '0' || c > '9') {

					e.consume();
					validacion1_3.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1_3.setText("Solo numeros");

				} else {
					validacion1_3.setIcon(new ImageIcon());

					validacion1_3.setText("");
				}

			}
		});
		txtcodigo.setBounds(25, 394, 96, 25);
		panel_producion.add(txtcodigo);
		txtcodigo.setColumns(10);

		txtdescriccion = new JTextField();
		txtdescriccion.setColumns(10);
		txtdescriccion.setBounds(335, 394, 259, 25);
		panel_producion.add(txtdescriccion);

		txtCDmq = new JTextField();
		txtCDmq.setColumns(10);
		txtCDmq.setBounds(226, 524, 113, 25);
		panel_producion.add(txtCDmq);

		txtcliente = new JTextField();
		txtcliente.setColumns(10);
		txtcliente.setBounds(171, 394, 129, 25);
		panel_producion.add(txtcliente);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_5.setBackground(SystemColor.controlHighlight);
		panel_5.setBounds(0, 0, 937, 74);
		panel_producion.add(panel_5);
		panel_5.setLayout(null);

		lblNewLabel_9 = new JLabel("BIENVENIDO A LA PANTALLA REGISTRAR  PRODUCCI\u00D3N ");
		lblNewLabel_9.setBounds(224, 5, 480, 64);
		panel_5.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (1).png")));
		lblNewLabel_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "codigo", "Maquina" }));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(100, 98, 129, 21);
		panel_producion.add(comboBox);

		txtCD = new JTextField();
		txtCD.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char c = e.getKeyChar();

				if (txtCD.getText().length() == 5) {

					e.consume();
				}

				if (c < '0' || c > '9') {

					e.consume();
					validacion1_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1_2.setText("Solo numeros");

				} else {
					validacion1_2.setIcon(new ImageIcon());

					validacion1_2.setText("");
				}

			}
		});
		txtCD.setColumns(10);
		txtCD.setBounds(32, 166, 113, 25);
		panel_producion.add(txtCD);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(396, 87, 505, 175);
		panel_producion.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InsertarDatos codigo = new InsertarDatos();
				int cocion = comboBox.getSelectedIndex();
				if (cocion == 0) {
					codigo.colocardatosCodigo(table, txtcodigo, txtcliente, txtdescriccion);
				} else if (cocion != 0) {
					codigo.colocardatosCodigo(table, txtCDmq, txtnom, txtDPT);
				} else {
					JOptionPane.showMessageDialog(null, "");

				}

			}
		});

		scrollPane.setViewportView(table);

		txt_peso = new JTextField();
		txt_peso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (c < '0' || c > '9') {

					e.consume();
					validacion1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1.setText("Solo numeros");

				} else {
					validacion1.setIcon(new ImageIcon());

					validacion1.setText("");
				}

			}
		});
		txt_peso.setColumns(10);
		txt_peso.setBounds(621, 394, 113, 25);
		panel_producion.add(txt_peso);

		JSpinner spinner = new JSpinner();

		spinner.setBounds(777, 395, 73, 23);
		panel_producion.add(spinner);

		JLabel lblNewLabel_10_1 = new JLabel("C\u00F3digoDP");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1.setBounds(26, 359, 95, 25);
		panel_producion.add(lblNewLabel_10_1);

		JLabel lblNewLabel_10_1_1 = new JLabel("Cliente ");
		lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_1.setBounds(171, 359, 95, 25);
		panel_producion.add(lblNewLabel_10_1_1);

		JLabel lblNewLabel_10_1_2 = new JLabel("Descripci\u00F3n ");
		lblNewLabel_10_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_2.setBounds(335, 359, 95, 25);
		panel_producion.add(lblNewLabel_10_1_2);

		JLabel lblNewLabel_10_1_3 = new JLabel("Peso ");
		lblNewLabel_10_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_3.setBounds(621, 366, 95, 25);
		panel_producion.add(lblNewLabel_10_1_3);

		JLabel lblNewLabel_10_1_4 = new JLabel("Cantidad ");
		lblNewLabel_10_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_4.setBounds(772, 366, 95, 25);
		panel_producion.add(lblNewLabel_10_1_4);

		lblNewLabel_11_1 = new JLabel("REGISTRAR  MAQUINA ");
		lblNewLabel_11_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_11_1.setBorder(null);
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_1.setBounds(335, 449, 190, 25);
		panel_producion.add(lblNewLabel_11_1);

		txtnom = new JTextField();
		txtnom.setColumns(10);
		txtnom.setBounds(377, 524, 148, 25);
		panel_producion.add(txtnom);

		txtDPT = new JTextField();
		txtDPT.setColumns(10);
		txtDPT.setBounds(554, 527, 113, 25);
		panel_producion.add(txtDPT);

		JLabel lblNewLabel_10_1_5 = new JLabel("C\u00F3digoMQ");
		lblNewLabel_10_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_5.setBounds(227, 494, 95, 25);
		panel_producion.add(lblNewLabel_10_1_5);

		JLabel lblNewLabel_10_1_6 = new JLabel("Departamento ");
		lblNewLabel_10_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_6.setBounds(555, 495, 95, 25);
		panel_producion.add(lblNewLabel_10_1_6);

		JLabel lblNewLabel_10_1_7 = new JLabel("Nombre");
		lblNewLabel_10_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_7.setBounds(377, 492, 95, 25);
		panel_producion.add(lblNewLabel_10_1_7);

		lblNewLabel_11_1_1 = new JLabel("CREAR REGISTRO ");
		lblNewLabel_11_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String codigodp, clinete, descriccion, codigomq, nombre, departamento;
				int cantida;

				double peso;

				codigodp = txtcodigo.getText();
				clinete = txtcliente.getText();
				descriccion = txtdescriccion.getText();
				codigomq = txtCDmq.getText();
				nombre = txtnom.getText();
				departamento = txtDPT.getText();

				cantida = Integer.parseInt(spinner.getValue().toString());
				peso = Double.parseDouble(txt_peso.getText());

				String user = USUARIO.getText();

				InsertarDatos in = new InsertarDatos();

				if (!validacion2(spinner.getValue().toString()) && cantida == 0) {

					JOptionPane.showMessageDialog(null, "El campo Cantida solo permite numeros");
				} else {
					in.registroproduccion(codigodp, clinete, descriccion, codigomq, nombre, departamento, cantida, peso,
							user);

					txt_peso.setText("");
					txtcodigo.setText("");
					txtCDmq.setText("");
					txtdescriccion.setText("");
					txtDPT.setText("");
					txtnom.setText("");
					txtcliente.setText("");
					spinner.setValue(0);
				}
			}
		});
		lblNewLabel_11_1_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_1_1.setBorder(new LineBorder(new Color(0, 255, 0), 2, true));
			}
		});
		lblNewLabel_11_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_1_1.setBounds(335, 611, 190, 25);
		panel_producion.add(lblNewLabel_11_1_1);

		lblNewLabel_11_2 = new JLabel("REALIZAR B\u00DASQUEDA ");
		lblNewLabel_11_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos codigo = new InsertarDatos();
				int ocion = comboBox.getSelectedIndex();

				String valo = txtCD.getText();
				String valo2 = txtCM.getText();

				codigo.consulta(ocion, valo, valo2, table);

			}
		});
		lblNewLabel_11_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_2.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
			}
		});
		lblNewLabel_11_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_2.setBounds(66, 237, 190, 25);
		panel_producion.add(lblNewLabel_11_2);

		JLabel lblNewLabel_10_1_8 = new JLabel("C\u00F3digoDP");
		lblNewLabel_10_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_8.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_8.setBounds(32, 139, 95, 25);
		panel_producion.add(lblNewLabel_10_1_8);

		txtCM = new JTextField();
		txtCM.setColumns(10);
		txtCM.setBounds(171, 169, 113, 25);
		panel_producion.add(txtCM);

		JLabel lblNewLabel_10_1_5_1 = new JLabel("C\u00F3digoMQ");
		lblNewLabel_10_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_5_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_5_1.setBounds(172, 139, 95, 25);
		panel_producion.add(lblNewLabel_10_1_5_1);

		validacion1_2 = new JLabel("");
		validacion1_2.setForeground(Color.YELLOW);
		validacion1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1_2.setBounds(25, 201, 138, 26);
		panel_producion.add(validacion1_2);

		validacion1_3 = new JLabel("");
		validacion1_3.setForeground(Color.YELLOW);
		validacion1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1_3.setBounds(7, 430, 138, 26);
		panel_producion.add(validacion1_3);

		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
		lblNewLabel_19.setBounds(628, 636, 106, 74);
		panel_producion.add(lblNewLabel_19);

		USUARIO = new JLabel("");
		USUARIO.setHorizontalTextPosition(SwingConstants.RIGHT);
		USUARIO.setHorizontalAlignment(SwingConstants.CENTER);
		USUARIO.setBounds(226, 667, 373, 28);
		panel_producion.add(USUARIO);
		USUARIO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBackground(Color.BLACK);
		separator_3_1.setBounds(349, 472, 164, 2);
		panel_producion.add(separator_3_1);

		// -----------------fin del panel
		// producion----------------------------------------------------------------------------------------------

		// ----------------------inicio del panel
		// maquina--------------------------------------------------------------

		panel_Rmaquina = new JPanel();
		panel_Rmaquina.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				panel_barrademenu.setBackground(Color.DARK_GRAY);
				lblNewLabel_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabri.png")));
				lblNewLabel_10.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (1).png")));
				panel_1.setBackground(Color.DARK_GRAY);
				lblNewLabel_10.setForeground(Color.WHITE);

				lblNewLabel_11_3.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
				lblNewLabel_11_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_11_4.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
				lblNewLabel_11_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_11_5.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
				lblNewLabel_11_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_11_4_1.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
				lblNewLabel_11_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_20.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (6).png")));
				USUARIO_5.setForeground(Color.WHITE);
			}
		});
		panel_Rmaquina.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(panel_Rmaquina, "name_152882516392100");
		panel_Rmaquina.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(0, 0, 930, 173);
		panel_Rmaquina.add(panel_1);

		lblNewLabel_10 = new JLabel("BIENVENIDO A LA PANTALLA REGISTRAR  MAQUINA ");
		lblNewLabel_10.setForeground(Color.BLACK);

		lblNewLabel_10.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica.png")));
		lblNewLabel_10.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_10.setBounds(191, 10, 540, 153);
		panel_1.add(lblNewLabel_10);
		
				USUARIO_5 = new JLabel("");
				USUARIO_5.setForeground(Color.BLACK);
		
				USUARIO_5.setHorizontalAlignment(SwingConstants.CENTER);
				USUARIO_5.setBounds(397, 23, 381, 28);
				panel_1.add(USUARIO_5);
				USUARIO_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				
						lblNewLabel_20 = new JLabel("");
						lblNewLabel_20.setBounds(798, 50, 106, 74);
						panel_1.add(lblNewLabel_20);
						lblNewLabel_20.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
						lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(31, 265, 113, 25);
		panel_Rmaquina.add(textField_9);

		lblNewLabel_10_1_9 = new JLabel("C\u00F3digoMQ");
		lblNewLabel_10_1_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_9.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_9.setBounds(31, 232, 95, 25);
		panel_Rmaquina.add(lblNewLabel_10_1_9);

		lblNewLabel_10_1_10 = new JLabel("Nombre");
		lblNewLabel_10_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_10.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_10.setBounds(206, 232, 95, 25);
		panel_Rmaquina.add(lblNewLabel_10_1_10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(206, 265, 220, 25);
		panel_Rmaquina.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(479, 265, 128, 25);
		panel_Rmaquina.add(textField_11);

		lblNewLabel_10_1_11 = new JLabel("Departamento ");
		lblNewLabel_10_1_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_11.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_11.setBounds(480, 233, 95, 25);
		panel_Rmaquina.add(lblNewLabel_10_1_11);

		lblNewLabel_11_3 = new JLabel("REGISTRAR   ");
		lblNewLabel_11_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre, departamento, codigo_maquina;
				codigo_maquina = textField_9.getText();
				nombre = textField_10.getText();

				departamento = textField_11.getText();
				InsertarDatos maquina = new InsertarDatos();
				maquina.insertar_maquina(nombre, departamento, codigo_maquina);
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
			}
		});
		lblNewLabel_11_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_3.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (3).png")));
				lblNewLabel_11_3.setBorder(new LineBorder(new Color(0, 255, 0), 2, true));
			}
		});
		lblNewLabel_11_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_11_3
				.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
		lblNewLabel_11_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_3.setBounds(681, 625, 220, 47);
		panel_Rmaquina.add(lblNewLabel_11_3);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 337, 621, 351);
		panel_Rmaquina.add(scrollPane_1);

		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos codigo = new InsertarDatos();

				codigo.colocardatos(table_1, textField_9, textField_10, textField_11);

			}
		});
		scrollPane_1.setViewportView(table_1);

		lblNewLabel_11_4 = new JLabel("CONSULTAR");
		lblNewLabel_11_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos maquina = new InsertarDatos();

				maquina.mostrardatosMQ(table_1);
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");

			}
		});
		lblNewLabel_11_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_4.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (3).png")));
				lblNewLabel_11_4.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));
			}
		});
		lblNewLabel_11_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_4
				.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
		lblNewLabel_11_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_4.setBounds(681, 449, 220, 47);
		panel_Rmaquina.add(lblNewLabel_11_4);

		lblNewLabel_11_5 = new JLabel("ELIMINAR   ");
		lblNewLabel_11_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos in = new InsertarDatos();
				String codigo = textField_9.getText();
				in.borrarMaquina(codigo);

				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
			}
		});
		lblNewLabel_11_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_5.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (3).png")));
				lblNewLabel_11_5.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
			}
		});
		lblNewLabel_11_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_5
				.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
		lblNewLabel_11_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_5.setBounds(681, 537, 220, 47);
		panel_Rmaquina.add(lblNewLabel_11_5);

		lblNewLabel_11_4_1 = new JLabel("ATUALIZAR");
		lblNewLabel_11_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_4_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_11_4_1.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (3).png")));
				lblNewLabel_11_4_1.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));

			}
		});
		lblNewLabel_11_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nombre, departamento, codigo_maquina;
				codigo_maquina = textField_9.getText();
				departamento = textField_11.getText();
				nombre = textField_10.getText();

				InsertarDatos maquina = new InsertarDatos();

				maquina.atualizarmaquina(codigo_maquina, nombre, departamento);

				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
			}
		});
		lblNewLabel_11_4_1
				.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
		lblNewLabel_11_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_4_1.setBounds(681, 370, 220, 47);
		panel_Rmaquina.add(lblNewLabel_11_4_1);

		// -----------------fin del panel
		// maquina----------------------------------------------------------------------------------------------

		// ----------------------inicio del panel
		// codigo--------------------------------------------------------------
		panel_Rcoodigo = new JPanel();
		panel_Rcoodigo.setBackground(Color.LIGHT_GRAY);
		panel_Rcoodigo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1)64.png")));
				panel_3.setBackground(new Color(128, 128, 128));
				lblNewLabel_12
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (2).png")));
				panel_barrademenu.setBackground(new Color(128, 128, 128));

				lblNewLabel_11_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_11_6
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));

				lblNewLabel_11_7.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_11_7
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));

				lblNewLabel_11_8
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
				lblNewLabel_11_8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_11_7_1
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
				lblNewLabel_11_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_21.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (6).png")));
			}
		});
		panel_Rcoodigo.setLayout(null);
		layeredPane.add(panel_Rcoodigo, "name_167207226022900");

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(0, 0, 937, 173);
		panel_Rcoodigo.add(panel_3);

		lblNewLabel_12 = new JLabel("BIENVENIDO A LA PANTALLA REGISTRAR  C\u00D3DIGO  ");
		lblNewLabel_12.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario.png")));
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_12.setBounds(180, 10, 540, 153);
		panel_3.add(lblNewLabel_12);
		
				USUARIO_4 = new JLabel("");
				USUARIO_4.setHorizontalAlignment(SwingConstants.CENTER);
				USUARIO_4.setBounds(401, 24, 378, 28);
				panel_3.add(USUARIO_4);
				USUARIO_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				
						lblNewLabel_21 = new JLabel("");
						lblNewLabel_21.setBounds(790, 52, 106, 74);
						panel_3.add(lblNewLabel_21);
						lblNewLabel_21.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
						lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_11_6 = new JLabel("REGISTRAR   ");
		lblNewLabel_11_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cliente, descricion;
				String codigo1;
				codigo1 = textField_12.getText();
				cliente = textField_13.getText();
				descricion = textField_14.getText();
				InsertarDatos codigo = new InsertarDatos();

				codigo.insertar_codigo(codigo1, cliente, descricion);
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
			}
		});
		lblNewLabel_11_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_11_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_11_6.setBorder(new LineBorder(new Color(0, 255, 0), 2, true));
				lblNewLabel_11_6
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (3).png")));
			}
		});

		lblNewLabel_11_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
		lblNewLabel_11_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_11_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_6.setFont(new Font("Arial", Font.PLAIN, 14));

		lblNewLabel_11_6.setBounds(661, 605, 220, 47);
		panel_Rcoodigo.add(lblNewLabel_11_6);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 284, 594, 426);
		panel_Rcoodigo.add(scrollPane_2);

		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos codigo = new InsertarDatos();

				codigo.colocardatos(table_3, textField_12, textField_13, textField_14);
			}
		});
		scrollPane_2.setViewportView(table_3);

		lblNewLabel_11_7 = new JLabel("ACTUALIZAR   ");
		lblNewLabel_11_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String codigodp, cliente, descri;

				codigodp = textField_12.getText();

				cliente = textField_13.getText();

				descri = textField_14.getText();
				InsertarDatos codigo = new InsertarDatos();

				codigo.atualizarcodigo(codigodp, cliente, descri);
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");

			}
		});
		lblNewLabel_11_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_7.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));
				lblNewLabel_11_7
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (3).png")));
			}
		});
		lblNewLabel_11_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
		lblNewLabel_11_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_7.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_7.setBounds(661, 349, 220, 47);
		panel_Rcoodigo.add(lblNewLabel_11_7);

		lblNewLabel_11_8 = new JLabel("ELIMINAR   ");
		lblNewLabel_11_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cliente, descricion;
				String codigo1;
				codigo1 = textField_12.getText();
				cliente = textField_13.getText();
				descricion = textField_14.getText();
				InsertarDatos codigo = new InsertarDatos();
				codigo.borrarCodigo(codigo1);

				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");

			}
		});
		lblNewLabel_11_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_8.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
				lblNewLabel_11_8
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (3).png")));
			}
		});
		lblNewLabel_11_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
		lblNewLabel_11_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_8.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_8.setBounds(661, 522, 220, 47);
		panel_Rcoodigo.add(lblNewLabel_11_8);

		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (textField_12.getText().length() == 5) {

					e.consume();
				}

				if (c < '0' || c > '9') {

					e.consume();
					validacion1_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1_1.setText("Solo numeros");

				} else {
					validacion1_1.setIcon(new ImageIcon());

					validacion1_1.setText("");
				}

			}

		});
		textField_12.setColumns(10);
		textField_12.setBounds(10, 223, 96, 25);
		panel_Rcoodigo.add(textField_12);

		lblNewLabel_10_2 = new JLabel("C\u00F3digoDP");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_2.setBounds(11, 200, 95, 25);
		panel_Rcoodigo.add(lblNewLabel_10_2);

		lblNewLabel_10_1_12 = new JLabel("Cliente ");
		lblNewLabel_10_1_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_12.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_12.setBounds(156, 200, 95, 25);
		panel_Rcoodigo.add(lblNewLabel_10_1_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(156, 223, 238, 25);
		panel_Rcoodigo.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(474, 223, 259, 25);
		panel_Rcoodigo.add(textField_14);

		lblNewLabel_10_1_13 = new JLabel("Descripci\u00F3n ");
		lblNewLabel_10_1_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_13.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_13.setBounds(474, 200, 95, 25);
		panel_Rcoodigo.add(lblNewLabel_10_1_13);

		validacion1_1 = new JLabel("");
		validacion1_1.setForeground(Color.YELLOW);
		validacion1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1_1.setBounds(0, 258, 138, 26);
		panel_Rcoodigo.add(validacion1_1);

		lblNewLabel_11_7_1 = new JLabel("CONSULTAR");
		lblNewLabel_11_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos codigo = new InsertarDatos();
				codigo.mostrardatos(table_3);

				if (!validacion(textField_12.getText().trim())) {

					JOptionPane.showMessageDialog(null, "SOLO SE PERMITE 5 DIGITOS");
				} else {
					JOptionPane.showMessageDialog(null, "CORRETO");
				}

			}
		});
		lblNewLabel_11_7_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_7_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_7_1.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));
				lblNewLabel_11_7_1
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (3).png")));

			}
		});
		lblNewLabel_11_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
		lblNewLabel_11_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_7_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_7_1.setBounds(661, 440, 220, 47);
		panel_Rcoodigo.add(lblNewLabel_11_7_1);

		// -----------------fin del panel
		// codigo----------------------------------------------------------------------------------------------

		// -----------------inicio del panel
		// reportes----------------------------------------------------------------------------------------------
		panel_Reportes = new JPanel();
		panel_Reportes.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_10_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				lblNewLabel_10_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/pdf.png")));
				lblNewLabel_10_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

				panel_4.setBackground(new Color(173, 216, 230));
				panel_barrademenu.setBackground(new Color(173, 216, 230));
				lblNewLabel_13.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor64.png")));

				lblNewLabel_11_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_11_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor64.png")));

				lblNewLabel_11_10.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
				lblNewLabel_11_11.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
				lblNewLabel_10_4.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario.png")));

				lblNewLabel_11_9.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario.png")));
				lblNewLabel_11_9.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

				lblNewLabel_22.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (6).png")));
			}
		});
		panel_Reportes.setBackground(Color.LIGHT_GRAY);
		panel_Reportes.setLayout(null);
		layeredPane.add(panel_Reportes, "name_167648368563700");

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_4.setBackground(SystemColor.controlHighlight);
		panel_4.setBounds(0, 0, 937, 118);
		panel_Reportes.add(panel_4);

		lblNewLabel_13 = new JLabel("BIENVENIDO A LA PANTALLA  GENERAR  REPORTES  ");
		lblNewLabel_13.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1)64.png")));
		lblNewLabel_13.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_13.setBounds(198, 10, 540, 108);
		panel_4.add(lblNewLabel_13);

		USUARIO_3 = new JLabel("");
		USUARIO_3.setHorizontalAlignment(SwingConstants.CENTER);
		USUARIO_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		USUARIO_3.setBounds(371, 10, 433, 28);
		panel_4.add(USUARIO_3);
		
				lblNewLabel_22 = new JLabel("");
				lblNewLabel_22.setBounds(776, 23, 106, 74);
				panel_4.add(lblNewLabel_22);
				lblNewLabel_22.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
				lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);

		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(27, 393, 862, 317);
		panel_Reportes.add(scrollPane_3);

		table_codigo = new JTable();
		scrollPane_3.setViewportView(table_codigo);

		lblNewLabel_11_11 = new JLabel("ELIMINAR   ");
		lblNewLabel_11_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cd = txtcdpreporte.getText();
				String cdm = txtcmqpreporte.getText();
				InsertarDatos in = new InsertarDatos();
				in.eliminar_producion(cd, cdm);

				txtcdpreporte.setText("");
				txtcmqpreporte.setText("");
			}
		});
		lblNewLabel_11_11.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
		lblNewLabel_11_11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_11.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
				lblNewLabel_11_11.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (3).png")));
			}
		});
		lblNewLabel_11_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_11.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_11.setBounds(332, 270, 145, 41);
		panel_Reportes.add(lblNewLabel_11_11);

		txtcdpreporte = new JTextField();
		txtcdpreporte.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char c = e.getKeyChar();
				if (txtcdpreporte.getText().length() == 5) {

					e.consume();
				}

				if (c < '0' || c > '9') {

					validacion1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1.setText("Solo numeros");

					e.consume();
				} else {
					validacion1.setIcon(new ImageIcon());

					validacion1.setText("");
				}

			}
		});
		txtcdpreporte.setColumns(10);
		txtcdpreporte.setBounds(85, 187, 96, 25);
		panel_Reportes.add(txtcdpreporte);

		lblNewLabel_10_3 = new JLabel("C\u00F3digoDP");
		lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_3.setBounds(86, 152, 95, 25);
		panel_Reportes.add(lblNewLabel_10_3);

		txtcmqpreporte = new JTextField();
		txtcmqpreporte.setColumns(10);
		txtcmqpreporte.setBounds(241, 187, 129, 25);
		panel_Reportes.add(txtcmqpreporte);

		lblNewLabel_10_1_14 = new JLabel("C\u00F3digoMQ");
		lblNewLabel_10_1_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14.setBounds(248, 152, 95, 25);
		panel_Reportes.add(lblNewLabel_10_1_14);

		lblNewLabel_11_10 = new JLabel("CONSULTAR ");
		lblNewLabel_11_10.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
		lblNewLabel_11_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos in = new InsertarDatos();

				String valor, valor1;
				valor = txtcdpreporte.getText();
				valor1 = txtcmqpreporte.getText();

				in.consutareporte(valor, valor1, table_codigo, lbltototal, comboBox_1, comboBox_1_1);

				if (!validacion(txtcdpreporte.getText().trim())) {

					JOptionPane.showMessageDialog(null, "SOLO SE PERMITE 5 DIGITOS");
				} else {
					JOptionPane.showMessageDialog(null, "CORRETO");
				}

			}
		});
		lblNewLabel_11_10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_10.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));
				lblNewLabel_11_10.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (3).png")));

			}
		});
		lblNewLabel_11_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_10.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_10.setBounds(80, 270, 173, 42);
		panel_Reportes.add(lblNewLabel_11_10);

		lblNewLabel_10_4 = new JLabel("REPORTE POR FECHAS");
		lblNewLabel_10_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				b r = new b();
				r.porfecha(comboBox_1, comboBox_1_1);
			}
		});
		lblNewLabel_10_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_10_4.setBorder(new LineBorder(Color.BLACK, 1, true));

		lblNewLabel_10_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_10_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario (1).png")));
				lblNewLabel_10_4.setBorder(new LineBorder(Color.YELLOW, 1, true));
			}
		});
		lblNewLabel_10_4.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_10_4.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario.png")));
		lblNewLabel_10_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_4.setBounds(43, 333, 234, 42);
		panel_Reportes.add(lblNewLabel_10_4);

		lblNewLabel_10_5 = new JLabel("REPORTE GENERAL");
		lblNewLabel_10_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				b n = new b();
				n.todo();
			}
		});
		lblNewLabel_10_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_10_5.setBorder(new LineBorder(Color.RED, 1, true));
				lblNewLabel_10_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/pdf (1).png")));
			}
		});
		lblNewLabel_10_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		lblNewLabel_10_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_10_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/pdf.png")));
		lblNewLabel_10_5.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_10_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_5.setBounds(310, 333, 201, 42);
		panel_Reportes.add(lblNewLabel_10_5);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(566, 205, 157, 25);
		panel_Reportes.add(comboBox_1);

		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(750, 205, 157, 25);
		panel_Reportes.add(comboBox_1_1);

		JLabel lblNewLabel_10_1_14_1 = new JLabel("Fechas de producion");
		lblNewLabel_10_1_14_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_14_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_1.setBounds(651, 128, 145, 25);
		panel_Reportes.add(lblNewLabel_10_1_14_1);

		JLabel lblNewLabel_10_1_14_2 = new JLabel("De esta fecha");
		lblNewLabel_10_1_14_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_2.setBounds(593, 170, 95, 25);
		panel_Reportes.add(lblNewLabel_10_1_14_2);

		lblNewLabel_10_1_14_3 = new JLabel("A esta fecha");
		lblNewLabel_10_1_14_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_3.setBounds(775, 170, 95, 25);
		panel_Reportes.add(lblNewLabel_10_1_14_3);

		lblNewLabel_11_9 = new JLabel("CONSULTAR POR FECHA");
		lblNewLabel_11_9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_9
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario (1).png")));
				lblNewLabel_11_9.setBorder(new LineBorder(Color.YELLOW, 1, true));
			}
		});
		lblNewLabel_11_9.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/calendario.png")));
		lblNewLabel_11_9.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				InsertarDatos in = new InsertarDatos();

				in.consultar_por_fecha(table_codigo, lbltototal, comboBox_1, comboBox_1_1);

			}
		});
		lblNewLabel_11_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9.setFont(new Font("Arial", Font.PLAIN, 14));

		lblNewLabel_11_9.setBounds(631, 258, 229, 42);
		panel_Reportes.add(lblNewLabel_11_9);

		validacion1 = new JLabel("");

		validacion1.setForeground(Color.YELLOW);
		validacion1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1.setBounds(61, 222, 138, 26);
		panel_Reportes.add(validacion1);

		lbltototal = new JLabel("");
		lbltototal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltototal.setBounds(593, 340, 288, 35);
		panel_Reportes.add(lbltototal);

		// -----------------fin del panel
		// reportes----------------------------------------------------------------------------------------------

		// -----------------inicio del panel
		// usuario----------------------------------------------------------------------------------------------

		panel_R_usuario = new JPanel();
		panel_R_usuario.setBorder(null);
		panel_R_usuario.setBackground(SystemColor.controlHighlight);

		panel_R_usuario.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				lblNewLabel_11_9_1_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
				lblNewLabel_11_9_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
				lblNewLabel_11_9_1_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));

				lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (5).png")));
				lblNewLabel_16.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (4).png")));
				lblNewLabel_11_9_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
				
				
				
				lblNewLabel_16.setForeground(new Color(0, 0, 51));
				panel_R_usuario.setBorder(null);
				panel_R_usuario.setBackground(SystemColor.controlHighlight);
				panel_barrademenu.setBackground(new Color(211, 211, 211));
				lblNewLabel_23.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));

			}
		});
		layeredPane.add(panel_R_usuario, "name_1206816390490300");
		panel_R_usuario.setLayout(null);

		txtNM = new JTextField();
		txtNM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Character c = e.getKeyChar();

				if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {

					e.consume();
					validacion1_4.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1_4.setText("Solo letras");

				} else {
					validacion1_4.setIcon(new ImageIcon());

					validacion1_4.setText("");
				}

			}
		});
		txtNM.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtNM.setColumns(10);
		txtNM.setBounds(220, 283, 233, 25);
		panel_R_usuario.add(txtNM);

		JLabel lblNewLabel_10_1_14_4 = new JLabel("Nombre");
		lblNewLabel_10_1_14_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_4.setBounds(261, 248, 122, 25);
		panel_R_usuario.add(lblNewLabel_10_1_14_4);

		txtCRRP = new JTextField();
		txtCRRP.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCRRP.setColumns(10);
		txtCRRP.setBounds(535, 283, 233, 25);
		panel_R_usuario.add(txtCRRP);

		JLabel lblNewLabel_10_1_14_4_1 = new JLabel("Correo Corporativo");
		lblNewLabel_10_1_14_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_4_1.setBounds(565, 248, 176, 25);
		panel_R_usuario.add(lblNewLabel_10_1_14_4_1);

		txtCG = new JTextField();
		txtCG.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char c = e.getKeyChar();

				if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {

					e.consume();
					validacion1_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/forbidden.png")));
					validacion1_5.setText("Solo letras");

				} else {
					validacion1_5.setIcon(new ImageIcon());

					validacion1_5.setText("");
				}
			}
		});
		txtCG.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCG.setColumns(10);
		txtCG.setBounds(220, 416, 233, 25);
		panel_R_usuario.add(txtCG);

		JLabel lblNewLabel_10_1_14_4_2 = new JLabel("Cargo");
		lblNewLabel_10_1_14_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_4_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_4_2.setBounds(248, 381, 122, 25);
		panel_R_usuario.add(lblNewLabel_10_1_14_4_2);

		lblNewLabel_16 = new JLabel("BIENVENIDO A LA PANTALLA  REGISTRO USUARIO ");
		lblNewLabel_16.setForeground(new Color(0, 0, 51));

		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (1).png")));
		lblNewLabel_16.setBounds(161, 61, 633, 140);
		panel_R_usuario.add(lblNewLabel_16);

		lblNewLabel_11_9_1 = new JLabel("REGISTRAR");
		lblNewLabel_11_9_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_11_9_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_9_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (6).png")));
				panel_R_usuario.setBackground(SystemColor.activeCaptionBorder);

				lblNewLabel_16.setForeground(new Color(51, 204, 255));
				panel_R_usuario.setBorder(new LineBorder(new Color(255, 102, 255), 5, true));
			}
		});
		lblNewLabel_11_9_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
		lblNewLabel_11_9_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		lblNewLabel_11_9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre, cargo, correo, contraseña;

				nombre = txtNM.getText();
				cargo = txtCG.getText();
				correo = txtCRRP.getText();
				contraseña = passwordField.getText();
				InsertarDatos in = new InsertarDatos();
				in.insertarusuario(nombre, cargo, correo, contraseña);
				txtNM.setText("");
				txtCG.setText("");
				txtCRRP.setText("");
				passwordField.setText("");

			}
		});
		lblNewLabel_11_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_9_1.setBounds(425, 522, 161, 44);
		panel_R_usuario.add(lblNewLabel_11_9_1);

		JLabel lblNewLabel_10_1_14_4_2_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_10_1_14_4_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_10_1_14_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_14_4_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_10_1_14_4_2_1.setBounds(574, 381, 122, 25);
		panel_R_usuario.add(lblNewLabel_10_1_14_4_2_1);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordField.setBounds(535, 416, 233, 25);
		panel_R_usuario.add(passwordField);

		validacion1_4 = new JLabel("");
		validacion1_4.setForeground(Color.YELLOW);
		validacion1_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1_4.setBounds(230, 318, 161, 26);
		panel_R_usuario.add(validacion1_4);

		validacion1_5 = new JLabel("");
		validacion1_5.setForeground(Color.YELLOW);
		validacion1_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		validacion1_5.setBounds(230, 451, 161, 26);
		panel_R_usuario.add(validacion1_5);

		lblNewLabel_11_9_1_2 = new JLabel("ATUALIZAR");
		lblNewLabel_11_9_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre, cargo, correo, contraseña;
				InsertarDatos in = new InsertarDatos();
				nombre = txtNM.getText();
				cargo = txtCG.getText();
				correo = txtCRRP.getText();
				contraseña = passwordField.getText();

				in.atualizarUsuario(nombre, cargo, correo, contraseña);
				txtNM.setText("");
				txtCG.setText("");
				txtCRRP.setText("");
				passwordField.setText("");

			}
		});
		lblNewLabel_11_9_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_9_1_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_9_1_2
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (6).png")));
				panel_R_usuario.setBackground(SystemColor.activeCaptionBorder);

				lblNewLabel_16.setForeground(new Color(51, 204, 255));
				panel_R_usuario.setBorder(new LineBorder(new Color(255, 102, 255), 5, true));
			}
		});
		lblNewLabel_11_9_1_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
		lblNewLabel_11_9_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9_1_2.setForeground(Color.BLACK);
		lblNewLabel_11_9_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_9_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_9_1_2.setBounds(633, 601, 161, 44);
		panel_R_usuario.add(lblNewLabel_11_9_1_2);

		lblNewLabel_11_9_1_1 = new JLabel("ELIMINAR");
		lblNewLabel_11_9_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre;
				nombre = txtNM.getText();
				InsertarDatos in = new InsertarDatos();
				in.eliminarUsuario(nombre);
				txtNM.setText("");

			}
		});
		lblNewLabel_11_9_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_9_1_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_9_1_1
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (6).png")));
				panel_R_usuario.setBackground(SystemColor.activeCaptionBorder);

				lblNewLabel_16.setForeground(new Color(51, 204, 255));
				panel_R_usuario.setBorder(new LineBorder(new Color(255, 102, 255), 5, true));
			}
		});
		lblNewLabel_11_9_1_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
		lblNewLabel_11_9_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9_1_1.setForeground(Color.BLACK);
		lblNewLabel_11_9_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_9_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_9_1_1.setBounds(206, 601, 161, 44);
		panel_R_usuario.add(lblNewLabel_11_9_1_1);

		lblNewLabel_11_9_2 = new JLabel("CAMBIAR USUARIO");
		lblNewLabel_11_9_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_11_9_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (6).png")));
				panel_R_usuario.setBackground(SystemColor.activeCaptionBorder);

				lblNewLabel_16.setForeground(new Color(51, 204, 255));
				panel_R_usuario.setBorder(new LineBorder(new Color(255, 102, 255), 5, true));
			}
		});
		lblNewLabel_11_9_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login login = new login();

				login.setVisible(true);

				dispose();

			}
		});
		
				USUARIO_2 = new JLabel("");
				USUARIO_2.setHorizontalAlignment(SwingConstants.CENTER);
				USUARIO_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				USUARIO_2.setBounds(364, 67, 359, 28);
				panel_R_usuario.add(USUARIO_2);
		lblNewLabel_11_9_2.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (3).png")));
		lblNewLabel_11_9_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9_2.setForeground(Color.BLACK);
		lblNewLabel_11_9_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_11_9_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_11_9_2.setBounds(412, 601, 181, 44);
		panel_R_usuario.add(lblNewLabel_11_9_2);
		
				lblNewLabel_23 = new JLabel("");
				lblNewLabel_23.addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseMoved(MouseEvent e) {
						lblNewLabel_23.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (6).png")));
					}
				});
				lblNewLabel_23.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
				lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_23.setBounds(438, 320, 106, 74);
				panel_R_usuario.add(lblNewLabel_23);

		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBounds(64, 45, 793, 639);
		panel_R_usuario.add(lblNewLabel_18);

		// -----------------fin del panel
		// usuario----------------------------------------------------------------------------------------------

		panel_barrademenu = new JPanel();
		panel_barrademenu.setBackground(new Color(240, 240, 240));
		panel_barrademenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				yy = e.getY();

			}
		});

		panel_barrademenu.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_barrademenu.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (2).png")));
				lblNewLabel_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
				lblNewLabel_5.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));

				lblNewLabel_12.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario.png")));
				panel_3.setBackground(SystemColor.controlHighlight);

				lblNewLabel_9.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (1).png")));
				panel_5.setBackground(SystemColor.controlHighlight);
				panel_barrademenu.setBackground(new Color(240, 240, 240));
				lblNewLabel_10
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica.png")));
				panel_1.setBackground(SystemColor.controlHighlight);
				lblNewLabel_10.setForeground(Color.BLACK);
				panel_biembenida.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_1.setOpaque(true);
				lblNewLabel_1.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion.png")));
				lblNewLabel.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso.png")));
				lblNewLabel_1.setBorder(null);
				lblNewLabel_3.setBorder(null);
				lblNewLabel_3.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario.png")));
				lblNewLabel_3.setBackground(SystemColor.activeCaptionBorder);

				separator.setBackground(new Color(0, 0, 0));
				separator_1.setBackground(new Color(0, 0, 0));
				separator_2.setBackground(new Color(0, 0, 0));
				lblNewLabel_19.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
				lblNewLabel_20.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
				lblNewLabel_21.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));

				lblNewLabel_22.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/stopwatch (5).png")));
				lblNewLabel_2
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica.png")));
				lblNewLabel_2.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_2.setForeground(Color.BLACK);
				lblNewLabel_2.setBorder(null);

				panel_4.setBackground(SystemColor.controlHighlight);
				lblNewLabel_13.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1)64.png")));

				lblNewLabel_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor.png")));
				lblNewLabel_7.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_7.setForeground(Color.BLACK);
				lblNewLabel_7.setBorder(null);
				lblNewLabel_7_1.setOpaque(false);
				lblNewLabel_7_1.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_7_1.setBorder(null);
				lblNewLabel_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (1).png")));
				lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/customer.png")));
				lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
				lblNewLabel_14
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso (1).png")));
				USUARIO_5.setForeground(Color.BLACK);
				lblNewLabel_15.setBackground(SystemColor.activeCaptionBorder);
				lblNewLabel_15.setOpaque(false);

				lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/customer.png")));

				lblNewLabel_16.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (1).png")));
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xx, y - yy);
			}
		});

		panel_barrademenu.setBounds(0, 0, 90, 720);
		contentPane.add(panel_barrademenu);
		panel_barrademenu.setLayout(null);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Rcoodigo);
			}
		});
		lblNewLabel_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_4
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1)64.png")));
				panel_barrademenu.setBackground(new Color(128, 128, 128));
				lblNewLabel_3
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (2).png")));
				lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_3.setBackground(new Color(128, 128, 128));
				lblNewLabel_3.setOpaque(true);
			}
		});
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/codigo-binario (1).png")));
		lblNewLabel_4.setBounds(10, 280, 64, 64);
		panel_barrademenu.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Rmaquina);
			}
		});
		lblNewLabel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabri.png")));
				panel_barrademenu.setBackground(Color.DARK_GRAY);
				lblNewLabel_2.setIcon(
						new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (1).png")));
				lblNewLabel_2.setBackground(Color.DARK_GRAY);
				lblNewLabel_2.setOpaque(true);
				lblNewLabel_2.setForeground(Color.WHITE);
				lblNewLabel_2.setBorder(new LineBorder(Color.WHITE, 2, true));
			}
		});
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/maquina-de-fabrica (2).png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 388, 64, 64);
		panel_barrademenu.add(lblNewLabel_5);

		lblNewLabel_8 = new JLabel("");

		lblNewLabel_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (4).png")));
				panel_barrademenu.setBackground(new Color(255, 250, 205));
				lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (3).png")));
				lblNewLabel_1.setOpaque(true);
				lblNewLabel_1.setBackground(new Color(255, 250, 205));

			}

		});
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cambiopanel(panel_producion);
			}
		});
		lblNewLabel_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_8.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/produccion (2).png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 190, 64, 64);
		panel_barrademenu.add(lblNewLabel_8);

		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_biembenida);
			}
		});
		lblNewLabel_14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_14
						.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso (3).png")));
				lblNewLabel.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/s.png")));

				separator.setBackground(new Color(180, 221, 86));
				separator_1.setBackground(new Color(120, 193, 171));
				separator_2.setBackground(new Color(65, 168, 247));

			}
		});
		lblNewLabel_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_14.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/escala-de-peso (1).png")));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(10, 93, 64, 64);
		panel_barrademenu.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("x");
		lblNewLabel_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_15.setBackground(new Color(255, 0, 0));
				lblNewLabel_15.setOpaque(true);
			}
		});

		lblNewLabel_15.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(10, 10, 34, 37);
		panel_barrademenu.add(lblNewLabel_15);

		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (5).png")));

				panel_barrademenu.setBackground(Color.GRAY);
				lblNewLabel_7_1.setBackground(Color.GRAY);
				lblNewLabel_7_1.setOpaque(true);
				lblNewLabel_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				lblNewLabel_7_1.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/cliente (4).png")));

			}
		});
		lblNewLabel_17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cambiopanel(panel_R_usuario);
			}
		});
		lblNewLabel_17.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/customer.png")));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(10, 587, 64, 64);
		panel_barrademenu.add(lblNewLabel_17);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cambiopanel(panel_Reportes);
			}
		});
		lblNewLabel_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_7.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (2).png")));
				lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				lblNewLabel_7.setBackground(new Color(173, 216, 230));
				lblNewLabel_7.setOpaque(true);

				panel_barrademenu.setBackground(new Color(173, 216, 230));
				lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor64.png")));
			}
		});
		lblNewLabel_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.setIcon(new ImageIcon(Pantalla_principal.class.getResource("/img/monitor (1).png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 488, 64, 64);
		panel_barrademenu.add(lblNewLabel_6);
		
	}
}
