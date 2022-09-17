package Taller1;

public class Estudiante {
	private int codigo;
	private String nombre;
	private Double notaFinal;
	
	public Estudiante () {}

	public Estudiante(int codigo, String nombre, Double notaFinal) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.notaFinal = notaFinal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	
}
