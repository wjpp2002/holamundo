package clases;

/**
 * Esta es una subclase de "Documento" y recoge la información sobre los libros.
 * @author Williams Jesús Paredes Panta
 * @version 1.0
 */

public class Libro extends Documento {
	
	/**
	 * Este atributo sirve para guardar el número de páginas que tiene el libro.
	 */
	
	// Variables
	private int numPaginas;
	
	/**
	 * Este es el constructor de la subclase Libro con el parámetro del número de páginas y los demás atributos heredados de la clase Documento.
	 * @param titulo
	 * @param autor
	 * @param numPaginas
	 * @param numEjemplares
	 * @param numEjemplaresPrestados
	 */
	
	// Constructor
	public Libro(String titulo, String autor, int numPaginas, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.numPaginas = numPaginas;
	}
	
	// Métodos getters & setters
	
	/**
	 * Este método nos retorna el número de páginas del libro.
	 * @return numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}

	/**
	 * Este método nos establece el número de páginas del libro.
	 * @param numPaginas
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	/**
	 * Este método nos iniciará el préstamo de un libro.
	 */
	public void prestamo() {

		System.out.println("Iniciando el préstamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("¡No se pueden prestar más libros, están todos prestados!" + "\n");
		} else {
			super.incrementaNumEjemplaresPrestados();System.out.println("El libro se ha prestado correctamente." + "\n");
		}
	}
	
	/**
	 * Este método inicia el proceso de devolución de un libro.
	 */
	public void devolucion() {
		
		System.out.println("Iniciando la devolución...");
		
		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("¡No se pueden devolver más libros, están todos devueltos!" + "\n");
		} else {
			super.decrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha devuelto correctamente." + "\n");
		}
	}
	
	@Override //metodo sobreescrito que devuelve un mensaje
    public String toString() {
        return  "== Información del libro - "  + getTitulo() + " ==" + "\n" +
        		"Autor: " + getAutor() + "\n" +
        		"Número de páginas: " + numPaginas + "\n" +
        		"Número de ejemplares en posesión: " + getNumEjemplares() + "\n" +
        		"Número de ejemplares prestados: " + getNumEjemplaresPrestados() + "\n";
    }
	
}
