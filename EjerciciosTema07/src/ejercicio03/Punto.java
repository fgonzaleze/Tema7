package ejercicio03;
/*
 * Crea una clase llamada Punto que representará un punto de dos dimensiones en un plano. 
 * Solo contendrá dos atributos enteros llamadas x e y (coordenadas). Debe tener los siguientes métodos:
 - Un constructor con parámetros que copie las coordenadas pasadas como argumento a los atributos del objeto.
 - imprime: Imprime por pantalla las coordenadas. Ejemplo: “(7, -5)”
 - setXY(int x, int y): Modifica ambas coordenadas.
 - desplaza(int dx, int dy): Desplaza el punto la cantidad (dx,dy) indicada. 
   Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
 - distancia(Punto p): Calcula y devuelve la distancia entre el propio objeto (this) 
   y otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.
 */

public class Punto {
	/**
	 * Eje x
	 */
	int x;
	/**
	 * Eje y
	 */
	int y;

	/**
	 * Constructor que copia las coordenadas a los atributos del objeto
	 * 
	 * @param x Asigna la posición del eje x
	 * @param y Asigna la posicion del eje y
	 */
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	/**
	 * Metodo encargado de imprimir por pantalla las coordenadas
	 */
	public String toString() {
		String result = "";
		result += x + y;
		return result;

	}

	/**
	 * Método que modifica las coordenadas del punto
	 * 
	 * @param x posicion x
	 * @param y posicion y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Método para desplazarnos la cantidad indicada
	 * 
	 * @param dx Para desplazarnos en el eje x
	 * @param dy Para desplazarnos en el eje y
	 * @return devuelve los parámetros nuevos
	 */
	public int desplaza(int dx, int dy) {

		int desplaza;

		x += dx;

		y += dy;

		desplaza = x + y;

		return desplaza;
	}

	public double distancia(Punto p) {
		// Inicializamos la distancia
		double distancia = 0;

		// Calcular la distancia entre puntos
		// distancia = ????? FORMULA NO SE

		return distancia;
	}

}
