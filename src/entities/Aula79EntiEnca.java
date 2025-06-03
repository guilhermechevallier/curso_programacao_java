 package entities;

public class Aula79EntiEnca {
	
	String name;
	private double price;
	private int quantity;
	
	//CONSTRUCTOR PADRAO;
	public Aula79EntiEnca() {
	}
	
	//CONSTRUCTOR PASSANDO PARAMETROS;
	public Aula79EntiEnca(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//CONSTRUCTOR COM PARAMETRO ZERADO NO QUANTITY;
	public Aula79EntiEnca(String name, double price) {
		this.name = name;
		this.price = price;
	}
	//RETURN NAME;
	public String getName() {
		return name;
	}
	//SETTER NAME;
	public void setName(String name) {
		this.name = name;
	}
	//RETURN PRICE;
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//SETTER PRICE;
	public void setPrice(double price) {
		this.price = price;
	}
	// TOTAL VALOR DO PRECO * QUANTITY;
	public double totalValueInStock() {
		return price * quantity;
	}
	//ADD IN STOCK;
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	//REMOVE IN STOCK;
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	//TOSTRING;
	public String toString() {
		return name + " "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}






