package ui;

import java.util.ArrayList;
import java.util.Scanner;

import dao.DAOAvion;
import datos.Db;
import modelo.Avion;

public class Principal {

	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Db.init();
		
		boolean continuar=true;
		while(continuar){
			imprimirMenu();
			System.out.println("\nIntroduzca la opcion");
			String s=teclado.nextLine();
			s=s.trim(); // Elimina los espacios, tabuladores y saltos de linea al principio y al final de la cadena
			if(s.length()>0){
				char o=s.charAt(0); // obtiene el primer caracter de la cadena
				switch(o){
				case '1':
					insertarAvion();
					break;
				case '2':
					buscarAvion();
					break;
				case '3':
					modificarAvion();
					break;
				case '4':
					borrarAvion();
					break;
				case '5':
					listarAvion();
					break;
				case '6':
					System.out.println("Adios. Gracias por utilizar nuestra aplicación");
					continuar=false;
					Db.cerrar();
					break;
				default:
					System.out.println("Introduzca una opcion valida por favor.");
				}
			}
		}
		
	}
	
	private static void imprimirMenu(){
		System.out.println("MENU");
		System.out.println();
		System.out.println("1.- InsertarAvion");
		System.out.println("2.- BuscarAvion");
		System.out.println("3.- Modificar avion");
		System.out.println("4.- Borrar avion");
		System.out.println("5.- Listar todos los aviones");
		System.out.println();
		System.out.println("6.- Salir");
	}
	
	private static void insertarAvion(){
		
		System.out.print("Id Avion.:");
		int idavion=teclado.nextInt();
		teclado.nextLine();
		System.out.print("Descripcion:");
		String descripcion=teclado.nextLine();
		teclado.nextLine();
		System.out.print("Peso:");
		double peso=teclado.nextDouble();
		teclado.nextLine();
		
		Avion p=new Avion(idavion,descripcion,peso);
		DAOAvion dao=new DAOAvion();
		if(!dao.create(p)){
			System.out.println("Fallo en la insercion. ¿El avion ya está insertado?");
		}
	}
	
	private static void buscarAvion(){
		System.out.print("Id Avion:");
		int idavion=teclado.nextInt();
		teclado.nextLine();
		
		DAOAvion dao=new DAOAvion();
		Avion p=dao.read(idavion);
		if(p!=null){
			System.out.println(p);
		}
		else{
			System.out.println("El Id del Avion introducido no consta en la base de datos.");
		}
	}

	private static void modificarAvion(){
		System.out.print("Id Avion:");
		int idavion=teclado.nextInt();
		teclado.nextLine();
		System.out.print("Nueva descripcion:");
		String descripcion=teclado.nextLine();
		teclado.nextLine();
		System.out.print("Nueva peso:");
		double peso=teclado.nextDouble();
		teclado.nextLine();
		
		Avion p=new Avion(idavion,descripcion,peso);
		DAOAvion dao=new DAOAvion();
		if(!dao.update(p)){
			System.out.println("Fallo en la modificacion");
		}
	}
	
	private static void listarAvion(){
		System.out.println("LISTADO DE TODOS LOS AVIONES");
		System.out.println();
		DAOAvion dao=new DAOAvion();
		ArrayList<Avion> a=dao.listar();
		
		for(Avion p : a){
			System.out.println(p);
		}
	}
	
	
	public static void borrarAvion(){
		System.out.print("IdAvion: ");
		int idavion = teclado.nextInt();
		teclado.nextLine();
		DAOAvion dao=new DAOAvion();
		Avion p=new Avion(idavion,null,0);
		if(!dao.delete(p)){
			System.out.println("Fallo al borrar el avion.");
		}
	}
}
