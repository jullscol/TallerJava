package Talle2;

import java.util.Scanner;



public class principalPunto7 {
	
	
	static Scanner sc = new Scanner(System.in);
    static contactopunto7 pacientes[] = new contactopunto7[5];
    static int opcion = 0;
    static int indiceArreglo = 0;
	
	
	public static void main(String[] args) {
		

        do{
        	mostrarMenu();
        	
        	while(pedirOpcion() == false);
        	
        	switch(opcion)
        	{
        	case 1:
        		nuevoPaciente();
        		break;
        	
        	
        	case 2:
        		System.out.println("FIN DEL PROGRAMA");
        	}
        }while(opcion != 3);

    }
   
    static void mostrarMenu()
    {
    	System.out.println("\n");
    	System.out.println(" Elija Opcion");
    	System.out.println(" 1 - Agregar paciente");
        System.out.println(" 2 - Salir\n");
    }
   
    static boolean pedirOpcion()
    {
    	try
    	{
    		System.out.print("\nIntroduzca opcion: ");
    		opcion = sc.nextInt(); sc.nextLine();
    		if (opcion >= 1 && opcion <= 2)
    			return true;
    		else
    		{
    			System.out.println("Error. Solo se admite valor entre 1 y 2.");
    			return false;
    		}
    	}
    	catch(Exception e)
    	{
    		sc.nextLine();
    		System.out.println("Error. Introduzca solo numeros, entre 1 y 2.");
    		return false;
    	}
    }
    
    static void nuevoPaciente()
    {
    	if (indiceArreglo == 5)
    		System.out.println("\nEstan llenos lo spacientes");
    	else
    	{
    		System.out.print("\n Digita la letra P para agregar un nuevo paciente: ");
			char opcion = sc.nextLine().toUpperCase().charAt(0);
			
			switch (opcion)
			{
			
			case 'P':
				pacientes[indiceArreglo] = pedirDatosPaciente();
				indiceArreglo++;
				break;
			default:
				System.out.println("No se reconoce la opcion indicada: " + opcion);
			}
    	}
    }
   
    static personaPunto7 pedirDatosPaciente()
    {
    
    
    	System.out.print("Introduzca Nombre del paciente: ");
		String nombre = sc.nextLine();  	
    	System.out.print("\nIntroduzca peso del paciente: ");
		int peso = sc.nextInt();
    	System.out.print("\nIntroduzca estatura del paciente: ");
		float estatura = sc.nextFloat();sc.nextLine();
		
	
		
		float imc = peso/(estatura*estatura);
		
		 System.out.print(imc);
			
		if (imc < 18.5) 
		{
		
	    System.out.print("\nusted tiene bajo peso ");
			
		}

		if (imc >= 18.5 & imc<25) 
		{
		
	    System.out.print("\nUsted esta dentro del peso normal");
			
		}
		
		if (imc >= 25 & imc < 30) 
		{
		
	    System.out.print("\nUsted tiene sobre peso ");
			
		}
		
		if (imc > 30) 
		{
		
	    System.out.print("\nUsted tiene obecidad ");
			
		}
		
		
		return new personaPunto7(estatura, peso, nombre);
		
    
    }
    
	
   
    
}	
		
		
		
		
	


