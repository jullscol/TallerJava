package Talle2;

import java.util.Scanner;

public class Punto10 {

	
	static Scanner sc = new Scanner(System.in);
    static int opcion = 0;
    static float saldo =1000;


public static void main(String[] args) {

    do{
    	mostrarMenu();
    	
    	while(pedirOpcion() == false);
    	
    	switch(opcion)
    	{
    	case 1:
    		Saldo();
    		break;
    	
    	case 2:
    		Consignar();
    		break;
    	case 3:
    		Retirar();
    		break;       	
    	case 4:
    		System.out.println("FIN DEL PROGRAMA");
    	}
    }while(opcion != 4);

}

static void mostrarMenu()
{
	System.out.println("\n");
	System.out.println(" Que operacion desea realizar");
	System.out.println(" 1 - Consultar saldo");
	System.out.println(" 2 - Consignar");
    System.out.println(" 3 - Retirar");
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

static void Saldo() 
{


         System.out.print("\nSu saldo actua es: $ " + saldo);



}

static void Consignar() 
{


         System.out.print("\nIngresar la cantidad a consignar ");
         float deposito = sc.nextFloat();

         if(deposito<0) 
                 	 
        	 System.out.print("\nEl valor es negativo no se puede consignar ");
         
                  
        	 else 
        	 {
        		saldo=saldo+deposito;
             System.out.print("\nSu saldo actual es " + saldo);
	
        	 }
        	 }





static void Retirar() 
{

    System.out.print("\nIngresar la cantidad a retirar ");
    float retiro = sc.nextFloat();

    if(retiro>saldo) 
    
   	 System.out.print("\nLa cantidad supera el saldo " + " ua saldo actual es $" + saldo);
    
     
     
     else {
    	
    	 
      
   	   saldo=saldo-retiro;
       System.out.print("\nSu saldo actual es " + saldo);

     
   	 }

}


}
	

