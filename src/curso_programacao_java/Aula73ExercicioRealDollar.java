package curso_programacao_java;

import java.util.Scanner;
import java.util.Locale;

import entities.Aula70Dollar;

public class Aula73ExercicioRealDollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aula70Dollar dol = new Aula70Dollar();
		
		System.out.print("What is the dollar price? ");
		dol.priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dol.dollars = sc.nextDouble();
		
		System.out.println(dol);
		
		sc.close();
	}

}
