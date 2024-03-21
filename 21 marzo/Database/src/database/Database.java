package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import models.Order;
/**
 * Classe per gestire la connessione al db*/
public class Database {

	private Connection connection;
	private Statement stmt;
	ArrayList<Order> orders = new ArrayList<>();
	
	/**
	 * Costruttore della classe Database
	 * @throws SQLException eccezione sql*/
	public Database() throws SQLException{
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/experis", "root", "Zamboni4ever");
		this.stmt = connection.createStatement();
	
	}
	
	/**
	 * Metodo per connettersi al db ed effettuare query
	 * @throws SQLException eccezione sql*/
	public void test() throws SQLException {
		//int riga = this.stmt.executeUpdate("INSERT INTO orders (order_number, today, quantity, total_price, order_state)\r\n"
			//	+ "VALUES (\"CD12345678\", now(), 18, 12.34, \"IN ATTESA\");");
		ResultSet rs = this.stmt.executeQuery("SELECT order_number, today, quantity, total_price FROM orders");
		
		
		//int riga = this.stmt.executeUpdate("UPDATE orders" + " SET quantity = 20, total_price= 15.59" + " WHERE id=2");
		//System.out.println("Numero di righe modificate: " + riga);
		
		
		while (rs.next()) {
			orders.add(new Order(rs.getString("order_number"), 
								 rs.getString("today"), 
								 rs.getInt("quantity"), 
								 rs.getDouble("total_price")));
		}
		
		Iterator<Order> it = orders.iterator();
		System.out.println("Lista ordini\n");
		
		while(it.hasNext()) {
			Order order = it.next();
			
			System.out.println(order.toString() + "\n");
		}
		
	}
}
