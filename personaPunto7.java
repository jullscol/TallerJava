package Talle2;

public class personaPunto7 extends contactopunto7 {

	
		int peso;
	    float estatura;
	    
	    public personaPunto7( float estatura, int peso, String nombrePaciente)
 
	    {
	    	super(nombrePaciente);
	       
	        this.peso = peso;
	        this.estatura = estatura;
	       
	        
	      
	    }
	    
	    
	    public String getNombrePaciente() {
	        return nombrePaciente;
	    }

	    public void setNombrePaciente(String nombrePaciente) {
	        this.nombrePaciente = nombrePaciente;
	    }
	    

	    public int getPeso() {
	        return peso;
	    }

	    public void setPeso(int peso) {
	        this.peso = peso;
	    }
	    
	    public  float getEstatura() {
	        return estatura;
	    }

	    public void setEstatura( float estatura) {
	        this.estatura = estatura;
	    }

	    
	    
	    void mostrarcontactopunto7(){
	        System.out.println(this.getNombrePaciente());
	        System.out.println(this.getPeso());
	        System.out.println(this.getEstatura());      
	    }

	  
	   
	
	
	
	
	
}
