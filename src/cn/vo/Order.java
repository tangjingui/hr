package cn.vo;

import java.util.Date;

public class Order {
	private String order_id;
	private String seller_id;
	private String buyer_id;
	private String seller_addres;
	private String buyer_addres;
	private String transaction_price;//交易价格。
	private Date transaction_date;//交易时间。
	private int transaction_mode;//交易状态。
	
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getSeller_addres() {
		return seller_addres;
	}
	public void setSeller_addres(String seller_addres) {
		this.seller_addres = seller_addres;
	}
	public String getBuyer_addres() {
		return buyer_addres;
	}
	public void setBuyer_addres(String buyer_addres) {
		this.buyer_addres = buyer_addres;
	}
	public String getTransaction_price() {
		return transaction_price;
	}
	public void setTransaction_price(String transaction_price) {
		this.transaction_price = transaction_price;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public int getTransaction_mode() {
		return transaction_mode;
	}
	public void setTransaction_mode(int transaction_mode) {
		this.transaction_mode = transaction_mode;
	}
	
}
