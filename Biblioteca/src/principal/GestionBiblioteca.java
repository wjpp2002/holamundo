package principal;

import clases.Enciclopedia;
import clases.Libro;

/**
 * Esta es la clase de la gestión bibliotecaria con los distintos documentos en ella.
 * @author Williams Jesús Paredes Panta
 * @version 1.0
 */

public class GestionBiblioteca {

	/**
	 * Este es el método principal del proyecto
	 * @param args	Argumentos de línea de comando
	 */
	public static void main(String[] args) {

		/**
		 * Estos objetos representan la creación de dos libros.
		 */
		
		// ======================
		// == Creamos 2 libros ==
		// ======================
		Libro l1 = new Libro("IT", "Stephen King", 1504, 5, 0);
		Libro l2 = new Libro("Los tres cerditos", "J.R.R. Tolkien", 547, 10, 10);

		// Mostramos información del primer libro
		System.out.println(l1);
		
		// Devolvemos un ejemplar de l1 (no tenemos ninguno prestado...)
		l1.devolucion();
		
		// Prestamos uno
		l1.prestamo();
		
		// Y ahora lo devolvemos
		l1.devolucion();

		// Mostramos información del segundo libro
		System.out.println(l2);

		// Devolvemos un ejemplar de l2 (están todos prestados...)
		l2.prestamo();
		// Prestamos uno
		l2.devolucion();
		// Y ahora lo devolvemos
		l2.prestamo();

		/**
		 * Estos objetos representan la creación de dos enciclopedias.
		 */
		
		// =============================
		// == Creamos 2 enciclopedias ==
		// =============================
		Enciclopedia e1 = new Enciclopedia("Enciclopedia Espasa", "Antonio Ramirez", "ESPASA", 10, 5);
		Enciclopedia e2 = new Enciclopedia("Enciclopedia Encarta", "Bill Gates", "Microsoft", 20, 15);

		// Mostramos información de la primera enciclopedia
		System.out.println(e1);

		// Devolvemos un ejemplar de e1
		e1.devolucion();
		// Prestamos una
		e1.prestamo();
		// Y ahora la devolvemos
		e1.devolucion();

		// Mostramos información de la segunda enciclopedia
		System.out.println(e2);

		// Prestamos una
		e2.prestamo();
		// Devolvemos un ejemplar de e1
		e2.devolucion();
		// Prestamos una
		e2.prestamo();
		// Y ahora la devolvemos
		e2.devolucion();
	}
}
