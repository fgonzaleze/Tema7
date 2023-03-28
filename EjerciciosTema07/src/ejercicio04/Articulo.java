package ejercicio04;

public class Articulo {
	/**
	 * String que contiene el nombre
	 */
	private String nombre;
	/**
	 * Double que contiene el precio
	 */
	private double precio;
	/**
	 * int con la cantidad del producto
	 */
	private int cantidad;
	/**
	 * IVA en forma de final double ya que no se modificará
	 */
	public final static double IVA = 0.21;
	
	/**
	 * Metodo para la creacion del articulo
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Articulo(String nombre, double precio, int cantidad) {
		if(!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		} else {
			System.out.println("El nombre introducido no es válido");
		}
		
		if(precio>0) {
			this.precio = precio;
		} else {
			System.out.println("El precio introducido no es válido");
		}
		
		if(cantidad>=0) {
			this.cantidad = cantidad;
		} else {
			System.out.println("La cantidad introducida no es válida");
		}
	}

	public Articulo (Articulo a) {
		this.nombre = a.nombre;
		this.precio = a.precio;
		this.cantidad = a.cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio = precio;
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if(cantidad >= 0) {
			this.cantidad = cantidad;
		}
	} 
	
	public String toString() {
		String cadena = "";
		
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		cadena += "Cantidad: " + this.cantidad + "\n";
		cadena += "IVA: " + IVA + "\n";
		
		return cadena;
	}
	
	public double getPVP() {
		double precioIVA = (this.precio*IVA) + this.precio;
		return precioIVA;
	}
	
	public double getPVPDescuento(double descuento) {
		double precioIVA = getPVP();
		double precioFinal = precioIVA - (precioIVA*descuento);
		return precioFinal;
	}
	
	public boolean vender (int cantidad) {
		boolean venta = false;
		if(this.cantidad>=cantidad) {
			venta = true;
			this.cantidad -= cantidad;
		}
		return venta;
	}
	
	public void almacenar(int cantidad) {
		this.cantidad += cantidad;
	}

}
