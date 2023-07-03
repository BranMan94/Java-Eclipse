package entidades;

import colecciones.Cliente;

public class Test{

	public static void main(String[] args) {
		
		//Instancia de un empleado (que hereda de persona)
		System.out.println("Instancia de Empleado");
		
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@mail.com", "5511223344", "ABC123", "924979", "Bell Boy");
		
		EvilFelipe.mostrarInformacion();
		
		System.out.println("Impresion de Objetos");
		System.out.println(EvilFelipe);
		
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("Instancia de un Cliente");
		
		Cliente Jesus = new Cliente ("Jesus Gonzalez", "ABCD1234", 157654.00f, "1234");
		Jesus.mostrarInfoClientes();
		
		//Modificacion de un atributo
		Jesus.nombre = "Evil Jesus";
		Jesus.getSaldo();
		Jesus.setSaldo(0.00f);
		//Jesus.setCuentaBancaria("XYZ098"); modificacion sin setter (error)
		
		//Impresion del objeto ya modificado
		System.out.println(); //espacio
		Jesus.mostrarInfoClientes();

	}//Public static void

}//public class
