package Taller1;

import java.util.Scanner;

public abstract class Punto1 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);

String nombre,apellido;


System.out.println("Ingrese Nombre");

nombre = teclado.nextLine();

System.out.println("Ingrese Apellido");

apellido = teclado.nextLine();


System.out.println( "Usted se llama " + nombre + " " + apellido );


teclado.close();


	}

}
