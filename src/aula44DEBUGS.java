import java.util.Locale;
import java.util.Scanner;

public class aula44DEBUGS {

	public static void main(String[] args) {
		//PARA MARCAR UMA LINHA DE BREAKPOINT:
			//RUN -> TOGGLE BREAKPOINT
		//PARA INICIAR O DEBUG:
			//BOTAO DIREITO NA CLASSE -> DEBUG AS -> JAVA APPLICATION;
		//PARA EXECTUAR UMA LINHA
			//F6
		//PARA INTERROMPAR O DEBUG: RED CUBIC;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double price = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", price);
		
		sc.close();

	}

}
