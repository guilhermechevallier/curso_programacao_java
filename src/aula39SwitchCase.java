import java.util.Scanner;

public class aula39SwitchCase {

	public static void main(String[] args) {
		int dia;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero da semana de 1 a 7: ");
		
		dia = scanner.nextInt();
		
		switch (dia){
			case 1:
				System.out.println("Hoje e Domingo");
				break;
			case 2:
				System.out.println("Hoje e Segunda");
				break;
			case 3:
				System.out.println("Hoje e Terca");
				break;
			case 4:
				System.out.println("Hoje e Quarta");
				break;
			case 5:
				System.out.println("Hoje e Quinta");
				break;
			case 6:
				System.out.println("Hoje e Sexta");
				break;
			case 7:
				System.out.println("Hoje e Sabado");
				break;
			default:
				System.out.println("Digite um numero corretamente de 1 a 7");
				break;
		}
		
		scanner.close();
	}

}
