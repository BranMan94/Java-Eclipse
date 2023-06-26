package ejercicioCuentaAhorro;

public class Cuenta {
	
	//1. Atributos
	String titular;
	float cantidad;
	
	
	//Constructor para pasarlo a las subclases
	public Cuenta(String titular, float cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}//constructor
	
	
	//2. Metodo para imprimir datos
	public void imprimirDatos() {
		System.out.println("Titular: ");
		System.out.println("Cantidad: ");
	}//imprimir Datos
	

}//clase Cuenta
