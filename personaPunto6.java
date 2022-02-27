package Taller3;

public class personaPunto6 extends ContactoPunto6{
	
    String organizacion, telefonoCelular;
    int cedula;

    public personaPunto6(int cedula, String telefonoCelular, String nombreCompleto, String organizacion)
    
    
    {
        super(nombreCompleto);
        this.cedula = cedula;
        this.telefonoCelular = telefonoCelular;
        this.organizacion = organizacion;
       
      
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

    
    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }


   
    
    
    
    void mostrarcontactoPunto6(){
        System.out.println(this.getNombreCompleto());
        System.out.println(this.getOrganizacion());
        System.out.println(this.getTelefonoCelular());
        System.out.println(this.getcedula());
       
    }

	
   
}