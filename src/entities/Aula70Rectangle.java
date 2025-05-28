package entities;

public class Aula70Rectangle {
	public double width;
	public double height;
	
	public double Area(){
		double area = this.width * this.height;
		
		return area;
	}
	
	public double Perimeter() {
		double peri = 2 * (this.width + this.height);
		
		return peri;
	}
	
	public double Diagonal() {
		double diag = Math.pow(this.width, 2) + Math.pow(this.height, 2); 
		diag = Math.sqrt(diag);
				
		return diag;
	}
	
	public String toString() {
		return "RESULTADO:\n" +
	               "AREA = " + Area() + "\n" +
	               "PERIMETER = " + Perimeter() + "\n" +
	               "DIAGONAL = " + Diagonal();
	}
}
