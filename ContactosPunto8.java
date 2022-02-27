package Taller3;

public abstract class ContactosPunto8 {

	 String nombreCompleto;
	   

	    public ContactosPunto8(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	       
	    }

	    public String getNombreCompleto() {
	        return nombreCompleto;
	    }

	    public void setNombreCompleto(String nombreCompleto) 
	    {
	        this.nombreCompleto = nombreCompleto;
	    }

	       
	   abstract void mostrarcontactoPunto8();

	protected abstract int getcedula();

	protected abstract Float getNota();

	
	   }

	
	
	

