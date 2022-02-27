package Talle2;

import java.util.Scanner;

public class Punto9 {
	
	
	static Scanner sc = new Scanner(System.in);
        static int opcion = 0;
   
   
    public static void main(String[] args) {

        do{
        	mostrarMenu();
        	
        	while(pedirOpcion() == false);
        	
        	switch(opcion)
        	{
        	case 1:
        		AreaTriangulo();
        		break;
        	
        	case 2:
        		AreaRectangulo();
        		break;
        	case 3:
        		AreaTrapecio();
        		break;       	
        	case 4:
        		System.out.println("FIN DEL PROGRAMA");
        	}
        }while(opcion != 4);

    }
   
    static void mostrarMenu()
    {
    	System.out.println("\n");
    	System.out.println(" Que area desea calcular");
    	System.out.println(" 1 - Area del triangulo");
    	System.out.println(" 2 - Are del rectangulo");
        System.out.println(" 3 - Area del trapecio");
        System.out.println(" 4 - Salir\n");
    }
   
    static boolean pedirOpcion()
    {
    	try
    	{
    		System.out.print("\nIntroduzca opcion: ");
    		opcion = sc.nextInt(); sc.nextLine();
    		if (opcion >= 1 && opcion <= 4)
    			return true;
    		else
    		{
    			System.out.println("Error. Solo se admite valor entre 1 y 4.");
    			return false;
    		}
    	}
    	catch(Exception e)
    	{
    		sc.nextLine();
    		System.out.println("Error. Introduzca solo numeros, entre 1 y 4.");
    		return false;
    	}
    }
	
    static void AreaTriangulo() 
    {
    
    
    System.out.print("\nIngrese base: ");
	float a = sc.nextFloat();
	System.out.print("\nIngrese altura: ");
	float b = sc.nextFloat();sc.nextLine();
	System.out.print("\nEl area del triangulo es: " +  (a*b)/2);
    
    
    }
    
    static void AreaRectangulo() 
    {
    
    
    System.out.print("\nIngrese base: ");
	float a = sc.nextFloat();
	System.out.print("\nIngrese altura: ");
	float b = sc.nextFloat();sc.nextLine();
	System.out.print("\nEl area del rectangulo es: " +  a*b);
    
    
    }
    
    static void AreaTrapecio() 
    {
    
    
    System.out.print("\nIngrese base mayor: ");
	float a = sc.nextFloat();
	System.out.print("\nIngrese base menor: ");
	float b = sc.nextFloat();
	System.out.print("\nIngrese altura: ");
	float c = sc.nextFloat();sc.nextLine();
	System.out.print("\nEl area del trapecio es: " + ((a+b)/2)*c );
    }
    
    
    
}
