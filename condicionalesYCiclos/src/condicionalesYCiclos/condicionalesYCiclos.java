package condicionalesYCiclos;

import java.util.Scanner;

public class condicionalesYCiclos {

	public static void main(String[] args) {
		
			/*
			 * Condicionales
			 * 
			 * 
			 * if
			 * else
			 * else if
			 * switch
			 */
		
			System.out.println("Programa para calcular la hora");
			
			//Equivalente al prompt en JS se llama Scanner
			//var hora = prompt("mensaje");
			
			//Java, creo un nuevo objeto Scanner, llamalo hora y este sera una nuevo objeto de la clase Scanner que tiene los argumentos para guardar la informacion que le pase como entrada
			Scanner valorIngresado = new Scanner(System.in); //declaro objeto y le paso info
			
			System.out.println("Por favor, ingresa una hora en un formato de 24 horas");
			
			int hora = valorIngresado.nextInt(); //usar la informacion del objeto
			
			
		if(hora >= 0 && hora <= 23) {			
			if(hora>=7 && hora <=11) { //que es una hora valida
				System.out.println("Buenos dias solecito");
			}else if (hora >= 12 && hora <= 18) {
				System.out.println("Buenas tardes, que calor hace");
			}else if (hora >= 19 && hora <24) {
				System.out.println("Buenas noches, a mimir");
			}else {
				System.out.println("Es de madrugada, no es bueno desvelarse");}			
		}else {
			System.out.println("Hora mal ingresada");
		}//cierre del if general
		
		valorIngresado.close();//cierre del scanner
		
		
		/*Condicional switch*/
		
		int opcion = 1;
		
		switch (opcion) {
		
			case 1:
			System.out.println("Bienvenido al servicio de reservas");
			break;
			
			case 2:
			System.out.println("Bienvenido al servicio de check-in");
			break;
			
			case 3:
			System.out.println("Bienvenido al servicio de check-out");
			
			default:
			System.out.println("Opcion invalida");
			break;
		
		}//cierre del switch
		
		
		
		//Ejemplo del switch anidado
		int entradaDeDato = 5;
		
		switch(entradaDeDato) {
		case 1:
			switch(otraOpcion) {
			case 1:
				System.out.println("Esta es la primera opcion, del primero caso");
			case 2:
				System.out.println("");
				break;
				default:
					System.out.println();	
			}//cierre de switch (otraOpcion)
		}//cierre de switch (entradaDeDato)

	}//cierre del metodo main

}//cierre de la clase Condicionales
