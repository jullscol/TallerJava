package Talle2;

import java.util.Scanner;

public class Punto8 {

	
	static Scanner sc = new Scanner(System.in);
    
    static int sabor,decoraciones, opciones, porciones,cantidad,disponible;
    static float precio, total, r;
    
    
    static float total_venta = 0;
    static float compra_mayor = 0;
    static int tortas =10;
    static int opcion = 0;
	
	
	public static void main(String[] args) {
		
		
			

	        do{
	        	mostrarMenu();
	        	
	        	while(pedirOpcion() == false);
	        	
	        	switch(opcion)
	        	{
	        	case 1:
	        		PedidoTortas();
	        		break;
	        	case 2:
	        		Consulta();
	        		break;
	        		        		
	        	case 3:
	        		System.out.println("FIN DEL PROGRAMA");
	        	}
	        }while(opcion != 2);

	    }
	   
	    static void mostrarMenu()
	    {
	    	System.out.println("\n");
	    	System.out.println(" 1 - Realizar el pedido");
	    	System.out.println(" 2 - Consulta ventas");
	    	System.out.println(" 3 - Salir\n");
	    }
	   
	    static boolean pedirOpcion()
	    {
	    	try
	    	{
	    		System.out.print("\nIntroduzca opcion: ");
	    		opcion = sc.nextInt(); sc.nextLine();
	    		if (opcion >= 1 && opcion <= 3)
	    			return true;
	    		else
	    		{
	    			System.out.println("Error. Solo se admite valor entre 1 y 3.");
	    			return false;
	    		}
	    	}
	    	catch(Exception e)
	    	{
	    		sc.nextLine();
	    		System.out.println("Error. Introduzca solo numeros, entre 1 y 3.");
	    		return false;
	    	}
	    }
	    
	    
	    static void PedidoTortas() 
	    {
	    	System.out.println("Cuantas tortas quiere");		
	    	cantidad= sc.nextInt();   
	    	
	    	System.out.println("Que sabor quiere");
	    	System.out.println("1:Torta de chocolate");
	    	System.out.println("2:Torta de Mora");
	    	System.out.println("3:Torta de vainilla");
	    	sabor = sc.nextInt();   
	       
	    	System.out.println("Cuantas quiere");
	    	System.out.println("1:Cinco porciones");
	    	System.out.println("2:Diez porciones");
	    	System.out.println("3:quince porciones");
	    	porciones = sc.nextInt();   
	       
	    	System.out.println("Que decoracion quiere");
	    	System.out.println("1:Decoracion 1");
	    	System.out.println("2:Decoracion 1");
	    	System.out.println("3:Decoracion 3");
	    	decoraciones = sc.nextInt();   
	       
	    	System.out.println("Escriba el Precio");
	    	float precio = sc.nextFloat();  
	        total=precio;
	        
	        System.out.println("El precio a pagar es: $" + total);
	        
	        if(total> compra_mayor) 
	        {
	        compra_mayor=total;
	        }

	        total_venta=total_venta+total;
	        
	    }
	    
	    
	    static void Consulta() 
	    {
	    
	   
	    System.out.println("El total de la venta del dia  es: $" + total_venta);
	    disponible=tortas-cantidad;
	    System.out.println("Tenemos" + " " + disponible + " " + " Tortas disponibles");
	    }
	    
}
