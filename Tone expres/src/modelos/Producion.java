package modelos;

public class Producion {

	public Producion() {
		// TODO Auto-generated constructor stub
	}
	private String codigodp,clinete,descriccion,codigomq,nombre,departamento;
	
	private int cantida;
	private double peso,total;
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	String usuario;
	public Producion(String codigodp, String clinete, String descriccion, String codigomq, String nombre,
			String departamento, int cantida, double peso,String usuario) {
		super();
		this.codigodp = codigodp;
		this.clinete = clinete;
		this.descriccion = descriccion;
		this.codigomq = codigomq;
		this.nombre = nombre;
		this.departamento = departamento;
		this.cantida = cantida;
		this.peso = peso;
		total=getCantida()*getPeso();
		this.usuario=usuario;
		
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCodigodp() {
		return codigodp;
	}
	public void setCodigodp(String codigodp) {
		this.codigodp = codigodp;
	}
	public String getClinete() {
		return clinete;
	}
	public void setClinete(String clinete) {
		this.clinete = clinete;
	}
	public String getDescriccion() {
		return descriccion;
	}
	public void setDescriccion(String descriccion) {
		this.descriccion = descriccion;
	}
	public String getCodigomq() {
		return codigomq;
	}
	public void setCodigomq(String codigomq) {
		this.codigomq = codigomq;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getCantida() {
		return cantida;
	}
	public void setCantida(int cantida) {
		this.cantida = cantida;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
