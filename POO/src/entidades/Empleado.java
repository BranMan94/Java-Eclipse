package entidades;

//Primero tengo que dar la instruccion de que quiero heredar
public class Empleado extends Persona {

	// 1. Atributos o propiedades

	public String numEmpleado;
	public String nss;
	public String puesto;

	// 2. Constructos con parametros (heredamos "la mitad" del constructor de
	// Persona
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); // nos indica que heredamos
		this.numEmpleado = numEmpleado; // solo defino los .this que me hacen falta
		this.nss = nss;
		this.puesto = puesto;
	}

	// 3. Metodo para imprimirInformacion empleado
	public void mostrarInformacion() {
	System.out.println("Nombre: " + nombre);
	System.out.println("Edad: " + edad);
	System.out.println("Correo: " + correo);
	System.out.println("Telefono: " + telefono);
	System.out.println("Numero Empleado: " + numEmpleado);
	System.out.println("Numero Seguro Social: " + nss);
	System.out.println("Puesto: " + puesto);
	}// cierre mostrar Informacion

	
	
	//4. toString
		//toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java). Este metodo ya se escribio, ya esta definidio y nos permite mostrar la informacion del objeto en una cadena de texto.
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
	

}
