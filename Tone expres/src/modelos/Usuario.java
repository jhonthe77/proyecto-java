package modelos;

public class Usuario {
String nombre,cargo,correo,contrase�a;





public Usuario(String nombre, String cargo, String correo, String contrase�a) {
	super();
	this.nombre = nombre;
	this.cargo = cargo;
	this.correo = correo;
	this.contrase�a = contrase�a;
}

@Override
public String toString() {
	return "" + contrase�a ;
}

public String getContrase�a() {
	return contrase�a;
}

public void setContrase�a(String contrase�a) {
	this.contrase�a = contrase�a;
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
