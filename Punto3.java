package Taller1;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		String nombre, nomp, apep,nomm,apem;


		System.out.println("Ingrese Nombre");

		nombre = teclado.nextLine();

		
		System.out.println("Ingrese Nombre de su padre");

		nomp = teclado.nextLine();

		System.out.println("Ingrese Apellido de su padre");

		apep = teclado.nextLine();
		
		System.out.println("Ingrese Nombre de su madre");

		nomm = teclado.nextLine();

		System.out.println("Ingrese Apellido de su madre");

		apem = teclado.nextLine();

		System.out.println( "Usted se llama " + nombre +  " "  + apep + " " + apem + " " + "Y es hijo de " + " " + nomp + " " +  "y" + " " + nomm );
		
		teclado.close();
		
	}

}
