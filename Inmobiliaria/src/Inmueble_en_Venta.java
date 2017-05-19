
public class Inmueble_en_Venta extends Inmueble{

	protected double precioVenta;
	
	@Override
	public double getTipoIva(){
		return 10;
	}
	
	@Override
	public double getPrecio(){
		return precioVenta;
	}
	
	
	
	public Inmueble_en_Venta(){
		
	}
	public Inmueble_en_Venta(Inmueble_en_Venta inm){
		
		super(inm);
	
		precioVenta=inm.precioVenta;
	}
	
	public Inmueble_en_Venta(double superficie,boolean edificable,String direccion,double precioVenta,String propietario){
		super(superficie,edificable,direccion,propietario);
	    this.precioVenta=precioVenta;
	}
	
	
	
	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		
		
		return super.toString()	+"\nInmueble en venta"+"\nprecioVenta: "+precioVenta;
		
	
	}
	@Override
	public void setPrecio(double p){
		 precioVenta=p;
		
		
	}
	
}
