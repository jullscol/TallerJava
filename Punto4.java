package Taller3;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
	
		
		
		
		Scanner mult = new Scanner(System.in);{
		int n,i;
		
		 System.out.print("  Escriba el valor que desea conocer de la tabla");
		 
		 n = mult.nextInt();
		 
		 System.out.println("Tabla del" + n);
		 for (i=1; i<=10; i++) {
			 System.out.println(n + " * " + i + " = " + n*i);
		 } 
		 
		mult.close();
	}
	}
		

}
