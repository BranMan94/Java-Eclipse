package operadoresLogicos;

import java.util.Scanner;

public class ejerciciosLogicos {

	public static void main(String[] args) {
		
		
		/* Los operadores logicos se utilizan para combinar valores booleanos y nos devuelven un resultado verdadero, falso o nulo */
		
		
			//&& and (Y)
			//|| or (O)
			//! not (no)
		
		int a = 5;
		int b = 3;

		System.out.println(a == b || a > b);
		
		
		//Ejercicio par e impar
		Scanner read = new Scanner(System.in);
		int c;
		System.out.println("Ingrese un numero entero: ");
		c=read.nextInt();
		
		if(a%2==0) {
			System.out.println("El numero " + c + " es par");
		}else {
			System.out.println("El numero " + c + " es impar");
		}
		
		read.close();
		
		
		
		

	}

}
