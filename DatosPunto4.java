package Talle2;

abstract public class DatosPunto4 {
	
	
	 String nombrePelicula;
	   

	    public DatosPunto4(String nombrePelicula) {
	        this.nombrePelicula = nombrePelicula;
	       
	    }

	    public String getNombrePelicula() {
	        return nombrePelicula;
	    }

	    public void setNombrePelicula(String nombrePelicula) 
	    {
	        this.nombrePelicula = nombrePelicula;
	    }

	       
	abstract void mostrarDatosPunto4();

	
	protected abstract int getcodigo();

	
	
	

}
