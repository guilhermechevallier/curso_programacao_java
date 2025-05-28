
import java.util.Scanner;
import java.util.Locale;

public class nextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase, author;
		int age;
		
		System.out.println("Digite uma frase: ");
		phrase = sc.nextLine();
		System.out.println("Digite o auto");
		author = sc.nextLine();
		
		System.out.println(phrase);
		System.out.println(author);
		
		
		sc.close();
	}

}
