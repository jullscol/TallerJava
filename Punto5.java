package Taller3;



	import java.util.Scanner;

	public class Punto5 {

		 static Scanner sc = new Scanner(System.in);
		    static ContactoPunto6 agenda[] = new ContactoPunto6[3];
		    static int opcion = 0;
		    
		    static String nombre;
		   
		    public static void main(String[] args) {

		        do{
		        	mostrarMenu();
		        	
		        	while(pedirOpcion() == false);
		        	
		        	switch(opcion)
		        	{
		        	case 1:
		        		capturarNombre();
		        		break;
		        	case 2:
		        		Saludar();
		        		break;
		        	
		        	case 3:
		        		System.out.println("FIN DEL PROGRAMA");
		        	}
		        }while(opcion != 3);

		    }//Fin del metodo main()
		   
		    static void mostrarMenu()
		    {
		    	System.out.println("\n");
		    	System.out.println(" 1 - Capturar nombre");
		        System.out.println(" 2 - Saludar");
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
		    
		    
		    
		    static void capturarNombre() {
		    	
		    System.out.print("Introduzca Nombre: ");
				 nombre = sc.nextLine();
				
				
				
				}
		    	
		  
		    static void Saludar() {
		 
		   
			   
			   if (nombre.equals("")) {
				   
				   System.out.print(" Se necesita introducir nombre");
			   }else
			   
			   
			   System.out.println("Hola " + nombre);
			   }
		    
		    
		    
}
