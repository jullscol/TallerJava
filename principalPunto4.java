package Talle2;

import java.util.Scanner;


public class principalPunto4 {
	

	
	static Scanner sc = new Scanner(System.in);
    static DatosPunto4 peliculas[] = new DatosPunto4[4];
    static int opcion = 0;
    static int indiceArreglo = 0;
   
    public static void main(String[] args) {

        do{
        	mostrarMenu();
        	
        	while(pedirOpcion() == false);
        	
        	switch(opcion)
        	{
        	case 1:
        		nuevaPelicula();
        		break;
        	
        	case 2:
        		Alquilar();
        		break;
        	case 3:
        		Consultar();
        		break;
        	case 4:
        		Recibir();
        		break;
        	
        	case 5:
        		System.out.println("FIN DEL PROGRAMA");
        	}
        }while(opcion != 2);

    }
   
    static void mostrarMenu()
    {
    	System.out.println("\n");
    	System.out.println(" Elija Opcion");
    	System.out.println(" 1 - Agregar pelicula Pelicula");
    	System.out.println(" 2 - Alquilar pelicula");
        System.out.println(" 3 - Consultar si la pelicula esta disponible");
        System.out.println(" 4 - Recibir Pelicula");
        System.out.println(" 5 - Salir\n");
    }
   
    static boolean pedirOpcion()
    {
    	try
    	{
    		System.out.print("\nIntroduzca opcion: ");
    		opcion = sc.nextInt(); sc.nextLine();
    		if (opcion >= 1 && opcion <= 5)
    			return true;
    		else
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
    
    static void nuevaPelicula()
    {
    	if (indiceArreglo == 4)
    		System.out.println("\nEsta lleno. No caben nuevas peliculas");
    	else
    	{
    		System.out.print("\n Digita la letra P para agregar una nueva pelicula: ");
			char opcion = sc.nextLine().toUpperCase().charAt(0);
			
			switch (opcion)
			{
			
			case 'P':
				peliculas[indiceArreglo] = pedirDatosPelicula();
				indiceArreglo++;
				break;
			default:
				System.out.println("No se reconoce la opcion indicada: " + opcion);
			}
    	}
    }
   
    static peliculasPunto4 pedirDatosPelicula()
    {
    	System.out.print("\nIntroduzca codigo pelicula: ");
		int codigo = sc.nextInt();
    	System.out.print("\nIntroduzca genero: ");
		String genero = sc.nextLine();sc.nextLine();
		System.out.print("Introduzca Nombre: ");
		String nombre = sc.nextLine();
		
		
		return new peliculasPunto4(codigo, genero, nombre);
    }
   
   
    
    
  
    	
    	 static void Alquilar()

 	    {
 	    	if (indiceArreglo == 0)
 	    		System.out.println("No hay Peliculas");
 	    	else
 	    	{
 	    		boolean encontrado = false;
 	    		
 	    		System.out.print("\nIntroduzca el codigo de la pelicula que dese alquilar: ");
 	    		int codigoPelicula = sc.nextInt();sc.nextLine();
 	    		
 	    		peliculasPunto4 peliculasAux[] = new peliculasPunto4[4];
 	    		
 	    		for (int i = 0; i < indiceArreglo; i++)
 	    		{
 	    			if (!(peliculas[i].getcodigo() ==  codigoPelicula))  {
 	    			
 	    				peliculasAux[i] = (peliculasPunto4) peliculas[i];
 	    				               
 	                 }else {
 	                	 encontrado=true;
 	                	 indiceArreglo=indiceArreglo-1;
 	                 } 
 	    			
 	    		
 	    		}
 	    		 peliculas=peliculasAux;
 	    		
 	   
 	                 if (encontrado) 
 	                 
 		                System.out.println("Registro alquilado correctamente:" +  codigoPelicula);
 	                 
 	    	
 	    	
 	    	         }
 	    }
 	  
    	 static void Consultar()
 	    {

 	    	if (indiceArreglo == 0)
 	    		System.out.println("No hay peliculas.");
 	    	
 	    	for (int i = 0; i < indiceArreglo; i++) {
 			peliculas[i].mostrarDatosPunto4();
     				     
                           
 	    	}       	
 	    	
 	    }
    
    
    	 static void Recibir() 
    	 {
    		
    		 boolean rec = true;
    	    	
    	    		System.out.print("\n Digita la letra R para recibir pelicula: ");
    				char opcion = sc.nextLine().toUpperCase().charAt(0);
    				
    				switch (opcion)
    				{
    				
    				case 'R':
    					peliculas[indiceArreglo] = pedirDatosPelicula();
    					indiceArreglo++;
    					break;
    				default:
    					System.out.println("No se reconoce la opcion indicada: " + opcion);
    					 
    				}
    	    		
    				System.out.println("La pelicula se encuentra en buen estado? ");
    	 
    				 if (rec == true) 
			                System.out.println("Escribir anotacion:" );
    				
    				
    				
    	 }
    	    
    	 
    	 
    	 
    	 
    	 
  }
