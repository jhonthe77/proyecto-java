package controladores;

import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelos.*;

public class InsertarDatos {
	private Codigo modelo_codigo;
	private Maquina modelo_maquina;
	@SuppressWarnings("unused")
	private Departamento modelo_departamento;
	private Conetar conetar;
	private ResultSet resul;
	private Statement mistate;
	private Producion modelo_producion;
	private Usuario modelousuario;

	public InsertarDatos() {
		modelo_codigo = new Codigo();
		modelo_departamento = new Departamento();
		modelo_maquina = new Maquina();
		conetar = new Conetar();
		modelo_producion = new Producion();
		modelousuario = new Usuario();

	}

	public void insertar_maquina(String nombre, String departamento, String codigo_maquina) {
		modelo_maquina.setNombre(nombre);
		modelo_maquina.setDepartamento(departamento);
		modelo_maquina.setCodigo_maquina(codigo_maquina);
		Connection con = conetar.getconexion();
		String sql = "insert into maquinas(nombre,departamento,codigo) value(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelo_maquina.getNombre());
			ps.setString(2, modelo_maquina.getDepartamento());
			ps.setString(3, modelo_maquina.getCodigo_maquina());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void mostrardatos(JTable table) {
		Connection con;
		con = conetar.getconexion();
		String sql = "SELECT * FROM codigos";
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("CodP");
		modelo.addColumn("Cliente");
		modelo.addColumn("Descripcion");

		table.setModel(modelo);
		String[] datos_usuario = new String[3];

		try {
			mistate = con.createStatement();
			resul = mistate.executeQuery(sql);

			while (resul.next()) {

				datos_usuario[0] = resul.getString(1);
				datos_usuario[1] = resul.getString(2);
				datos_usuario[2] = resul.getString(3);

				modelo.addRow(datos_usuario);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void mostrardatosMQ(JTable table) {

		Connection con;
		con = conetar.getconexion();
		String sql = "SELECT * FROM maquinas";
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("CodM");
		modelo.addColumn("Nombre");
		modelo.addColumn("Departamento");

		table.setModel(modelo);
		String[] datos_usuario = new String[3];

		try {
			mistate = con.createStatement();
			resul = mistate.executeQuery(sql);

			while (resul.next()) {

				datos_usuario[0] = resul.getString(1);
				datos_usuario[1] = resul.getString(2);
				datos_usuario[2] = resul.getString(3);

				modelo.addRow(datos_usuario);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void consulta(int ocion, String valor, String valor1, JTable table) {

		Connection con;
		con = conetar.getconexion();

		DefaultTableModel modelo = new DefaultTableModel();
		String sql = "";

		if (ocion == 0 && valor.length() == 0 && valor1.length() == 0) {

			sql = "SELECT * FROM codigos";
			modelo.addColumn("CodP");
			modelo.addColumn("Cliente");
			modelo.addColumn("Descripcion");
			table.setModel(modelo);

		} else if (ocion == 1 && valor.length() == 0 && valor1.length() == 0) {

			sql = "SELECT * FROM maquinas";
			modelo.addColumn("CodM");
			modelo.addColumn("Nombre");
			modelo.addColumn("Departamento");
			table.setModel(modelo);
		}

		else if (ocion == 0 && valor.length() != 0 && valor1.length() == 0) {

			sql = "SELECT * FROM codigos WHERE codigo = '" + valor + "'";
			modelo.addColumn("CodP");
			modelo.addColumn("Cliente");
			modelo.addColumn("Descripcion");
			table.setModel(modelo);
		} else if (ocion == 1 && valor.length() == 0 && valor1.length() != 0) {

			sql = "SELECT * FROM maquinas WHERE codigo = '" + valor1 + "'";
			modelo.addColumn("CodM");
			modelo.addColumn("Nombre");
			modelo.addColumn("Departamento");
			table.setModel(modelo);

		}

		else {

			JOptionPane.showMessageDialog(null, "Ingrese un valor real");
		}

		String[] datos_usuario = new String[3];

		try {
			mistate = con.createStatement();
			resul = mistate.executeQuery(sql);

			while (resul.next()) {

				datos_usuario[0] = resul.getString(1);
				datos_usuario[1] = resul.getString(2);
				datos_usuario[2] = resul.getString(3);

				modelo.addRow(datos_usuario);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void colocardatosCodigo(JTable table, JTextField codigo, JTextField cliente, JTextField Descriccion) {

		int fila = table.getSelectedRow();

		String codigo1 = table.getValueAt(fila, 0).toString();
		String cliente2 = table.getValueAt(fila, 1).toString();
		String Descriccion2 = table.getValueAt(fila, 2).toString();

		codigo.setText(codigo1);
		cliente.setText(cliente2);
		Descriccion.setText(Descriccion2);

	}

	public void registroproduccion(String codigodp, String clinete, String descriccion, String codigomq, String nombre,
			String departamento, int cantida, double peso, String usuario) {

		modelo_producion.setCodigodp(codigodp);
		modelo_producion.setClinete(clinete);
		modelo_producion.setDescriccion(descriccion);
		modelo_producion.setCodigomq(codigomq);
		modelo_producion.setNombre(nombre);
		modelo_producion.setDepartamento(departamento);
		modelo_producion.setCantida(cantida);
		modelo_producion.setPeso(peso);
		modelo_producion.setTotal(cantida * peso);
		modelo_producion.setUsuario(usuario);

		Connection con = conetar.getconexion();
		String sql = "insert into producion2(total,idCD,cliente,DSC,idMQ,nombre,dPT,cantida,Peso,usuario) value(?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2, modelo_producion.getCodigodp());
			ps.setString(3, modelo_producion.getClinete());
			ps.setString(4, modelo_producion.getDescriccion());
			ps.setString(5, modelo_producion.getCodigomq());
			ps.setString(6, modelo_producion.getNombre());
			ps.setString(7, modelo_producion.getDepartamento());
			ps.setInt(8, modelo_producion.getCantida());
			ps.setDouble(9, modelo_producion.getPeso());
			ps.setDouble(1, modelo_producion.getTotal());
			ps.setString(10, modelo_producion.getUsuario());

			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void consutareporte(String valor, String valor1, JTable table, JLabel total, JComboBox fecha1,
			JComboBox fecha2) {
		Connection con;
		con = conetar.getconexion();

		DefaultTableModel modelo = new DefaultTableModel();

		String sql = "";

		if (valor.length() == 0 && valor1.length() == 0) {

			sql = "SELECT * FROM producion2";
			modelo.addColumn("id");
			modelo.addColumn("Producion");
			modelo.addColumn("CodP");
			modelo.addColumn("Cliente");
			modelo.addColumn("Descripcion");

			modelo.addColumn("CodM");
			modelo.addColumn("Nombre");
			modelo.addColumn("Departamento");
			modelo.addColumn("cantida");
			modelo.addColumn("peso");

			table.setModel(modelo);
			String[] datos_usuario = new String[11];
			try {
				mistate = con.createStatement();
				resul = mistate.executeQuery(sql);

				while (resul.next()) {

					datos_usuario[0] = resul.getString(1);
					datos_usuario[1] = resul.getString(2);
					datos_usuario[2] = resul.getString(3);
					datos_usuario[3] = resul.getString(4);
					datos_usuario[4] = resul.getString(5);
					datos_usuario[5] = resul.getString(6);
					datos_usuario[6] = resul.getString(7);
					datos_usuario[7] = resul.getString(8);
					datos_usuario[8] = resul.getString(9);
					datos_usuario[9] = resul.getString(10);
					datos_usuario[10] = resul.getString(11);

					modelo.addRow(datos_usuario);

					fecha1.addItem(datos_usuario[10]);
					fecha2.addItem(datos_usuario[10]);
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

			sumar(table, total);

		} else if (valor.length() != 0 && valor1.length() == 0) {

			sql = "SELECT * FROM producion2 WHERE idCD ='" + valor + "'";
			modelo.addColumn("id");
			modelo.addColumn("Puduccion del codigo: " + valor);
			modelo.addColumn("CodP");
			modelo.addColumn("Cliente");
			modelo.addColumn("Descripcion");
			modelo.addColumn("CodM");
			modelo.addColumn("Nombre");
			modelo.addColumn("Departamento");
			modelo.addColumn("cantida");
			modelo.addColumn("peso");

			table.setModel(modelo);

			String[] datos_usuario = new String[11];

			try {
				mistate = con.createStatement();
				resul = mistate.executeQuery(sql);

				while (resul.next()) {

					datos_usuario[0] = resul.getString(1);
					datos_usuario[1] = resul.getString(2);
					datos_usuario[2] = resul.getString(3);
					datos_usuario[3] = resul.getString(4);
					datos_usuario[4] = resul.getString(5);
					datos_usuario[5] = resul.getString(6);
					datos_usuario[6] = resul.getString(7);
					datos_usuario[7] = resul.getString(8);
					datos_usuario[8] = resul.getString(9);
					datos_usuario[9] = resul.getString(10);
					datos_usuario[10] = resul.getString(11);
					modelo.addRow(datos_usuario);
					fecha1.addItem(datos_usuario[10]);
					fecha2.addItem(datos_usuario[10]);
				}

				sumar(table, total);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} else if (valor.length() == 0 && valor1.length() != 0) {

			sql = "SELECT * FROM producion2 WHERE idMQ = '" + valor1 + "'";
			modelo.addColumn("id");
			modelo.addColumn("Puduccion por Maquina: " + valor1);

			modelo.addColumn("CodP");
			modelo.addColumn("Cliente");
			modelo.addColumn("Descripcion");

			modelo.addColumn("CodM");
			modelo.addColumn("Nombre");
			modelo.addColumn("Departamento");
			modelo.addColumn("cantida");
			modelo.addColumn("peso");

			table.setModel(modelo);

			String[] datos_usuario = new String[11];

			try {

				mistate = con.createStatement();
				resul = mistate.executeQuery(sql);

				while (resul.next()) {

					datos_usuario[0] = resul.getString(1);
					datos_usuario[1] = resul.getString(2);
					datos_usuario[2] = resul.getString(3);
					datos_usuario[3] = resul.getString(4);
					datos_usuario[4] = resul.getString(5);
					datos_usuario[5] = resul.getString(6);
					datos_usuario[6] = resul.getString(7);
					datos_usuario[7] = resul.getString(8);
					datos_usuario[8] = resul.getString(9);
					datos_usuario[9] = resul.getString(10);
					datos_usuario[10] = resul.getString(11);
					modelo.addRow(datos_usuario);
					fecha1.addItem(datos_usuario[10]);
					fecha2.addItem(datos_usuario[10]);
				}

				sumar(table, total);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			JOptionPane.showMessageDialog(null, "Ingrese un valor real");
		}

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertarusuario(String usuario, String cargo, String correo, String contraseña) {

		modelousuario.setNombre(usuario);

		modelousuario.setCargo(cargo);

		modelousuario.setCorreo(correo);
		modelousuario.setContraseña(contraseña);

		Connection con = conetar.getconexion();
		String sql = "insert into usuarios(usuario,correo,cargo,contraseña) value(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelousuario.getNombre());

			ps.setString(2, modelousuario.getCargo());

			ps.setString(3, modelousuario.getCorreo());
			ps.setString(4, modelousuario.getContraseña());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void sumar(JTable codigo, JLabel total) {

		double suma = 0;

		double fila = 0;

		for (int i = 0; i < codigo.getRowCount(); i++) {
			fila = Double.parseDouble(codigo.getValueAt(i, 1).toString());
			suma += fila;
		}

		total.setText(String.valueOf("Peso total: " + suma + " kg "));
		JOptionPane.showMessageDialog(null, "Peso total: " + suma + " kg ");
	}

	@SuppressWarnings("rawtypes")
	public void consultar_por_fecha(JTable table, JLabel total, JComboBox feini, JComboBox fechafin) {

		String fecha, fechaf;

		fecha = feini.getSelectedItem().toString();

		fechaf = fechafin.getSelectedItem().toString();
		System.out.println(fecha);
		System.out.println(fechaf);
		Connection con;
		con = conetar.getconexion();

		DefaultTableModel modelo1 = new DefaultTableModel();
		String sql = "SELECT * FROM producion2 WHERE fecha BETWEEN '" + fecha + "' AND '" + fechaf + "'";
		System.out.println(fecha);
		System.out.println(fechaf);
		modelo1.addColumn("id");
		modelo1.addColumn("Producion");
		modelo1.addColumn("CodP");
		modelo1.addColumn("Cliente");
		modelo1.addColumn("Descripcion");

		modelo1.addColumn("CodM");
		modelo1.addColumn("Nombre");
		modelo1.addColumn("Departamento");
		modelo1.addColumn("cantida");
		modelo1.addColumn("peso");
		table.setModel(modelo1);
		String[] datos_usuario = new String[11];
		try {
			mistate = con.createStatement();
			resul = mistate.executeQuery(sql);

			while (resul.next()) {

				datos_usuario[0] = resul.getString(1);
				datos_usuario[1] = resul.getString(2);
				datos_usuario[2] = resul.getString(3);
				datos_usuario[3] = resul.getString(4);
				datos_usuario[4] = resul.getString(5);
				datos_usuario[5] = resul.getString(6);
				datos_usuario[6] = resul.getString(7);
				datos_usuario[7] = resul.getString(8);
				datos_usuario[8] = resul.getString(9);
				datos_usuario[9] = resul.getString(10);
				datos_usuario[10] = resul.getString(11);

				modelo1.addRow(datos_usuario);

			}

			sumar(table, total);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public boolean usuariologim(Usuario usr) {
		Connection con;
		con = conetar.getconexion();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT id, usuario, cargo , correo, contraseña  FROM usuarios WHERE usuario = ?";

		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, usr.getNombre());

			rs = ps.executeQuery();
			while (rs.next()) {

				if (usr.getContraseña().equals(rs.getString(5))) {
					usr.setCargo(rs.getString(3));
					usr.setCorreo(rs.getString(4));

					return true;
				} else {
					return false;
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public void borrarMaquina(String codigo_maquina) {

		modelo_maquina.setCodigo_maquina(codigo_maquina);
		String sql = " DELETE FROM maquinas WHERE codigo =?";

		Connection con = conetar.getconexion();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelo_maquina.getCodigo_maquina());
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("aqui");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void atualizarmaquina(String codigo_maquina, String nombre, String departamento) {

		modelo_maquina.setCodigo_maquina(codigo_maquina);
		modelo_maquina.setNombre(nombre);
		modelo_maquina.setDepartamento(departamento);

		String sql = "UPDATE maquinas SET nombre=?, departamento=? WHERE codigo=?";

		Connection con = conetar.getconexion();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelo_maquina.getNombre());
			ps.setString(2, modelo_maquina.getDepartamento());
			ps.setString(3, modelo_maquina.getCodigo_maquina());
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("aqui");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void atualizarcodigo(String codigodp, String cliente, String descricion) {

		modelo_codigo.setCodigo(codigodp);
		modelo_codigo.setCliente(cliente);
		modelo_codigo.setDescricion(descricion);

		String sql = "UPDATE codigos SET Cliente=?, Descripción=? WHERE codigo=?";

		Connection con = conetar.getconexion();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(3, modelo_codigo.getCodigo());
			ps.setString(1, modelo_codigo.getCliente());
			ps.setString(2, modelo_codigo.getDescricion());
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("aqui");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void borrarCodigo(String codigodp) {

		modelo_codigo.setCodigo(codigodp);
		String sql = " DELETE FROM codigos WHERE codigo =?";

		Connection con = conetar.getconexion();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelo_codigo.getCodigo());
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("aqui");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void insertar_codigo(String codigodp, String cliente, String descri) {
		modelo_codigo.setCodigo(codigodp);
		modelo_codigo.setCliente(cliente);
		modelo_codigo.setDescricion(descri);
		Connection con = conetar.getconexion();
		String sql = "insert into codigos(codigo,CLiente,Descripción) value(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelo_codigo.getCodigo());
			ps.setString(2, modelo_codigo.getCliente());
			ps.setString(3, modelo_codigo.getDescricion());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void eliminar_producion(String coddp, String codmq) {

		modelo_codigo.setCodigo(coddp);
		modelo_maquina.setCodigo_maquina(codmq);
		Connection con = conetar.getconexion();

		String sql;

		if (coddp.length() != 0 && codmq.length() == 0) {
			sql = " DELETE FROM producion2 WHERE idCD =?";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, modelo_codigo.getCodigo());

				ps.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (coddp.length() == 0 && codmq.length() != 0) {
			sql = " DELETE FROM producion2 WHERE idMQ =?";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, modelo_maquina.getCodigo_maquina());

				ps.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void colocardatos(JTable table, JTextField codigo, JTextField cliente, JTextField Descriccion) {

		int fila = table.getSelectedRow();

		String codigo1 = table.getValueAt(fila, 0).toString();
		String cliente2 = table.getValueAt(fila, 1).toString();
		String Descriccion2 = table.getValueAt(fila, 2).toString();

		codigo.setText(codigo1);
		cliente.setText(cliente2);
		Descriccion.setText(Descriccion2);

	}

	public void atualizarUsuario(String usuario, String cargo, String correo, String contraseña) {

		modelousuario.setNombre(usuario);

		modelousuario.setCargo(cargo);

		modelousuario.setCorreo(correo);
		modelousuario.setContraseña(contraseña);

		Connection con = conetar.getconexion();
		String sql = "UPDATE usuarios SET cargo=?, correo=?, contraseña=? WHERE usuario=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(4, modelousuario.getNombre());

			ps.setString(1, modelousuario.getCargo());

			ps.setString(2, modelousuario.getCorreo());
			ps.setString(3, modelousuario.getContraseña());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void eliminarUsuario(String usuario) {
		modelousuario.setNombre(usuario);
		String sql = " DELETE FROM usuarios WHERE usuario =?";

		Connection con = conetar.getconexion();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, modelousuario.getNombre());
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("aqui");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
