package abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {

		//Instancia de la clase automovil
		Automovil myTroquita = new Automovil();
		
		//Instancia de la classe motocicleta
		Motocicleta ninja = new Motocicleta();
		
		
		//Llamamos a los metodos de cada instancia
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();

	}

}
