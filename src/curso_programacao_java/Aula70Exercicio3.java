package curso_programacao_java;

import java.util.Scanner;
import java.util.Locale;

import entities.Exercicio3Notas;
public class Aula70Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//AVA = AVALICAO FINAL DE SEMESTRES;
		Exercicio3Notas ava = new Exercicio3Notas();
		
		System.out.print("INSIRA SEU NOME: ");
		ava.Nome = sc.nextLine();
		System.out.println("INSIRA SUAS NOTAS REFERENTE AO 1 SEMESTRE, 2 SEMESTRE E 3 SEMESTRE: ");
		ava.semestre01 = sc.nextDouble();
		ava.semestre02 = sc.nextDouble();
		ava.semestre03 = sc.nextDouble();
		
		ava.Situation();
		
		sc.close();
	}

}
