package Talle2;

public class componentePunto5 extends medicamentoPunto5{

	
	    float precio;
        int codigo;
	    public componentePunto5(float precio, int codigo, String medicamento)
	    
	    
	    {
	        super(medicamento);
	        this.precio = precio;
	        this.codigo = codigo;
	       
	      
	    }

	    public String getMedicamento() {
	        return medicamento;
	    }

	    public void setMedicamento(String nombreCompleto) {
	        this.medicamento = nombreCompleto;
	    }
	   
	    public  float getprecio() {
	        return precio;
	    }

	    public void setprecio( float precio) {
	        this.precio = precio;
	    }

	    
	    public int getcodigo() {
	        return codigo;
	    }

	    public void setcodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    
	    
	    void mostrarmedicamentoPunto5(){
	        System.out.println(this.getMedicamento());
	        System.out.println(this.getprecio());
	        System.out.println(this.getcodigo());
	       
	       
	    }

		
			
		}

		
	   
	
	
	
	

