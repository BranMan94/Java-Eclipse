package TiposDeDatosYVariables;

public class Ejercicios {

	public static void main(String[] args) {
	
	//System.out.println("Hola mundo");
	//Tipos de datos
		
		//Cine Java
		
		//byte: sirve para representar un valor numerico de 8 bits
		byte salas = 10;
		System.out.println(salas);
		
		
		//short: sirve para representar un valor numerico de 16 bits
		short asientos = 1120;
		System.out.println(asientos);
		
		
		//int: sirve para representar un valor numerico de 32 bits
		int dulces = 3476;
		System.out.println(dulces);
		
		
		//long: Sirve para representar un valor numerico 64 bits
		long clientes = 313600;
		System.out.println(clientes);
		
		
		//datos que pueden tener punto decimal
		
		
		//float: Sirve para almacenar un valor numerico de 32 bits
		float palomitas = 35.5f;
		System.out.println(palomitas);
		
		
		//double: Sirve para representar un valor numerico de 64 bits
		double ganancia = 23770880.7d;
		System.out.println(ganancia);
		
		//boolean: Sirve para representar valores booleanos y solamente tiene dos salidas, verdadero y falso
		//char: Sirve para representar un caracter o un numero
		
		
		//casting o casteo: Sirve para realizar una conversion de tipos de datos a uno mas grande o mas pequeño, incluso distinto
		double num = 59.7d;
		 //casteo a entero
		int numInt = (int) num;
		System.out.println("double" + numInt);
		
		long numlong = (long) num;
		System.out.println("long" + numlong);
		
		String cantidad = "85";
		String precio = "59.7";
		int cantidadEntero = Integer.parseInt(cantidad);
		double precioDouble = Double.parseDouble(precio);
		System.out.println("El valor de la compra es: $" + (cantidadEntero * precioDouble));
		
		
		//operadores aritmeticos
		int dias = 28;
		dias = dias / 2;
		System.out.println("dias:" + dias);
		
		
		//operadores de incremento y decremento
		int p = 0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		
		/*operadores relacionales
		 * == compara si un operador es igual a otro
		 * !0 diferente a
		 * < menor que
		 * > mayor que
		 * >= mayor o igual
		 * <= menor o igual
		 */
		
		int a = 10;
		int b = 15;
		boolean resultado;
		resultado = a != b;
		System.out.println("resultado de la operacion:" + resultado);
		
		
		
	}

}
