package banker;

import java.util.List;
import java.util.Scanner;

//CLASSE RESPONSAVEL PELOS CADASTRO;
public class Cadastro {
	private Scanner scanner;
	
	public Cadastro(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	//CADASTRA UMA NOVA CONTA CASO O NUMERO DA CONTA AINDA NAO EXISTA;
	public void cadastrar(List<Bank> contas) {
		System.out.println("\n --- Cadastro de Conta");
		System.out.print("Número da conta: ");
		String numero = scanner.nextLine();
		
		//VERIFICA SE O NUMERO E EXISTENTE;
		for (Bank conta : contas) {
			if (conta.getNumeroConta().equals(numero)) {
				System.out.println("❌ Conta já existe!");
				return;
			}
		}
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Senha: ");
		String senha = scanner.nextLine();
		
		System.out.print("Deposito inicial: ");
		double deposito = Double.parseDouble(scanner.nextLine());
		
		Bank novaConta = new Bank(numero, nome, senha, deposito);
		
		contas.add(novaConta);
		System.out.println("✅ Conta cadastra com sucesso! ");
		
	}
	
 }
