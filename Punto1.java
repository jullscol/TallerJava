package Taller4;

import java.util.Scanner;


public class Punto1 {
	
	 
	public static void main(String[] args) {
		  
			

			 int[ ]numero;
			
			 			
			Scanner input = new Scanner(System.in);
			
			numero = new int[5];
			
											
			    for (int i = 0; i < 4; i++) 
			    {
				System.out.println("Digite el valor" );
				numero[i]= input.nextInt();
			 
			    }
			
			   	
	
		    	
		    	for (int i = 0; i < 4; i++) 
		         System.out.println("[" + i + "] = " + numero[i]);
		    	
		    	 input.close();	
		    	
		     }
		
	  
	}

	

	
	

	
		

	


