package abstraccion;

public class Motocicleta extends Vehiculo {

	//Las anotaciones 2 son "indicaciones" que le damos a JAVA
	
	@Override
	public void acelerar() {
		System.out.println("La motocicleta esta acelerando...");
	}
	
	//La subclase es quien decide cuando y como se sobreescribe el metodo abstracto. Es decir, la subclase implementa el metodo.

	@Override
	public void frenar() {
		System.out.println("La motocicleta esta frenando...");
		
	}

}
