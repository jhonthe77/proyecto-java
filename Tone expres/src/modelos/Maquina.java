package modelos;

public class Maquina {
	public Maquina() {
		
	}
	private String nombre,departamento,codigo_maquina;

	public Maquina(String nombre, String departamento, String codigo_maquina) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.codigo_maquina = codigo_maquina;
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

	public String getCodigo_maquina() {
		return codigo_maquina;
	}

	public void setCodigo_maquina(String codigo_maquina) {
		this.codigo_maquina = codigo_maquina;
	}

}
