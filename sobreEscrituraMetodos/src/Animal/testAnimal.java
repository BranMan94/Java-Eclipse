package Animal;

public class testAnimal {

	public static void main(String[] args) {

		//Creamos un animal, en este momento usamos el metodo que imprime "hacer sonido", y cuando definimos que este animal es un gato, se sobreescribe el metodo y se cambia por "miau miau".
		Animal Gardfield = new Gato(); //miau miau
		Gardfield.hacerSonido();
		
		Animal Godzilla = new Animal(); //hacer sonido
		Godzilla.hacerSonido();

	}//cierre public static void

}//cierre de clase
