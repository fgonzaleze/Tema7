package ejercicio02;

public class Funciones {
	String titulo;
	String autor;
	int numEjemplares; // No se modifica, va a ser la cantidad de ejemplares que tienes, independientemente de si los prestas o no
	int prestados;
	public Funciones() {
		super();
		
	}
	/**
	 * Constructor de funciones de la biblioteca
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 * @param numEjemplares cantidad de ejemplares del libro que hay
	 * @param prestados libros prestados
	 */
	public Funciones(String titulo, String autor, int numEjemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
	}
	/**
	 * Clase para gestionar los préstamos 
	 * @return Devuelve true si hay ejemplares disponibles para prestar, false en caso contrario
	 */
	boolean prestamo() {
		boolean estado = false;
		if(prestados<numEjemplares) {
			estado = true;
			prestados++;
		}
		return estado;
	}
	/**
	 * Clase para gestionar las devoluciones
	 * @return Devuelve true en caso de que haya mas que 0, y false en caso contrario
	 */
	boolean devolucion() {
		boolean estado = false;
		if(prestados>0) {
			estado = true;
			prestados--;
		}
		return estado;
	}
	
	
}
