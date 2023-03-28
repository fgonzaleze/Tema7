package ejercicio01;
/*
 * Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre y el saldo. Añade los siguientes constructores:
 - Con el DNI del titular de la cuenta y un saldo inicial.
 - Con el DNI, nombre y el saldo inicial.
Las operaciones típicas de una cuenta corriente son:
 - Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente. Si es posible llevar a cabo la operación se resta la cantidad a sacar al saldo de la cuenta.
 - Ingresar dinero: se incrementa el saldo.
 - Mostrar información: muestra la información disponible de la cuenta corriente.
 
 */

public class CuentaCorriente {
	/**
	 * String para guardar el DNI
	 */
	final String DNI;
	/**
	 * String para guardar el nombre del usuario
	 */
	String nombre;
	/**
	 * Double para guardar el saldo del usuario
	 */
	double saldo;

	/**
	 * Constructor para consultar la cuenta corriente
	 * @param DNI DNI del usuario
	 * @param saldo Saldo inicial
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}
	
	/**
	 * Constructor para consultar la cuenta corriente 
	 * @param DNI DNI del usuario
	 * @param nombre nombre del usuario
	 * @param saldo saldo disponible
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	/**
	 * Metodo para sacar dinero si es posible
	 * @param cantidad Será la cantidad de dinero que puede sacar
	 * @return Devuelve true si el saldo es mayor que la cantidad que quiere sacar, false si no tiene saldo suficiente
	 */
	public boolean sacarDinero(double cantidad) {
		boolean res = false;
		
		if(cantidad < saldo) {
			res=true;
			saldo -= cantidad;
		}
		
		return res;
	}
	/**
	 * Método para ingresar dinero
	 * @param cantidad ingresa al saldo la cantidad introducida
	 */
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	/**
	 * Convierte los datos a String para poder mostrarlos por pantalla
	 */
	public String toString() {
		String result = "";
		result += "DNI: " + DNI + "\n";
		result += "Nombre: " + nombre + "\n";
		result += "Saldo: " + saldo;
		return result;
	}

}
