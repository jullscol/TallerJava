package Talle2;

import java.util.Scanner;


	
public class PrincipalPunto6 {

	
		

			 static Scanner sc = new Scanner(System.in);
			    static NombrePropietarioPunto6 registro[] = new NombrePropietarioPunto6[6];
			    static int opcion = 0;
			    static int indiceArreglo = 0;
			   
			    public static void main(String[] args) {

			        do{
			        	mostrarMenu();
			        	
			        	while(pedirOpcion() == false);
			        	
			        	switch(opcion)
			        	{
			        	case 1:
			        		IngresoMoto();
			        		break;
			        	case 2:
			        		buscarMoto();
			        		break;
			        	case 3:
			        	    SalidaMoto();
			        		break;
			        	case 4:
			        		listarMotos();
			        		break;
			        	case 5:
			        		System.out.println("FIN DEL PROGRAMA");
			        	}
			        }while(opcion != 5);

			    }//Fin del metodo main()
			   
			    static void mostrarMenu()
			    {
			    	System.out.println("\n");
			    	System.out.println(" 1 - Ingresar Moto");
			        System.out.println(" 2 - Buscar Moto");
			        System.out.println(" 3 - Salida de Moto");
			        System.out.println(" 4 - Mostrar las motos en taller");
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
			   
			    static void IngresoMoto()
			    {
			    	if (indiceArreglo == 5)
			    		System.out.println("\n El taller esta lleno");
			    	else
			    	{
			    		System.out.print("\n Digite la letra M para Ingresar una moto nueva: ");
						char opcion = sc.nextLine().toUpperCase().charAt(0);
						
						switch (opcion)
						{
						
						case 'M':
							registro[indiceArreglo] = pedirDatosIngreso();
							indiceArreglo++;
							break;
						default:
							System.out.println("No se reconoce la opcion indicada: " + opcion);
						}
			    	}
			    }
			   
			    static MotosPunto6 pedirDatosIngreso()
			    {
			    	System.out.print("\nIntroduzca placa Moto: ");
					int placa = sc.nextInt();sc.nextLine();
					System.out.print("Introduzca Nombre Propietario: ");
					String nombre = sc.nextLine();
					System.out.print("Introduzca marca de la  moto: ");
					String marca = sc.nextLine();
					System.out.print("Introduzca  cilindraje moto: ");
					String cilindraje = sc.nextLine();
					System.out.print("Introduzca modelo de la moto: ");
					String modelo = sc.nextLine();
					
					
					return new MotosPunto6(placa, nombre , marca, modelo,cilindraje);
			    }
			   
			    static void buscarMoto()
			    {
			    	if (indiceArreglo == 0)
			    		System.out.println("No hay motos en el taller");
			    	else
			    	{
			    		boolean encontrado = false;
			    		
			    		System.out.print("\nIntroduzca la placa de la moto a buscar: ");
			    		int placaaBuscar = sc.nextInt(); sc.nextLine();
			    		
			    		for (int i = 0; i < indiceArreglo; i++)
			    		{
			    			if (registro[i].getPlaca() == placaaBuscar)  {
			    				registro[i].mostrarnombrePropietarioPunto6();
			    				      encontrado = true;
			                                break;
			                         }
			    		
			    		}
			   
			                 if (encontrado == false) 
				                System.out.println("No se encontro ningun moto con esa placa:" + placaaBuscar);
			                 
			    	
			    	
			    	}
			    }
			    static void SalidaMoto()

			    {
			    	if (indiceArreglo == 0)
			    		System.out.println("No hay motos para retirar.");
			    	else
			    	{
			    		boolean encontrado = false;
			    		
			    		System.out.print("\nIntroduzca la placa de la moto que va a salir: ");
			    		int placaaBuscar = sc.nextInt(); sc.nextLine();
			    		
			    		NombrePropietarioPunto6 registroAux[] = new NombrePropietarioPunto6[6];
			    		
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
				                System.out.println("La moto a salido del taller:" + placaaBuscar);
			                 
			    	
			    	
			    	}
			    }
			  
			    			      
			    			   
			    static void listarMotos()
			    {

			    	if (indiceArreglo == 0)
			    		System.out.println("No hay Motos en el taller.");
			    	
			    	for (int i = 0; i < indiceArreglo; i++) {
					registro[i]. mostrarnombrePropietarioPunto6();
		    				     
		                          
			    	}       	
			    	
			    }
			    	
		
		

	}


