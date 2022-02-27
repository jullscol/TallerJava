package Talle2;

import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
	

		Scanner teclado = new Scanner(System.in);
		int edad, dato=18;

		
		System.out.println("Que edad tiene");
		
		edad = teclado.nextInt();
		
		
		if (edad >= dato) {
			
			System.out.println("Usted es mayor de edad");

		}
		
		teclado.close();
	}

}
