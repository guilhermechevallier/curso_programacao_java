
public class functions {

	public static void main(String[] args) {
		double x = 2.0;
		double y = 4.0;
		double z = -5.0;
		
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		//MATH.SQRT() USADO PARA RAIZ QUADRADA;
		System.out.printf("Raiz quadrada de %f = %.2f%n", x, A);
		System.out.printf("Raiz quadrada de %f = %.2f%n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.2f%n", C );
		
		//MATH.POW(X, Y) USADO PARA...;
		A = Math.pow(x,  y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0,  2.0);
	}

}
