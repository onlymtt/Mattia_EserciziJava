package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import database.Database;
/**
 * Classe per costruire l'oggetto order*/
public class Order {
	private int id;
	private String orderNumber;
	private String today;
	private int quantity;
	private double totalPrice;
	
	private Connection connection;
	private Statement stmt;
	
	private Database db;
	
	/**
	 * Costruttore di Order
	 * 
	 * @param orderNumber numero dell'ordine
	 * @param today data di oggi
	 * @param quantity quantità dell'ordine
	 * @param totalPrice prezzo totale
	 * @throws SQLException */
	public Order(int id, String orderNumber, String today, int quantity, double totalPrice) throws SQLException {
		this.id = id;
		this.orderNumber = orderNumber;
		this.today = today;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		
		//this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/experis", "root", "Zamboni4ever");
		//this.stmt = connection.createStatement();
	}

	public Order(int id, String orderNumber, String today, int quantity, double totalPrice, Database db) throws SQLException {
		this.id = id;
		this.orderNumber = orderNumber;
		this.today = today;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.db = db;
		
	}
	/**
	 * Getter per l'id
	 * @return id ritorna l'id*/
	public int getId() {
		return id;
	}
	/**
	 * Setter per l'id
	 * @param id id dell'ordine*/
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter per il numero dell'ordine
	 * @return orderNumber */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Setter per il numero dell'ordine
	 * @param orderNumber numero dell'ordine
	 * @throws SQLException */
	public void setOrderNumber(String orderNumber) throws SQLException {
		this.orderNumber = orderNumber;
		update("order_number", this.orderNumber);
		
	}

	/**
	 * Getter per la data di oggi
	 * @return today data di oggi*/
	public String getToday() {
		return today;
	}
	/**
	 * Setter per la data
	 * @param today data di oggi*/
	public void setToday(String today) {
		this.today = today;
	}
	
	/**
	 * Getter per la quantità
	 * @return quantity quantità*/
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter per la quantità
	 * @param quantity quantità dell'ordine*/
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Getter per prezzo totale
	 * @return totalPrice prezzo totale*/
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * Setter per prezzo totale
	 * @param totalPrice prezzo totale*/
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", today=" + today + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + "]";
	}
	
	public void update(String campoDb, String newValue) throws SQLException {
		//int riga = this.db.stmt.executeUpdate(newValue);
	}
	
	
	
	
	
}
