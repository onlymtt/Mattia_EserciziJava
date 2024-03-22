package area_triangolo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AreaDb implements AreaInterface{
	private Connection connection;
	public Statement stmt;
	
	double[] baseAltezza = new double[2];
	
	public AreaDb() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/experis", "root", "Zamboni4ever");
		this.stmt = connection.createStatement();
	}

	@Override
	public double calcolaArea() {
		ResultSet rs;
		System.out.println("Area calcolata dal DB");
		try {
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

/*public class Main {
    public static void main(String[] args) throws SQLException {
        
        Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/experis", "homestead", "secret");
        
        System.out.println("DB Connesso");
        
        Statement operazione = connessione.createStatement();
        System.out.println("Nuova operazione su DB creata");
        
        String query = "select * from products";
        
        ResultSet resultSet = operazione.executeQuery(query);
        
        while(resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        
        operazione.close();
        
        connessione.close();
    }
}*/