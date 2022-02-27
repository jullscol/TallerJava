package Taller3;

import java.util.Scanner;

public class PrincipalPunto8 {

	 static Scanner sc = new Scanner(System.in);
	    static ContactosPunto8 agenda[] = new ContactosPunto8[8];
	    static int opcion = 0;
	    static int indiceArreglo = 0;
	   
	    public static void main(String[] args) {

	        do{
	        	mostrarMenu();
	        	
	        	while(pedirOpcion() == false);
	        	
	        	switch(opcion)
	        	{
	        	case 1:
	        		nuevoAlumno();
	        		break;
	        	case 2:
	        		buscarAlumno();
	        		break;
	        	        	
	        	case 4:
	        		System.out.println("FIN DEL PROGRAMA");
	        	}
	        }while(opcion != 3);

	    }
	   
	    static void mostrarMenu()
	    {
	    	System.out.println("\n");
	    	System.out.println(" 1 - Ingresar alumno");
	        System.out.println(" 2 - Buscar Alumno ");
	       	System.out.println(" 3 - Salir\n");
	    }
	   
	    static boolean pedirOpcion()
	    {
	    	try
	    	{
	    		System.out.print("\nIntroduzca opcion: ");
	    		opcion = sc.nextInt(); sc.nextLine();
	    		if (opcion >= 1 && opcion <= 3)
	    			return true; 		else
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
	   
	    static void nuevoAlumno()
	    {
	    	if (indiceArreglo == 3)
	    		System.out.println("\nLa Agenda esta llena. No caben nuevos contactos");
	    	else
	    	{
	    		System.out.print("\n Digite la letra P para agregar un nuevo contacto: ");
				char opcion = sc.nextLine().toUpperCase().charAt(0);
				
				switch (opcion)
				{
				
				case 'P':
					agenda[indiceArreglo] = pedirDatosAlumno();
					indiceArreglo++;
					break;
				default:
					System.out.println("No se reconoce la opcion indicada: " + opcion);
				}
	    	}
	    }
	   
	    static PersonaPunto8 pedirDatosAlumno()
	    {
	    	System.out.print("\nIntroduzca cedula: ");
			int cedula = sc.nextInt();sc.nextLine();
			System.out.print("Introduzca Nombre del alumno: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca la nota del alumno: ");
			float nota = sc.nextFloat();
			System.out.print("Introduzca numero celular: ");
			String telefonoCelular = sc.nextLine();
			
			return new PersonaPunto8(cedula, nombre , nota, telefonoCelular);
	    }
	   
	   
	    static void buscarAlumno()
	    {
	    	if (indiceArreglo == 0)
	    		System.out.println("No hay Alumnos registrados.");
	    	else
	    	{
	    		
	    		
	    		System.out.print("\nIntroduzca la cedula del Alumno a buscar: ");
	    		int cedulaaBuscar = sc.nextInt(); sc.nextLine();
	    		
	    		for (int i = 0; i < indiceArreglo; i++)
	    		{
	    			if (agenda[i].getcedula() == cedulaaBuscar)  {
}
	    		      
	    	          			
	    	  	    		
	    		}     
	    		    	    	
	    	}
	    }

}
