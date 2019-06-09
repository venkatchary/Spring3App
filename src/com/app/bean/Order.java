package com.app.bean;

public class Order {
	private int ordId;
	private String ordName;
	private double amount;
	public Order() {
		super();
	}
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getOrdName() {
		return ordName;
	}
	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordName=" + ordName + ", amount=" + amount + "]";
	}
	

}
