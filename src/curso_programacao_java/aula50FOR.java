package curso_programacao_java;

import java.util.Scanner;

public class aula50FOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int soma = 0;
		int j = 5;
		
		for (int i = 0; i < j; i++) {
			System.out.printf("%d - %d%n", i, j);
			x = sc.nextInt();
			soma += x;
			
			
		}
		System.out.printf("soma dos numeros digitados: %d", soma);
		
		sc.close();
	}
}
