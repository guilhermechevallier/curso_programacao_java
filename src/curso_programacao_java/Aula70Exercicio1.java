package curso_programacao_java;
import java.util.Scanner;
import entities.Aula70Rectangle;
import java.util.Locale;

public class Aula70Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aula70Rectangle Rect = new Aula70Rectangle();
		
		System.out.println("Enter rectangle width and height");
		Rect.width = sc.nextDouble();
		Rect.height = sc.nextDouble();
		
		System.out.println(Rect);
		
		sc.close();
	}

}
