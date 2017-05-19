


public class Inmobiliaria implements ConPropietario {
	
	
	private Inmueble []inmuebles=new Inmueble[500];
	
		
	private int siguientePosicion=0;
	private String propietario;
	
	public Inmobiliaria(String propietario){
		this.propietario = propietario;
	}
	
	public void add(Inmueble inm){
	inmuebles[siguientePosicion]=inm;
	siguientePosicion++;
}

	public Inmueble get(int i){
		return inmuebles[i];
	}

	public int size(){
		return siguientePosicion;
	}
	
	public boolean estaLleno(){
		return siguientePosicion==500;
	}
	
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	@Override
	public String toString() {
		
		String s="El propietario es: "+propietario+"el numero de inmuebles en esta inmobiliaria es "+siguientePosicion+" y son: ";
			for (int i=0;i<siguientePosicion;i++){
			s=s+inmuebles[i].toString();
			}
			return s;
		
	
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	

