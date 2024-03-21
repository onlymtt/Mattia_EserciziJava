package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private Connection connection;
	private Statement stmt;
	
	public Database() throws SQLException{
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_database", "root", "Zamboni4ever");
		this.stmt = connection.createStatement();
	
	}
	
	public void test() throws SQLException {
		ResultSet rs = this.stmt.executeQuery("SELECT * FROM orders");
		while (rs.next()) {
			System.out.println(rs.getString("order_number"));
			
		}
	}
	
	

}
