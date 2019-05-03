package cn.vo;

public class Merchandise {

	private String merchandise_id;
	private int merchandise_type;
	private String name;
	private String owner;
	private double owner_price;
	private double final_price;
	private int merchandise_number;
	
	
	public String getMerchandise_id() {
		return merchandise_id;
	}
	public void setMerchandise_id(String merchandise_id) {
		this.merchandise_id = merchandise_id;
	}
	public int getMerchandise_type() {
		return merchandise_type;
	}
	public void setMerchandise_type(int merchandise_type) {
		this.merchandise_type = merchandise_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getOwner_price() {
		return owner_price;
	}
	public void setOwner_price(double owner_price) {
		this.owner_price = owner_price;
	}
	public double getFinal_price() {
		return final_price;
	}
	public void setFinal_price(double final_price) {
		this.final_price = final_price;
	}
	public int getMerchandise_number() {
		return merchandise_number;
	}
	public void setMerchandise_number(int merchandise_number) {
		this.merchandise_number = merchandise_number;
	}
	
}
