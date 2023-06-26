package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	//1. Atributos
	public int plazo;
	public double interes;
	
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}//PlazoFijo
	
	
	//Metodo obtener importe de interes
	public double obtenerImporteInteres() {
		return (cantidad*interes)/100;
	}//obtenerImporteInteres
	
	
	//Metodo para mostrarInformacion
	public void mostrarInformacion() {
		System.out.println("Informacion de la cuenta Plazo Fijo");
		imprimirDatos();//metodo imprimir datos de la clase Cuenta
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total de Interes: " + obtenerImporteInteres());
	}
	
	
//	//2. Metodo para calcular importe del interes
//	public float calculoInteres(float cantidad, float interes) {
//		float totalInteres = (this.cantidad*this.interes)/100;
//		return totalInteres;
//	}//calculoInteres
	
	

}//clase PlazoFijo
