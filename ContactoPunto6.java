package Taller3;


	abstract public class ContactoPunto6 {

	    String nombreCompleto;
	   

	    public ContactoPunto6(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	       
	    }

	    public String getNombreCompleto() {
	        return nombreCompleto;
	    }

	    public void setNombreCompleto(String nombreCompleto) 
	    {
	        this.nombreCompleto = nombreCompleto;
	    }

	       
	   abstract void mostrarcontactoPunto6();

	protected abstract int getcedula();
	       
	   }

	
