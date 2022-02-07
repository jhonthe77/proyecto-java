package controladores;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conetar {
	
	
	   Connection con = null;
	
	public Conetar() {
		
	}
	public Connection getconexion() {
		
		  String url= "jdbc:mysql://127.0.0.1:3306/toneladas";
		  String usuario="root";
		  String pass="";
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url, usuario, pass);
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
	
			e.printStackTrace();
		}
	
		return con;
		
	
	}

}
