package curso_programacao_java;
import java.util.Scanner;
import java.util.Locale;

import entities.Triangle;

public class aula64ResolvendoUmProblema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		double area1, area2, aux;
		
		System.out.println("Digite os lados de um triangulo para calcular a area: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lado para calcular a segunda area do triangulo");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		area1 = x.areaTrian(x.a, x.b, x.c);
		area2 = y.areaTrian(y.a, y.b, y.c);
		
		Triangle.showResult(area1);
		Triangle.showResult(area2);
		
		aux = Triangle.compara(area1, area2);
		
		Triangle.showMaior(aux);
		
		sc.close();
	}
	

}
