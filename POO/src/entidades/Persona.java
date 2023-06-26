/*
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
 * 
 *  - Primero nuestras propiedades o atributos usando variables de JAVA
 *  
 *  - Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 *  
 *  - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).
 *  
 *  
 *  
 *  Notas adicionales
 *  
 *  Sobrecarga de metodos.
 *  
 *  La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo.
 *  
 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 *  
 * SIEMPRE RESPETAR EL ORDEN DE LAS VARIABLES "LLAMADAS" EN LOS CONSTRUCTORES
 * 
 */


package entidades;

public class Persona {
	//1. Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2. Constructor (con parametros)
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}//cierre de constructor
	
	//Sobrecarga de metodo (overloading) constructor con 3
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}//cierre de constructor con 3
	
	//3. Metodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
	}//cierre mostrar informacion
	
	
	//Metodo para convertir dolares a pesos (funcion que retorna flotantes)
	public float conversor(float conversionDolar) {
		float dolar = 16.50f;
		float conversion = dolar*conversionDolar;
		System.out.println(conversion);
		return conversion;
	}//cierre de conversor
	
	
	
	//Metodo main es una funcion "ejecutora"
	public static void main(String[] args) {
		
		//Instancia de un objeto Persona
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		
		//Si no respetamos numero de parametros , orden de los datos o tipo de datos, tendremos errores para instanciar nuestros objetos
		Persona Brandon = new Persona("Brandon", 29, "brandon.manny01@gmail.com", "3318923606"); //segundo constructor
		
		Persona Andy = new Persona("Andy", 21, "andysomething@something.com", "818something");
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Felipe
		Felipe.mostrarInformacion();
		Brandon.mostrarInformacion();
		Andy.mostrarInformacion();
		

	}//cierre del main

}//cierre de la clase persona
