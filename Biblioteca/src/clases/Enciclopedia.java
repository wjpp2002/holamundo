package clases;

/**
 * Esta es una subclase de "Documento" y recoge la información sobre la enciclopedias.
 * @author Williams Jesús Paredes Panta
 * @version 1.0
 */

public class Enciclopedia extends Documento {

	/**
	 * Este atributo sirve para conocer la editorial de la enciclopedia.
	 */
	
	// Variables
	private String editorial;
	
	/**
	 * Este es el constructor de la subclase Enciclopedia con el parámetro de la editorial y los demás atributos heredados de la clase Documento.
	 * @param titulo
	 * @param autor
	 * @param editorial
	 * @param numEjemplares
	 * @param numEjemplaresPrestados
	 */
	
	// Constructor
	public Enciclopedia(String titulo, String autor, String editorial, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.editorial = editorial;
	}
	
	// Métodos getters & setters
	
		/**
		 * Este método nos retorna el nombre de la editorial.
		 * @return editorial
		 */
	public String getEditorial() {
		return editorial;
		}

	/**
	 * Este método nos establece el nombre de la editorial.
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Este método nos iniciará el préstamo de una enciclopedia.
	 */
	public void prestamo() {

		System.out.println("Iniciando el préstamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("¡No se pueden prestar más enciclopedias, están todas prestadas!" + "\n");
		} else {
			super.incrementaNumEjemplaresPrestados();
			System.out.println("La enciclopedia se ha prestado correctamente." + "\n");
		}

	}

	/**
	 * Este método inicia el proceso de devolución de un libro.
	 */
	public void devolucion() {

		System.out.println("Iniciando la devolución...");

		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("¡No se pueden devolver más enciclopedias, están todas devueltas!" + "\n");
		} else {
			super.decrementaNumEjemplaresPrestados();
			System.out.println("La enciclopedia se ha devuelto correctamente." + "\n");
			System.out.println("");
		}

	}
	
	@Override //metodo sobreescrito que devuelve un mensaje
    public String toString() {
        return  "== Información del libro - "  + getTitulo() + " ==" + "\n" +
        		"Autor: " + getAutor() + "\n" +
        		"Número de páginas: " + editorial + "\n" +
        		"Número de ejemplares en posesión: " + getNumEjemplares() + "\n" +
        		"Número de ejemplares prestados: " + getNumEjemplaresPrestados() + "\n";
    }

}
