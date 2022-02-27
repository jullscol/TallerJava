package Talle2;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		int edad, dato=18;

       System.out.println(" Cual es su nombre ");
		
		nombre = teclado.nextLine();
		
		
		System.out.println("Que edad tiene");
		
		edad = teclado.nextInt();
		
		
		if (edad >= dato) {
			
			System.out.println(nombre + " " + "Usted es mayor de edad por lo tanto puede entra a la fiesta");
			
		}

		else	{
			
			System.out.println(nombre + " " + "Usted es menor de edad por lo tanto usted no puede entrar a la fiesta, por favor devuelvase para su casa");
			
		}
		
		
		teclado.close();
		
	}

}
