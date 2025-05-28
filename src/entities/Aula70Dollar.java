package entities;

public class Aula70Dollar {
	public double priceDollar;
	public double dollars;
	
	
	public double valorReal() {
		double fazOL = (0.06 * this.priceDollar);
		double reais = (fazOL + this.priceDollar) * this.dollars;
		
		return reais;
	}
	
	public String toString() {
		return "Amount to be paid in reais = " + valorReal();
	}
}
