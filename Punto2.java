package Taller4;

import java.util.Random;



public class Punto2 {
	
	static int i=0;

	public static void main(String[] args) {
		
		
			
		int tabla[]=new int[20];
		Random rnd=new Random();
		int x=0;
		int conteo_pares=0,conteo_impares=0;
					
		System.out.println("\n Numeros Aleatorios");
		for(i=0;i<20;i++)
			{
			x=(int)(rnd.nextDouble()*100);
			tabla[i]=x;
			
			System.out.println(tabla[i]);
			
		
		    if (tabla[i] % 2 == 0) {
		        conteo_pares++;
		      
		    } 
		    else {
		        conteo_impares++;
		      }
		    
	     }
		
	     int par[] = new int[conteo_pares];
	     int impar[] = new int[conteo_pares];		 
	    	
	     conteo_pares=0;
	     conteo_impares=0;
	     
	     for(int i=0;i<20;i++) 
	     {
	     	if(tabla[i] % 2 ==0) 
	     	{
	     	par[conteo_pares] = tabla[i];
	     	conteo_pares++;
	     	}
	     	else 
	     	{
	     		impar[conteo_impares] = tabla[i];
		     	conteo_impares++;
		     		
	     	}
	     }
	     
	     System.out.println("\n Pares");
	     for (int i=0;i<conteo_pares;i++) 
	     {
	    	 System.out.println(par[i]);
         
	     } 
	      System.out.println("");
	      
	      System.out.println("\n Impares");
		     for (int i=0;i<conteo_impares;i++) 
		     {
		    	 System.out.println(impar[i]);
	         
		     } 
		      System.out.println(""); 
	      
	      
	      
	      
     }
	
}                     


		
		
		
		
	


