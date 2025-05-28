import java.util.Scanner;

public class aula45While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		
		System.out.print("Digite um numero: ");
		int numbers = sc.nextInt();
		
		while (numbers != 0) {
			soma += numbers;
			System.out.print("Digite um numero: ");
			numbers = sc.nextInt();
		}
		
		System.out.println("Numero foi igual a 0");
		System.out.println("o valor total da soma " + soma);
		
		
		sc.close();
		
	}
}
