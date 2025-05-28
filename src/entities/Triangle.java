package entities;

public class Triangle{
	public double a;
	public double b;
	public double c;
	
	public double areaTrian(double a, double b, double c) {
		double p, areaE, area;
		
		p = (a + b + c)/2;
		areaE = p*(p-a)*(p-b)*(p-c);
		
		area = Math.sqrt(areaE);
		
		return area;
	}
	
	public static double compara(double area1, double area2) {
		double areaM;
		areaM = area1 > area2 ? area1 : area2;
		
		return areaM;
	}
	
	public static void showResult( double area) {
		System.out.println("A Area do triangulo: " + area);
	}
	public static void showMaior( double area) {
		System.out.println("Maior area: " + area);
	}
}
