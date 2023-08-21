package com.ts;

public class Trade {
	
	private String ticker;
	private double price;
	private int qty;
	private int totalCost;
	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trade(String ticker, double price, int qty, int totalCost) {
		super();
		this.ticker = ticker;
		this.price = price;
		this.qty = qty;
		this.totalCost = totalCost;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	
}
