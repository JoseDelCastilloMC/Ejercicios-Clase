

public abstract class Inmueble implements ConPropietario {

	protected double superficie;
	protected boolean edificable;
	protected String direccion;
	protected String propietario;
	
	public Inmueble(){
	
	}
	public Inmueble(double superficie,boolean edificable,String direccion,String propietario){
	    this.superficie=superficie;
		this.edificable=edificable;
		this.direccion=direccion;
		this.propietario=propietario;
	}
	
	public Inmueble(Inmueble inm){
		superficie=inm.superficie;
		edificable=inm.edificable;
		direccion=inm.direccion;
		propietario=inm.propietario;
		
		
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public boolean isEdificable() {
		return edificable;
	}
	public void setEdificable(boolean edificable) {
		this.edificable = edificable;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
	@Override
	public String toString() {
		return "Inmueble\n"
	    + "Superficie: "+superficie 
	    +"\nEdificable: "+(edificable ?  "Si" : "NO")
	    + "\nDirección: "+direccion
	    +"\nPropietario: "+propietario;
	
	}	
	
	
	public abstract double getTipoIva();
	
	public abstract double getPrecio();
	
	public double getPrecioTotal(){
		return getTipoIva()*getPrecio()/100+getPrecio();
	}
	
	public abstract void setPrecio(double p);
	
	
	
	
	
	
	
	
	
	
	
	
	
}