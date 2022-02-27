package Taller3;

public class Punto2 {

	
		  public static void main (String args [])
		    {
			  int n = 10;
		        int j,i;
		        
		        i=1;
		        
		    while (i<=n){
		        	 		
		       j=1;
		        		
		        while (j<=n) {
		        		
		           if (j>n-i){
		        	   
		        	   System.out.print("*");
		           }
		           else {
		               System.out.print(" ");
		            }
		            
		            if (j==n) {
		                System.out.println("");
		            }
	                 j=j+1;
		        }       
		          i=i+1;
		    }
		                
	       }
}
		
		
		
		
		
