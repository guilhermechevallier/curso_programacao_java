
import java.util.Scanner;
import java.util.Locale;

public class aulaScanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String x, nome;
		int y, num;
		double sale, g;
		char gender;

		System.out.println("Digite seu nome: ");
		x = scanner.next();
		System.out.println("Digite sua idade: ");
		y = scanner.nextInt();
		System.out.println("Digite seu salario: ");
		sale = scanner.nextDouble();
		System.out.println("Qual o seu genero [M ou F]: ");
		gender = scanner.next().charAt(0);
		
		System.out.printf("Seu nome é %s e sua idade é %d%n", x, y);
		System.out.printf("Seu salário: %.2f%n", sale);
		System.out.printf("Genero: %s%n", gender);
		
		System.out.println("=========================");
		nome = scanner.next();
		num = scanner.nextInt();
		g = scanner.nextDouble();

		System.out.println("Dados digitados: ");
		System.out.println(nome);
		System.out.println(num);
		System.out.println(g);
		
		
		scanner.close();
	}

}
