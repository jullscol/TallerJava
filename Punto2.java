package Taller1;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

		String nombre,apellido;
		float estatura;
		int edad ;
		


		System.out.println("Ingrese Nombre");

		nombre = teclado.nextLine();

		System.out.println("Ingrese Apellido");

		apellido = teclado.nextLine();
		
		
		System.out.println("Ingrese su estatura");

		estatura = teclado.nextFloat();

		
		System.out.println("Ingrese su edad");

		edad = teclado.nextInt();



		System.out.println( "Usted se llama " + nombre + " " + apellido  );
		System.out.println( "Su estatura es:  " + estatura  );
		System.out.println( "Su edad es:   " + edad );
		
		teclado.close();

			}

		}

		

	
