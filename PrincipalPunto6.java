package Taller3;

import java.util.Scanner;

public class PrincipalPunto6 {

	 static Scanner sc = new Scanner(System.in);
	    static ContactoPunto6 agenda[] = new ContactoPunto6[3];
	    static int opcion = 0;
	    static int indiceArreglo = 0;
	   
	    public static void main(String[] args) {

	        do{
	        	mostrarMenu();
	        	
	        	while(pedirOpcion() == false);
	        	
	        	switch(opcion)
	        	{
	        	case 1:
	        		nuevoContacto();
	        		break;
	        	case 2:
	        		buscarContacto();
	        		break;
	        	case 3:
	        		eliminarContacto();
	        		break;
	        	case 4:
	        		listarContactos();
	        		break;
	        	case 5:
	        		System.out.println("FIN DEL PROGRAMA");
	        	}
	        }while(opcion != 5);

	    }
	   
	    static void mostrarMenu()
	    {
	    	System.out.println("\n");
	    	System.out.println(" 1 - Agregar contacto");
	        System.out.println(" 2 - Buscar contacto");
	        System.out.println(" 3 - Eliminar contacto");
	        System.out.println(" 4 - Mostrar todos los contactos");
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
	   
	    static void nuevoContacto()
	    {
	    	if (indiceArreglo == 5)
	    		System.out.println("\nLa Agenda esta llena. No caben nuevos contactos");
	    	else
	    	{
	    		System.out.print("\n Digite la letra P para agregar un nuevo contacto: ");
				char opcion = sc.nextLine().toUpperCase().charAt(0);
				
				switch (opcion)
				{
				
				case 'P':
					agenda[indiceArreglo] = pedirDatosPersona();
					indiceArreglo++;
					break;
				default:
					System.out.println("No se reconoce la opcion indicada: " + opcion);
				}
	    	}
	    }
	   
	    static personaPunto6 pedirDatosPersona()
	    {
	    	System.out.print("\nIntroduzca cedula: ");
			int cedula = sc.nextInt();sc.nextLine();
			System.out.print("Introduzca Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca organizacion: ");
			String organizacion = sc.nextLine();
			System.out.print("Introduzca numero celular: ");
			String telefonoCelular = sc.nextLine();
			
			return new personaPunto6(cedula, nombre , organizacion, telefonoCelular);
	    }
	   
	   
	    static void buscarContacto()
	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay Contactos registrados en la Agenda.");
	    	else
	    	{
	    		boolean encontrado = false;
	    		
	    		System.out.print("\nIntroduzca la cedula del Contacto a buscar: ");
	    		int cedulaaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (agenda[i].getcedula() == cedulaaBuscar)  {
	    				agenda[i].mostrarcontactoPunto6();
	    				      encontrado = true;
	                                break;
	                         }
	    		
	    		}
	   
	                 if (encontrado == false) 
		                System.out.println("No se encontro ningun contacto con la cedula:" + cedulaaBuscar);
	                 
	    	
	    	
	    	}
	    }
	    static void eliminarContacto()

	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay Contactos registrados en la Agenda.");
	    	else
	    	{
	    		boolean encontrado = false;
	    		
	    		System.out.print("\nIntroduzca la cedula del Contacto a Eliminar: ");
	    		int cedulaaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		ContactoPunto6 agendaAux[] = new ContactoPunto6[3];
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (!(agenda[i].getcedula() == cedulaaBuscar))  {
	    			
	    				agendaAux[i] = agenda[i];
	    				               
	                 }else {
	                	 encontrado=true;
	                	 indiceArreglo=indiceArreglo-1;
	                 } 
	    			
	    		
	    		}
	    		 agenda=agendaAux;
	    		
	   
	                 if (encontrado) 
		                System.out.println("Registro eliminado correctamente:" + cedulaaBuscar);
	                 
	    	
	    	
	    	}
	    }
	  
	    
	    
	    
	    
	   
	    static void listarContactos()
	    {

	    	if (indiceArreglo == 0)
	    		System.out.println("No hay Contactos registrados en la Agenda.");
	    	
	    	for (int i = 0; i < indiceArreglo; i++) {
			agenda[i].mostrarcontactoPunto6();
    				     
                          
	    	}       	
	    	
	    }
	    	
}
	   
	       
	
	
	
	

