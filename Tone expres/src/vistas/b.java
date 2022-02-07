package vistas;

import java.awt.EventQueue;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JInternalFrame;

import controladores.Conetar;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

@SuppressWarnings("serial")
public class b extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b frame = new b();
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
	public b() {

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void porfecha(JComboBox fecha1, JComboBox fecha2) {

		setBounds(100, 100, 450, 300);

		Conetar con = new Conetar();

		JasperReport rp;

		try {
			Map p = new HashMap();

			p.put("Parameter1", fecha1.getSelectedItem().toString());

			p.put("Parameter2", fecha2.getSelectedItem().toString());

			rp = JasperCompileManager.compileReport(
					"C:\\Users\\GOD AND JHON\\Documents\\projectos\\Tone expres\\Tone expres\\src\\reportes\\fechas.jrxml");
			JasperPrint jp = JasperFillManager.fillReport(rp, p, con.getconexion());

			JasperViewer.viewReport(jp, false);

		} catch (JRException e1) {

			e1.printStackTrace();
			System.out.println("aqui");
		}

	}

	public void todo() {

		setBounds(100, 100, 450, 300);

		Conetar con = new Conetar();

		JasperReport rp;
		@SuppressWarnings({ "rawtypes", "unused" })
		Map p = new HashMap();

		try {
			rp = JasperCompileManager.compileReport(
					"C:\\Users\\GOD AND JHON\\Documents\\projectos\\Tone expres\\Tone expres\\src\\reportes\\REPORTE.jrxml");
			JasperPrint jp = JasperFillManager.fillReport(rp, null, con.getconexion());

			JasperViewer.viewReport(jp, false);

		} catch (JRException e1) {

			e1.printStackTrace();
			System.out.println("aqui");
		}

	}

}
