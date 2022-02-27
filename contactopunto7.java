package Talle2;

public abstract class contactopunto7 {

	String nombrePaciente;
	   

    public contactopunto7(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
       
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) 
    {
        this.nombrePaciente = nombrePaciente;
    }

       
abstract void mostrarcontactopunto7();


	
	
	
}
