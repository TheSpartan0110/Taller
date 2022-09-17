package Taller1;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		Lista L1 = new Lista();

		int op;
		float nota;
		float prom;
		String ntasTot;

		do {

			String menu = "---MENU---\n\n" 
					+ "1. Ingrese la nota al inicio de la lista\n"
					+ "2. Ingrese la nota al final de la lista\n" 
					+ "3. Mostrar la lista\n"
					+ "4. Mostrar el promedio de las calificaciones\n" 
					+ "0. Salir\n\n" 
					+ "Digite su opción: ";

			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (op) {

			case 1:
				nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un nota: ", "Inserte nota al inicio"));
				if (nota >= 0 && nota <= 5) {
					L1.IngresarInicioLista(nota);
				} else {
					JOptionPane.showMessageDialog(null, "La nota no está entre 0 y 5");
				}
				break;

			case 2:
				nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un nota: ", "Inserte nota al inicio"));
				if (nota >= 0 && nota <= 5) {
					L1.IngresarFinLista(nota);
				} else {
					JOptionPane.showMessageDialog(null, "La nota no está entre 0 y 5");
				}	
				break;
				
			case 3:
				ntasTot = L1.MostrarLista();
				JOptionPane.showMessageDialog(null, ntasTot);
				break;

			case 4:
				prom = L1.promedio();
				JOptionPane.showMessageDialog(null, prom);
				break;

			case 0:
				JOptionPane.showMessageDialog(null, "Programa Finalizado.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción incorrecta, Intente nuevamente");
				break;

			}

		} while (op != 0);

	}

}
