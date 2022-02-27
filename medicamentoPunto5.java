package Talle2;

abstract public class medicamentoPunto5 {

	
	

	    String medicamento;
	   

	    public medicamentoPunto5(String medicamento) {
	        this.medicamento = medicamento;
	       
	    }

	    public String getMedicamento() {
	        return medicamento;
	    }

	    public void setMedicamento(String medicamento) 
	    {
	        this.medicamento = medicamento;
	    }

	       
	   abstract void mostrarmedicamentoPunto5();

	protected abstract int getcodigo();

	
	       
	   

}
