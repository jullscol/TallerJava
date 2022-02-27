package Taller3;

public abstract class NombrepropietarioPunto7 {

	 String nombrePropietario;
	   

	    
	    public NombrepropietarioPunto7(String nombrePropietario) {
			// TODO Auto-generated constructor stub
		}

		public String getNombrePropietario() {
	        return nombrePropietario;
	    }

	    public void setNombrePropietario(String nombrePropietario) 
	    {
	        this.nombrePropietario = nombrePropietario;
	    }

	       
	   abstract void mostrarvehiculosPunto7();

	protected abstract int getPlaca();


	
	
	
	
	
	
	
}
