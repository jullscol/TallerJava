package Talle2;

public class peliculasPunto4 extends DatosPunto4{
	
	
	 String genero;
	    int codigo;

	    public peliculasPunto4( int codigo,String nombrePelicula, String genero)
  
	    {
	    	super(nombrePelicula);
	       
	        this.genero = genero;
	        this.codigo = codigo;
	       
	        
	      
	    }
	    
	    
	    public String getNombrePelicula() {
	        return nombrePelicula;
	    }

	    public void setNombrePelicula(String nombrePelicula) {
	        this.nombrePelicula = nombrePelicula;
	    }
	    

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }
	    
	    public  int getcodigo() {
	        return codigo;
	    }

	    public void setcodigo( int codigo) {
	        this.codigo = codigo;
	    }

	    
	    
	    void mostrarDatosPunto4(){
	        System.out.println(this.getNombrePelicula());
	        System.out.println(this.getGenero());
	        System.out.println(this.getcodigo());      
	    }

	  
	   
	    
	    
}
