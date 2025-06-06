package entities;

public class Product76 {
	public String name;
	public double price;
	public int quantity;
	
	//CONSTRUCTOR PADRAO
	public Product76(){
		
	}
	
	//CONSTRUCTOR NORMAL
	public Product76(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//CONSTRUCTOR COM SOBRECARGA, COM STOCK ZERADO;
	public Product76(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
