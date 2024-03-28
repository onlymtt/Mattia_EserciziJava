package area_triangolo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Classe per effettuare la query al db e calcolare l'area coi valori ottenuti*/
public class AreaDb implements AreaInterface{
	private Connection connection;
	private Statement stmt;
	
	double[] baseAltezza = new double[2];
	
	/**
	 * Costruttore di AreaDb
	 * @throws SQLException eccezione di SQL*/
	public AreaDb() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/experis", "root", "Zamboni4ever");
		
	}

	@Override
	/**
	 * metodo per eseguire la query, salvare i valori in un array e calcolare l'area
	 * @return ritorna l'area come double o 0 se il try catch fallisce*/
	public double calcolaArea() {
		ResultSet rs;
		
		System.out.println("Area calcolata dal DB");
		try {
			this.stmt = connection.createStatement();
			rs = this.stmt.executeQuery("SELECT id, base, altezza FROM triangoli");
			
			while (rs.next()) {
				baseAltezza[0] = rs.getDouble("base");
				baseAltezza[1] = rs.getDouble("altezza");
			}
			return (baseAltezza[0] * baseAltezza[1]) / 2;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}
}