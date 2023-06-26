package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {
	
	
	// Metodos (heredar datos)
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}//metodo cajaAhorro
	
	
	public void imprimirDatos() {
		System.out.println("Titular: " + titular );
		System.out.println("Cantidad: " + cantidad);
	}//imprimirDatos

	
	//toString
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
	

}//clase cajaAhorro
