package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

import controladores.InsertarDatos;
import modelos.Usuario;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.ComponentOrientation;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;

@SuppressWarnings({ "serial", "unused" })
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JPasswordField passwordField1;
	private JLabel lblNewLabel_2;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_5_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5_1;
	private JLabel lblNewLabel_4;
	private JPanel panel;
	private JPanel panel_1;
	private int xx, yy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/img/cliente (5).png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 541);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				yy = e.getY();
			}
		});

		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/img/customer.png")));
				lblNewLabel_2.setForeground(Color.black);
				separator.setBorder(new LineBorder(Color.BLACK, 1, true));
				separator_1.setBorder(new LineBorder(Color.BLACK, 1, true));
				lblNewLabel_1_1.setIcon(new ImageIcon(login.class.getResource("/img/password.png")));
				lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/img/login (2).png")));
				lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/img/escala-de-peso.png")));
				lblNewLabel_5.setForeground(Color.BLACK);
				lblNewLabel_5_1.setForeground(Color.BLACK);
				lblNewLabel_5_2.setForeground(Color.BLACK);
				lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
				textField1.setForeground(Color.BLACK);
				textField1.setCaretColor(Color.BLACK);
				passwordField1.setCaretColor(Color.BLACK);
				passwordField1.setForeground(Color.BLACK);

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();

				setLocation(x - xx, y - yy);
			}
		});
		contentPane.setBackground(Color.BLACK);
		contentPane.setFocusCycleRoot(true);
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setRequestFocusEnabled(false);
		contentPane.setOpaque(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/img/escala-de-peso.png")));
		lblNewLabel.setBounds(147, 77, 128, 140);
		contentPane.add(lblNewLabel);

		textField1 = new JTextField();
		textField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				Character c = e.getKeyChar();

				if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {

					e.consume();

				} else {

				}

			}
		});

		textField1.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textField1.setBorder(null);
		textField1.setOpaque(false);
		textField1.setBounds(122, 227, 197, 25);
		contentPane.add(textField1);
		textField1.setColumns(10);

		separator = new JSeparator();
		separator.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		separator.setBackground(Color.BLACK);

		separator.setForeground(Color.BLACK);
		separator.setBounds(122, 250, 206, 3);
		contentPane.add(separator);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/img/login (2).png")));
		lblNewLabel_1.setBounds(85, 226, 42, 32);
		contentPane.add(lblNewLabel_1);

		passwordField1 = new JPasswordField();
		passwordField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Character c = e.getKeyChar();

				if (c == KeyEvent.VK_ENTER) {

					login login = new login();
					InsertarDatos in = new InsertarDatos();
					Usuario usr = new Usuario();

					if (!textField1.equals("") && !passwordField1.equals("")) {

						usr.setNombre(textField1.getText());
						usr.setContraseña(passwordField1.getText());

						if (in.usuariologim(usr)) {

							Pantalla_principal pt = new Pantalla_principal();
							pt.setLocationRelativeTo(null);
							pt.USUARIO.setText("Usuario en Producción: "+usr.getNombre());
							pt.USUARIO_1.setText("Usuario en Producción: "+usr.getNombre());
							pt.USUARIO_2.setText("Usuario en Producción: "+usr.getNombre());
							pt.USUARIO_3.setText("Usuario en Producción: "+usr.getNombre());
							pt.USUARIO_4.setText("Usuario en Producción: "+usr.getNombre());
							pt.USUARIO_5.setText("Usuario en Producción: "+usr.getNombre());
							pt.setVisible(true);
							textField1.setText("");
							passwordField1.setText("");

							dispose();

						} else {
							JOptionPane.showMessageDialog(null, "Datos in corretos o Llene los campos");
						}

					}

				}

			}
		});
		passwordField1.setCaretColor(Color.BLACK);
		passwordField1.setForeground(Color.BLACK);
		passwordField1.setFont(new Font("Tahoma", Font.BOLD, 12));

		passwordField1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		passwordField1.setBorder(null);
		passwordField1.setOpaque(false);
		passwordField1.setBounds(127, 320, 197, 19);
		contentPane.add(passwordField1);

		lblNewLabel_2 = new JLabel("Ingresar");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				login login = new login();
				InsertarDatos in = new InsertarDatos();
				Usuario usr = new Usuario();

				if (!textField1.equals("") && !passwordField1.equals("")) {

					usr.setNombre(textField1.getText());
					usr.setContraseña(passwordField1.getText());

					if (in.usuariologim(usr)) {

						Pantalla_principal pt = new Pantalla_principal();
						pt.setLocationRelativeTo(null);
					
						pt.setVisible(true);
						pt.USUARIO.setText(usr.getNombre());
						pt.USUARIO_1.setText("Usuario en Producción: "+usr.getNombre());
						pt.USUARIO_2.setText("Usuario en Producción: "+usr.getNombre());
						pt.USUARIO_3.setText("Usuario en Producción: "+usr.getNombre());
						pt.USUARIO_4.setText("Usuario en Producción: "+usr.getNombre());
						pt.USUARIO_5.setText("Usuario en Producción: "+usr.getNombre());
						textField1.setText("");
						passwordField1.setText("");

						dispose();

					} else {
						JOptionPane.showMessageDialog(null, "Datos in corretos o Llene los campos");
					}

				}

			}
		});

		lblNewLabel_2.setRequestFocusEnabled(false);

		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_2.setBorder(new LineBorder(Color.MAGENTA, 2, true));
				lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblNewLabel_2.setBackground(Color.GRAY);
				lblNewLabel_2.setForeground(Color.CYAN);
				separator_1.setBorder(new LineBorder(Color.MAGENTA, 2, true));

				lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/img/customer2.png")));
				separator.setBorder(new LineBorder(Color.MAGENTA, 1, true));
				lblNewLabel_1_1.setIcon(new ImageIcon(login.class.getResource("/img/password1.png")));
				lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/img/login3.png")));
				lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/img/s.png")));
				lblNewLabel_5.setForeground(Color.MAGENTA);

				lblNewLabel_5_2.setForeground(new Color(0, 255, 255));
				lblNewLabel_5_1.setForeground(new Color(173, 255, 47));
				lblNewLabel_3.setBorder(new LineBorder(Color.MAGENTA, 2, true));
				lblNewLabel_4.setBorder(new LineBorder(Color.CYAN, 3, true));
				textField1.setForeground(Color.CYAN);
				textField1.setCaretColor(Color.CYAN);
				passwordField1.setForeground(Color.CYAN);
				passwordField1.setCaretColor(Color.CYAN);

				contentPane.setBorder(new LineBorder(SystemColor.activeCaptionBorder, 10, true));

			}
		});
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/img/customer.png")));

		lblNewLabel_2.setBounds(127, 389, 148, 40);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(login.class.getResource("/img/password.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(85, 306, 42, 32);
		contentPane.add(lblNewLabel_1_1);

		lblNewLabel_5 = new JLabel("LOGIN");

		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setBorder(null);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(137, 57, 68, 25);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_5_1 = new JLabel("TON");

		lblNewLabel_5_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBorder(null);
		lblNewLabel_5_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_5_1.setBounds(184, 57, 52, 25);
		contentPane.add(lblNewLabel_5_1);

		lblNewLabel_5_2 = new JLabel(" EXPRES");

		lblNewLabel_5_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_2.setBorder(null);
		lblNewLabel_5_2.setBackground(Color.GRAY);
		lblNewLabel_5_2.setBounds(214, 57, 68, 25);
		contentPane.add(lblNewLabel_5_2);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setBounds(49, 47, 346, 439);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");

		lblNewLabel_4.setBackground(Color.WHITE);

		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel_4.setBounds(27, 20, 392, 500);
		contentPane.add(lblNewLabel_4);

		separator_1 = new JSeparator();
		separator_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		separator_1.setBorder(new LineBorder(Color.BLACK, 2, true));

		separator_1.setBounds(122, 336, 211, 3);
		contentPane.add(separator_1);

		panel_1 = new JPanel();

		panel_1.setBackground(SystemColor.controlHighlight);

		panel_1.setBounds(59, 55, 325, 421);
		contentPane.add(panel_1);

		panel = new JPanel();

		panel.setBackground(SystemColor.activeCaptionBorder);

		panel.setBounds(10, 10, 430, 521);
		contentPane.add(panel);
	}
}
