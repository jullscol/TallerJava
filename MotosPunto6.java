package Talle2;

public class MotosPunto6 extends NombrePropietarioPunto6{

	
	 String marca,modelo,cilindraje;
     int placa;
     
	    public MotosPunto6(int placa, String marca, String modelo, String cilindraje, String nombrePropietario)
	    
	    
	    {
	        super(nombrePropietario);
	        this.marca = marca;
	        this.modelo = modelo;
	        this.cilindraje = cilindraje;
	        this.placa = placa;
	      
	        
	               
	    }

	    public String getNombrePropietario() {
	        return nombrePropietario;
	    }

	    public void setNombrePropietario(String nombrePropietario) {
	        this.nombrePropietario = nombrePropietario;
	    }
	   
	    public  String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public  String getModelo() {
	        return modelo;
	    }

	    public void setMoldelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public  String getCilindraje() {
	        return cilindraje;
	    }

	    public void setCilindraje(String cilindraje) {
	        this.cilindraje = cilindraje;
	    }
   
	    
	    public int getPlaca() {
	        return placa;
	    }

	    public void setPlaca(int placa) {
	        this.placa = placa;
	    }

	    
	  	
		void mostrarnombrePropietarioPunto6() {
			
			 System.out.println(this.getNombrePropietario());
			 System.out.println(this.getCilindraje());
		        System.out.println(this.getMarca());
		        System.out.println(this.getModelo());
		        System.out.println(this.getPlaca());
		        
			
			
			
		}

}
	
	

