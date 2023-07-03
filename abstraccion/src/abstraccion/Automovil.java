package abstraccion;

public class Automovil extends Vehiculo {

	@Override
	public void acelerar() {
		System.out.println("El automovil esta acelerando...");
		
	}//cierre acelerar

	@Override
	public void frenar() {
		System.out.println("El automovil esta frenando...");
		
	}//cierre frenar

}//Cierre de clase Automovil
