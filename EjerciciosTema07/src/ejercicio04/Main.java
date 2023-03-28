package ejercicio04;

public class Main {

	public static void main(String[] args) {
		Articulo filetonBacalao = new Articulo("Filetón de bacalao", 10.99, 650);

		System.out.println(filetonBacalao);
		System.out.println(filetonBacalao.getPVP());
		System.out.println(filetonBacalao.getPVPDescuento(0.20));
		
		// Almacenamos 5 y 7 
		filetonBacalao.almacenar(5);
		filetonBacalao.almacenar(7);
		
		// Los filetes de bacalao que vendemos
		filetonBacalao.vender(100);
		
		// Imprimimos la cantidad
		System.out.println("Cantidad: " + filetonBacalao.getCantidad());
		System.out.println(filetonBacalao);
	}

}
