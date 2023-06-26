package colecciones;

import java.util.Set; //papa
import java.util.HashSet; //hijo

public class Colecciones {

	public static void main(String[] args) {
		
		//Instanciando un espacio donde guardar objetos
//		Set<String> cartasDeJuego = new HashSet<>();
		
		//Objeto
//		Empleado Felipe = new Empleado();
		
		
		//Declarando mi primer arreglo de Java []
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, despues el nombre de mi arreglo y por ultimo instancio mi arreglo. Los datos que voy a guardar en este arreglo, van dentro de {}
		
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		//Impresion de mi array
		System.err.println(listaCompras);
		
		
		
		//forEach para imprimir cada elemento de mi lista de compras
		//para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}//for
		
		
		//Arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		//Inicializo o asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[7] = "108";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
		
		/* habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de los elementos declarados al principio, tendremos una excepcion que solo veremos cuando se ejecute el programa */
		
		//Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto para porque para JAVA es preferible tener un elmento nulo a uno indefinido.
		System.out.println(habitaciones[8]);
		
		
		//En caso de querer usar un foreach para imprimir los elementos, solo itera sobre los elementos existentes.
		
//		Set<String> cartasDeJuego = new HashSet<>();

	}//public static void

}//public class Colecciones





/*

Colecciones

- Arrays

Un aaray es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos atraves de un indice. Sus principales caracteristicas son:

	1. Tamaño fijo.
	2. Acceso rapido.
	3. Coste elevado para insertar o eliminar elementos.


*/




















