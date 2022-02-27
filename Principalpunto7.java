package Taller3;

import java.util.Scanner;

public class Principalpunto7 {

	 static Scanner sc = new Scanner(System.in);
	    static NombrepropietarioPunto7 registro[] = new NombrepropietarioPunto7[5];
	    static int opcion = 0;
	    static int indiceArreglo = 0;
	   
	    public static void main(String[] args) {

	        do{
	        	mostrarMenu();
	        	
	        	while(pedirOpcion() == false);
	        	
	        	switch(opcion)
	        	{
	        	case 1:
	        		ingresoVehiculo();
	        		break;
	        	case 2:
	        		buscarVehiculo();
	        		break;
	        	case 3:
	        		retirarVehiculo();
	        		break;
	        	case 4:
	        		listarVehiculos();
	        		break;
	        	case 5:
	        		System.out.println("FIN DEL PROGRAMA");
	        	}
	        }while(opcion != 5);

	    }
	   
	    static void mostrarMenu()
	    {
	    	System.out.println("\n");
	    	System.out.println(" 1 - Ingresar vehiculo");
	        System.out.println(" 2 - Buscar vehiculo");
	        System.out.println(" 3 - Retirar vehiculo");
	        System.out.println(" 4 - Mostrar todos losvehiculos en el parqueadero");
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
	   
	    static void ingresoVehiculo()
	    {
	    	if (indiceArreglo == 5)
	    		System.out.println("\n El parquedero esta lleno");
	    	else
	    	{
	    		System.out.print("\n Digite la letra V para ingresar un nuevo vehiculo: ");
				char opcion = sc.nextLine().toUpperCase().charAt(0);
				
				switch (opcion)
				{
				
				case 'V':
					registro[indiceArreglo] = pedirDatosPersona();
					indiceArreglo++;
					break;
				default:
					System.out.println("No se reconoce la opcion indicada: " + opcion);
				}
	    	}
	    }
	   
	    static VehiculosPunto7 pedirDatosPersona()
	    {
	    	System.out.print("\nIntroduzca el numero de placa: ");
			int placa = sc.nextInt();sc.nextLine();
			System.out.print("Introduzca Nombre del propietario: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca marca vehiculo: ");
			String marca = sc.nextLine();
			System.out.print("Introduzca el numero de cedula del propietario: ");
			String cedula = sc.nextLine();
			System.out.print("Introduzca numero celular: ");
			String telefonoCelular = sc.nextLine();
			
			return new VehiculosPunto7(cedula, nombre , marca, placa, telefonoCelular);
	    }
	   
	   
	    static void buscarVehiculo()
	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay vehiculos en el parqueadero.");
	    	else
	    	{
	    		boolean encontrado = false;
	    		
	    		System.out.print("\nIntroduzca la placa del vehiculo a buscar: ");
	    		int placaaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (registro[i].getPlaca() == placaaBuscar)  {
	    				registro[i].mostrarvehiculosPunto7();
	    				      encontrado = true;
	                                break;
	                         }
	    		
	    		}
	   
	                 if (encontrado == false) 
		                System.out.println("No se encontro ningun con la placa:" + placaaBuscar);
	                 
	    	
	    	
	    	}
	    }
	    static void retirarVehiculo()

	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay vehiculos en el parqueadero.");
	    	else
	    	{
	    		boolean encontrado = false;
	    		
	    		System.out.print("\nIntroduzca la placa del vehiculo a retirar: ");
	    		int placaaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		NombrepropietarioPunto7 registroAux[] = new NombrepropietarioPunto7[5];
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (!(registro[i].getPlaca() == placaaBuscar))  {
	    			
	    				registroAux[i] = registro[i];
	    				               
	                 }else {
	                	 encontrado=true;
	                	 indiceArreglo=indiceArreglo-1;
	                 } 
	    			
	    		
	    		}
	    		 registro=registroAux;
	    		
	   
	                 if (encontrado) 
		                System.out.println("El vehiculo fue retirado corectamente:" + placaaBuscar);
	                 
	    	
	    	
	    	}
	    }
	  
	    
	    
	    
	    
	   
	    static void listarVehiculos()
	    {

	    	if (indiceArreglo == 0)
	    		System.out.println("No hay Contactos registrados en la Agenda.");
	    	
	    	for (int i = 0; i < indiceArreglo; i++) {
			registro[i].mostrarvehiculosPunto7();
 				     
                       
	    	}       	
	    	
	    }
	
	
	
	

}
