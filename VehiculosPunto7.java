package Taller3;

public class VehiculosPunto7 extends NombrepropietarioPunto7 {


    String marca,cedula, telefonoCelular;
    int placa;

    public VehiculosPunto7(String marca, String telefonoCelular, String nombrePropietario, int placa,String cedula)
    
    
    
    
    
    {
        super(nombrePropietario);
        this.cedula = cedula;
        this.telefonoCelular = telefonoCelular;
        this.placa = placa;
        this.marca = marca;
      
    }

   

	



	public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
   
    public  String getcedula() {
        return cedula;
    }

    public void setcedula( String cedula) {
        this.cedula = cedula;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

        
        public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }


   
    
    
    
    void mostrarvehiculosPunto7(){
    	
        System.out.println(this.getNombrePropietario());
        System.out.println(this.getMarca());
        System.out.println(this.getTelefonoCelular());
        System.out.println(this.getcedula());
        System.out.println(this.getPlaca());
    }

	
   

	
	
}
