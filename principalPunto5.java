package Talle2;

import java.util.Scanner;


public class principalPunto5 {

	 static Scanner sc = new Scanner(System.in);
	    static medicamentoPunto5 medicina[] = new medicamentoPunto5[3];
	    static int opcion = 0;
	    static int indiceArreglo = 0;
	   
	    public static void main(String[] args) {

	        do{
	        	mostrarMenu();
	        	
	        	while(pedirOpcion() == false);
	        	
	        	switch(opcion)
	        	{
	        	case 1:
	        		nuevoMedicamento();
	        		break;
	        	case 2:
	        		buscarMedicamento();
	        		break;
	        	case 3:
	        	      venderMedicamento();
	        		break;
	        	case 4:
	        		listarMedicamentos();
	        		break;
	        	case 5:
	        		System.out.println("FIN DEL PROGRAMA");
	        	}
	        }while(opcion != 5);

	    }
	   
	  

		static void mostrarMenu()
	    {
	    	System.out.println("\n");
	    	System.out.println(" 1 - Agregar medicamento");
	        System.out.println(" 2 - Buscar medicamento");
	        System.out.println(" 3 - Vender");
	        System.out.println(" 4 - Mostrar medicamentos");
	        System.out.println(" 5 - Salir\n");
	    }
	   
	    static boolean pedirOpcion()
	    {
	    	try
	    	{
	    		System.out.print("\nIntroduzca opcion: ");
	    		opcion = sc.nextInt(); sc.nextLine();
	    		if (opcion >= 1 && opcion <= 5)
	    			return true; 		else
	    		{
	    			System.out.println("Error. Solo se admite valor entre 1 y 5.");
	    			return false;
	    			}
	    	}
	    	catch(Exception e)
	    	{
	    		sc.nextLine();
	    		System.out.println("Error. Introduzca solo numeros, entre 1 y 5.");
	    		return false;
	    	}
	    }
	   
	    static void nuevoMedicamento()
	    {
	    	if (indiceArreglo == 3)
	    		System.out.println("\nLa drogueria esta llena");
	    	else
	    	{
	    		System.out.print("\n Digite la letra M para agregar un nuevo medicamento: ");
				char opcion = sc.nextLine().toUpperCase().charAt(0);
				
				switch (opcion)
				{
				
				case 'M':
					medicina[indiceArreglo] = pedirDatosMedicamento();
					indiceArreglo++;
					break;
				default:
					System.out.println("No se reconoce la opcion indicada: " + opcion);
				}
	    	}
	    }
	    
	    static componentePunto5 pedirDatosMedicamento()
	    {
	    	System.out.print("\nIntrodusca nombre medicamento ");
			String medicamento = sc.nextLine();
			System.out.print("Introduzca el codigo ");
			int codigo = sc.nextInt();sc.nextLine();
			System.out.print("Introduzca el precio: ");
			float precio = sc.nextFloat();sc.nextLine();
			
			
			return new componentePunto5(precio, codigo , medicamento);
	    }
	    
	    static void buscarMedicamento()
	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay medicamentos registrados");
	    	else
	    	{
	    		boolean encontrado = false;
	    		
	    		System.out.print("\nIntroduzca el codigo del medicamento a buscar: ");
	    		int codigoaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (medicina[i].getcodigo() == codigoaBuscar)  {
	    				medicina[i].mostrarmedicamentoPunto5();
	    				      encontrado = true;
	                                break;
	                         }
	    		
	    		}
	   
	                 if (encontrado == false) 
		                System.out.println("No se encontro ningun medicamento:" + codigoaBuscar);
	                 
	    	}
	    }
	    	  private static void venderMedicamento() 
	  			 

		    {
		    	if (indiceArreglo == 0)
		    		System.out.println("No hay Contactos registrados en la Agenda.");
		    	else
		    	{
		    		boolean encontrado = false;
		    		
		    		System.out.print("\nIntroduzca la cedula del Contacto a Eliminar: ");
		    		int codigoaBuscar = sc.nextInt(); sc.nextLine();
		    		
		    		medicamentoPunto5 medicinaAux[] = new medicamentoPunto5[3];
		    		
		    		for (int i = 0; i < indiceArreglo; i++)
		    		{
		    			if (!(medicina[i].getcodigo() == codigoaBuscar) ) {
		    			
		    				medicinaAux[i] = medicina[i];
		    				               
		                 }else {
		                	 encontrado=true;
		                	 indiceArreglo=indiceArreglo-1;
		                 } 
		    			
		    		
		    		}
		    		 medicina=medicinaAux;
		    		
		   
		                 if (encontrado) 
			                System.out.println("Medicina vendida correctamente:" + codigoaBuscar);
		                 
		     
		    	
		    	}
		    }
		  
		    
		    static void listarMedicamentos()
		    {

		    	if (indiceArreglo == 0)
		    		System.out.println("No hay Medicamentos");
		    	
		    	for (int i = 0; i < indiceArreglo; i++) {
				medicina[i].mostrarmedicamentoPunto5();
	    				     
	                          
		    	}       	
	    	
	    	
	    	
	    	
	    
	    }
	    
	   }


