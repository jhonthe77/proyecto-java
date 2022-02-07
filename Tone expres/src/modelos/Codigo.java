package modelos;

public class Codigo {
	public Codigo() {

	}

	private String cliente, descricion;
	private String codigo;
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

	public Codigo(String codigo, String cliente, String descricion) {
		super();
		this.cliente = cliente;
		this.descricion = descricion;
		this.codigo = codigo;
	
	}

}
