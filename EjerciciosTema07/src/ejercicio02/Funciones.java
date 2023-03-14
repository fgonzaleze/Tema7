package ejercicio02;

public class Funciones {
	String titulo;
	String autor;
	int numEjemplares; // No se modifica, va a ser la cantidad de ejemplares que tienes, independientemente de si los prestas o no
	int prestados;
	public Funciones() {
		super();
		
	}
	public Funciones(String titulo, String autor, int numEjemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
	}
	/**
	 * Clase para gestionar los préstamos 
	 * @return 
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
