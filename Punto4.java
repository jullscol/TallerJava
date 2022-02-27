package Taller1;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		

		
		Scanner teclado = new Scanner(System.in);

		String Pais, Capital;


		System.out.println("Ingrese Nombre de Pais");

		Pais = teclado.nextLine();

		System.out.println("Ingrese Nombre de su Capital");

		Capital = teclado.nextLine();


		System.out.println( Capital + " " +"es la capital de " + " " + Pais );
		
		teclado.close();
		
	}

}
