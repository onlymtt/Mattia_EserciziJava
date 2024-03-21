package models;

import java.sql.Date;
/**
 * Classe per costruire l'oggetto order*/
public class Order {
	private int id;
	private String orderNumber;
	private String today;
	private int quantity;
	private double totalPrice;
	
	/**
	 * Costruttore di Order
	 * 
	 * @param orderNumber numero dell'ordine
	 * @param today data di oggi
	 * @param quantity quantità dell'ordine
	 * @param totalPrice prezzo totale*/
	public Order(String orderNumber, String today, int quantity, double totalPrice) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.today = today;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
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
	 * @param orderNumber numero dell'ordine*/
	public void setOrderNumber(String orderNumber) {
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
	
	public void update(String campoDb, String newValue) {
		
	}
	
	
	
	
	
}
