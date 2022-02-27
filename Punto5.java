package Taller1;

import java.util.Scanner;

public class Punto5 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);

		String nombreM, nombreD, Tipo;
	
		int edad;
		


		System.out.println("Ingrese Nombre del dueño ");

		nombreD = teclado.nextLine();

		System.out.println("Ingrese Nombre de la mascota");

		nombreM = teclado.nextLine();
		
		
		System.out.println("Ingrese el tipo de mascota");

		Tipo = teclado.nextLine();

		
		System.out.println("Ingrese la edad de su mascota ");

		edad = teclado.nextInt();



		System.out.println( nombreM + " " + "Es un " + Tipo + " " + "el cual tiene" + " " + edad +" " + "años" + " "+"y"+" " + nombreD + " " + " " + "Es su actual dueño" );
		
		teclado.close();
	}

}
