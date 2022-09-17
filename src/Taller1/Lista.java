package Taller1;

public class Lista {

	protected Nodo inicio;
	protected Nodo fin;
	protected int totalNodos = 0;
	

	public Lista() {

		this.inicio = null;
		this.fin = null;
	}

	public boolean ListaVacia() {

		if (this.inicio == null) {

			return true;

		} else {

			return false;
		}
	}

	public void IngresarInicioLista(Estudiante estudiante) {
		this.inicio = new Nodo(estudiante, this.inicio);

		if (this.fin == null) {

			this.fin = inicio;
		}
		this.totalNodos++;
	}

	public void IngresarFinLista(float elemento) {

		if (!ListaVacia()) {

			fin.siguiente = new Nodo(elemento);
			fin = fin.siguiente;

		} else {

			inicio = fin = new Nodo(elemento);
		}
	}

	public String MostrarLista() {

		String cadena = "";
		Nodo mostrar = inicio;

		while (mostrar != null) {

			cadena += "[" + mostrar.nota + "]\n";
			mostrar = mostrar.siguiente;

		}

		return cadena;
	}

	public int EliminarElementoInicio() {

        elemento_eliminar = inicio.nota;

        if (inicio == fin) {

            inicio = null;
            fin = null;

        } else {

            inicio = inicio.siguiente;
        }

        return elemento_eliminar;

    }
	
	public float promedio() {
		Nodo mostrar = inicio;
		float suma = 0;
		float promedio;
		int cont = 0;

		while (mostrar != null) {
			suma = suma + mostrar.nota;
			mostrar = mostrar.siguiente;
			cont += 1;
		}
		promedio = suma / cont;
		return promedio;

	}

}