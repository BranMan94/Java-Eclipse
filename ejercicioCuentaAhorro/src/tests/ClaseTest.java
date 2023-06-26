package tests;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		
		//Instancia #1 (Cuenta Ahorro)
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f);//cuano no quiero polimorfear
		
		//Instancia #2 (plazoFijo)
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		
		//Mostrar informacion de las cuentas
		instancia1.imprimirDatos();//titular y cantidad
		System.out.println();
		instancia2.mostrarInformacion();

	}//main

}//claseTest
