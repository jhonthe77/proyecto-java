package modelos;

public class Usuario {
String nombre,cargo,correo,contraseña;





public Usuario(String nombre, String cargo, String correo, String contraseña) {
	super();
	this.nombre = nombre;
	this.cargo = cargo;
	this.correo = correo;
	this.contraseña = contraseña;
}

@Override
public String toString() {
	return "" + contraseña ;
}

public String getContraseña() {
	return contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}



public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}
public Usuario() {
	// TODO Auto-generated constructor stub
}
}
