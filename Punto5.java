package Taller4;

import java.util.Scanner;

public class Punto5 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	int filas = 10;
	int columnas = 10;
	int[][] resultadoTabla =new int[filas][columnas]; 
	
	for(int i=0;i<filas;i++)
	{
		for(int j=0;j<columnas;j++)
		{
			System.out.print((i+1)+"x"+(j+1)+" ");
			resultadoTabla[i][j] = (i+1)*(j+1); 
		}
		System.out.println("");
		
		
	}
	
	System.out.println("Escribe el dato de la fila");
	int datoFila= sc.nextInt();
	System.out.println("Escribe el dato de la columna");
	int datoColumna=sc.nextInt();
	
	System.out.print("Resultado: "+datoFila+"x"+datoColumna+"="+resultadoTabla[datoFila-1][datoColumna-1]);
	
	sc.close();
	}
	
	
}
