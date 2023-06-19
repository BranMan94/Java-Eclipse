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
		
		Persona Brandon = new Persona("Brandon", 29, "brandon.manny01@gmail.com", "3318923606");
		
		Persona Andy = new Persona("Andy", 21, "andysomething@something.com", "818something");
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Felipe
		Felipe.mostrarInformacion();
		Brandon.mostrarInformacion();
		Andy.mostrarInformacion();
		

	}//cierre del main

}//cierre de la clase persona
