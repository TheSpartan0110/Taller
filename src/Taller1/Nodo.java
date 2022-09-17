package Taller1;

public class Nodo {

	public Estudiante estudiante;
	public Nodo siguiente;

	public Nodo(Estudiante estudiante, Nodo siguiente) {

		this.estudiante = estudiante;
		this.siguiente = siguiente;
	}

	public Nodo(Estudiante estudiante) {

		this.estudiante = estudiante;
		this.siguiente = null;
	}
}
