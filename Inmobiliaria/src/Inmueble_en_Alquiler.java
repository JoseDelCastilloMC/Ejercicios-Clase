public class Inmueble_en_Alquiler extends Inmueble {

	
	
	protected double precioAlquiler;
	
	@Override
	public double getTipoIva(){
		return 10;
	}
	
	@Override
	public double getPrecio(){
		return precioAlquiler;
	}
	
	public Inmueble_en_Alquiler(){
		
	}
	
	public Inmueble_en_Alquiler(Inmueble_en_Alquiler inm){
		
		super(inm);
	
		precioAlquiler=inm.precioAlquiler;
	}
	
	public Inmueble_en_Alquiler(double superficie,boolean edificable,String direccion,double precioAlquiler,String propietario){
		super(superficie,edificable,direccion,propietario);
	    this.precioAlquiler=precioAlquiler;
	}

	
	
	
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	@Override
	public String toString() {
		
		
		return super.toString()+"\nInmueble en "+"\nprecioAlquiler: "+precioAlquiler;
			
	
	}
	
	@Override
	public void setPrecio(double p){
		 precioAlquiler=p;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
