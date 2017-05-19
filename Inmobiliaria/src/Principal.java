
public class Principal {

	public static void main(String[] args) {
		Inmueble_en_Venta v1=new Inmueble_en_Venta(150,true,"calle Malva nº1",125000,"Soledad huete");
		Inmueble_en_Venta v2=new Inmueble_en_Venta(300,true,"calle Azahar nº17",175000,"luis garcia");
		Inmueble_en_Venta v3=new Inmueble_en_Venta(300,false,"calle Colibri nº7",185000,"maria ordoñez");
		
		Inmueble_en_Alquiler a1= new Inmueble_en_Alquiler(120,false,"calle Colibri nº2",485,"luis gomez");
		Inmueble_en_Alquiler a2= new Inmueble_en_Alquiler(90,false,"calle morin nº21",385,"Mario bermudez");
		Inmueble_en_Alquiler a3= new Inmueble_en_Alquiler(18,false,"calle fabli nº2",585,"jacinto perez");
		
		Inmobiliaria Inmob=new Inmobiliaria("PepeJuan");
		Inmob.add(v1);
		Inmob.add(v2);
		Inmob.add(v3);
		Inmob.add(a1);
		Inmob.add(a2);
		Inmob.add(a3);
		
		System.out.println(Inmob);
		
		ConPropietario cp1 = Inmob;
		ConPropietario cp2= v1;
		
		cp1.setPropietario("marian ordoñez");
		cp2.setPropietario("carmen garcia");
		
		System.out.println(Inmob);
		
		for(int i=0;i<Inmob.size();i++){
			Inmueble inm=Inmob.get(i);
			double p=inm.getPrecio()*1.1;
			inm.setPrecio(p);
			
		}
		System.out.println("los datos con el iva ya incluido"+Inmob);
	}

}
