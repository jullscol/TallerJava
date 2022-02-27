package Taller3;

public class PersonaPunto8 extends ContactosPunto8 {

	 String telefonoCelular;
	    int cedula;
	    float nota;

	    public PersonaPunto8(int cedula, String telefonoCelular, float nota, String nombreCompleto)
	    
	    
	    {
	        super(nombreCompleto);
	        this.cedula = cedula;
	        this.telefonoCelular = telefonoCelular;
	        this.nota = nota;
	       
	      
	    }

	    public String getNombreCompleto() {
	        return nombreCompleto;
	    }

	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	    }
	   
	    public  int getcedula() {
	        return cedula;
	    }

	    public void setcedula( int cedula) {
	        this.cedula = cedula;
	    }

	    
	    public Float getNota() {
	        return nota;
	    }

	    public void setNota(float nota) {
	        this.nota = nota;
	    }

	    public String getTelefonoCelular() {
	        return telefonoCelular;
	    }

	    public void setTelefonoCelular(String telefonoCelular) {
	        this.telefonoCelular = telefonoCelular;
	    }


	   
	    
	    
	    
	    void mostrarcontactoPunto8(){
	        System.out.println(this.getNombreCompleto());
	        System.out.println(this.getNota());
	        System.out.println(this.getTelefonoCelular());
	        System.out.println(this.getcedula());
	       
	    }

		
	
	
	
}
