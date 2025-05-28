import java.util.Scanner;

public class aula38OperadoresDistribuicao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double minPadrao = 50.00;
		int minUser;
		double minTotal;
		double valorPorMin = 2.00;
		
		System.out.println("Operadora: R$ 50,00 o plano.");
		System.out.println("A cada minuto a mais de 100, cobra R$2.00 por minuto");
		System.out.println("Minutos usados: ");
		minUser = scanner.nextInt();
		
		if (minUser > minPadrao) {
			minTotal = minUser - minPadrao;
			double valorTotal = (minTotal * valorPorMin) + minPadrao;
			
			System.out.printf("Min usados: %d, valor total: R$ %.2f%n", minUser, valorTotal);
		} else {
			System.out.printf("Min usados: %d, valor total: R$ %.2f%n ", minUser, minPadrao);
		}
		
		scanner.close();
		
	}

}
