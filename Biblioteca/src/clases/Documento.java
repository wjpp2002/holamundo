package clases;

/**
 * Esta clase abstracta nos sirve de modelo genérico para los documentos de la biblioteca.
 * @author Williams Jesús Paredes Panta
 * @version 1.0
 * 
 */

public abstract class Documento {
	
	/**
	 * Estos atributos sirven para conocer el título, el autor, la cantidad total de ejemplares y la cantidad de ejemplares prestados.
	 */
	
	// Atributos
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	
	/**
	 * Este es el constructor de la clase Documento con los atributos creados.
	 * @param titulo			Título del documento.
	 * @param autor					Autor del documento.
	 * @param numEjemplares				Número de ejemplares totales del documento.
	 * @param numEjemplaresPrestados		Número de ejemplares prestados.
	 */
	
	// Constructor
	public Documento(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
		}
	
	// Métodos getters & setters
	
	/**
	 * Este método nos retornará el título del documento.
	 * @return titulo	Título del documento.
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Este método nos permite establecer el valor de título.
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Este método nos devolverá el autor del documento.
	 * @return autor	Autor del documento
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Este método nos permite establecer el nombre del autor.
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Este método nos retornará la cantidad ejemplares de un documento.
	 * @return numEjemplares	Cantidad total de ejemplares.
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	
	/**
	 * Este método nos permite establecer la cantidad de ejemplares
	 * @param numEjemplares
	 */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	/**
	 * Este método nos devuelve la cantidad de ejemplares prestados.
	 * @return numEjemplaresPrestados	Cantidad de ejemplares en préstamo.
	 */
	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}
	
	/**
	 * Este método nos permite establecer la cantidad de documentos prestados.
	 * @param numEjemplaresPrestados
	 */
	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	
	/**
	 * Este método nos incrementa el número de ejemplares prestados.
	 */
	public void incrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados++;
	}

	/**
	 * Este método nos reduce el número de ejemplares prestados.
	 */
	public void decrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados--;
	}
	
	// Métodos abstractos
	
	/**
	 * Este método abstracto sirve para realizar un préstamo.
	 */
	public abstract void prestamo();
	
	/**
	 * Este método abstracto srive para realizar la devolución de un ejemplar.
	 */
	public abstract void devolucion();
	
}
