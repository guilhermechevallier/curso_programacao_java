
public class casting {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 5;
		//SERA FEITA PRIMEIRA A EXPRESSAO DPS O ARMAZENAMENTO NA VARIAVEL;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		int b, B, h;
		double area;
		
		b = 6;
		B = 8;
		h = 5;
		
		area = (double) (((b+B)/2) * h);
		
		System.out.printf("Resultado da area: %.1f%n", area);
		
		
		
		double a;
		int g;
		
		a = 5.0;
		g = (int) a;
		
		System.out.println(g);

	}

}
