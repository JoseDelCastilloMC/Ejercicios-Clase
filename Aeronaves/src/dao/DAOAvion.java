package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import datos.Db;
import modelo.Avion;

public class DAOAvion {

	private Connection con=Db.getConexion();
	
	
	
	public boolean create(Avion p){
		
		String sql="insert into aviones (idavion,descripcion,peso) values (?,?,?)";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,p.getidAvion());
			ps.setString(2,p.getDescripcion());
			ps.setDouble(3,p.getPeso());
			ps.executeUpdate();
			ps.close();
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
		
	}
	
	public Avion read(int idavion){
		Avion p=null;
		
		String sql="select descripcion,peso from aviones where idavion=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,idavion);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				p=new Avion(rs.getInt("idavion"),rs.getString("descripcion"),rs.getDouble("peso"));
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return p;
	}
	
	public boolean update(Avion p){
		String sql="update aviones set"
				+ " descripcion=?"
				+ " peso=?"
				+ " where idavion=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,p.getDescripcion());
			ps.setDouble(2,p.getPeso());	
			ps.setInt(3,p.getidAvion());
			ps.executeUpdate();
			
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(Avion p){
		String sql="delete from aviones where idavion=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,p.getidAvion());
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Avion> listar(){
		ArrayList<Avion> aeronaves=new ArrayList<Avion>();
		
		String sql="select * from aviones order by descripcion";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Avion p=new Avion(rs.getInt("idavion"),rs.getString("descripcion"),rs.getDouble("peso"));
				aeronaves.add(p);
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return aeronaves;
	}
	
}
