package colecciones;

public class Cliente {
	
	//1. Atributos
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	//2. Constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		super();
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.setSaldo(saldo);
		this.nip = nip;
	}//Constructor
	
	//3. Metodos
	public void mostrarInfoClientes() {
		System.out.println("El nombres es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + getSaldo());
		System.out.println("El nip es: " + nip);
	}//mostrarInfoCliente

	//Getters y Setters
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}//public class Cliente


/*
 * Encapsulamiento (1 de los 4 pilares de la POO)
 * 
 * 
 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y metodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos.
 * 
 * 
 * Modificadores de acceso
 * 
 *  -public
 *  -private
 *  -protected
 *  -default (sin modificador de acceso)
 * 
 * Con esto buscamos evitar:
 * 
 *   -Reasignacion de valores
 *   
 *   float cuenta = 157,478.75f
 *   cuenta = 0.00f;
 *   
 *   
 *   Cuando declaramos nuestros atributos como privados, se impide el acceso a esta informacion (no podremos imprimirla en consola, ni mucho menos modificarla).
 *   
 *   
 *   Jesus.nombre = si puedo acceder porque la informacion es publica
 *   Jesus.setCuentaBancaria = no se muestra porque la informacion esta privada
 *   
 *   
 *   Para solventar esto, usamos los getters y setters. El getters nos permite acceder al dato por medio de un metodo publico llamado get, y tambien podemos modificar la informacion por medio del set (metodo publico)
 *   
 *   
 *   	Jesus.getSaldo();
		Jesus.setSaldo(##.##f);
 * 
 * 
 * Ventajas del encapsulamiento
 * 
 *  - Proteccion de datos: Cuando dejamos los datos en privado, se evita que se sobreescriban, que se accedan directamente a ellos y se modifiquen de manera incontrolada.
 *  
 *  - Control de accesl: Podemos usar validaciones o valores booleanos para tener acceso o no a la informacion (que un administrador pueda usar un setter para modificar algun dato en especifico).
 *  
 *  - Flexibilidad y mantenimiento: Poder cambiar la implementacion interna de nuestras clases (modificar el acceso, etc), sin modificar el codigo externo que la utiliza (herencia, etc.).
 *  
 *  -Abstraccion: El encapusulamiento nos permite ocultar los detalles internos de una clase, y nos proporciona un enfoque "mas limpio" sobre lo que hace una clase, mas no como lo hace. 
 * 
 * 
 */
