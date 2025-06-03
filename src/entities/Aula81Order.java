package entities;

import java.util.Date;

public class Aula81Order {
	
	private Date date;
	private Aula79EntiEnca product;
	
	public Aula81Order(Date date, Aula79EntiEnca product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date; 
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Aula79EntiEnca getProduct() {
		return product;
	}

	public void setProduct(Aula79EntiEnca product) {
		this.product = product;
	}
}
