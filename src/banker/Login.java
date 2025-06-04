package banker;

import java.util.List;
import java.util.Scanner;

//CLASSE RESPONSAVEL PELA AUTENTICACAO;
public class Login {
	private Scanner scanner;

	 public Login(Scanner scanner) {
	        this.scanner = scanner;
	 }	
	 
	 public void fazerLogin(List<Bank> contas) {
		 System.out.println("\n --- LOGIN ---- ");
		 System.out.print("Numero da conta: ");
		 String numero = scanner.nextLine();
		 
		 System.out.print("Senha: ");
		 String senha = scanner.nextLine();
		 
		 int option;
		 
		 for (Bank conta : contas) {
			 if (conta.getNumeroConta().equals(numero) && conta.verificarSenha(senha)) {
				 
				 System.out.println("✅ Bem-vindo(a), " + conta.getNome());
				 System.out.println("💰 Saldo atual: R$ " + conta.getSaldo());
				 System.out.println();
				 
				 int resp;
				 
				 do {
					 System.out.println("===========================");
					 System.out.println("DEPOSITAR OU SACAR?");
					 System.out.print("[1] DEPOSITAR / [2] SACAR / [3] SAIR : ");
					 
					 resp = Integer.parseInt(scanner.nextLine());
					 
					 switch(resp){
						 case 1:
							 System.out.print("Depositar qual o valor do deposito: $ ");
							 double money = Double.parseDouble(scanner.nextLine());
							 
							 conta.depositar(money); 					 
							 
							 System.out.printf("%s, 💰 Saldo atual: R$ %.2f%n", conta.getNome(), conta.getSaldo());
							 
							 break;
						 case 2:
							 System.out.print("qual o valor de saque (taxa de $ 5.0) ? $ ");
							 double smoney = Double.parseDouble(scanner.nextLine());
							 
							 conta.sacar(smoney); 					 
							 
							 System.out.printf("%s, 💰 Saldo atual: R$ %.2f%n", conta.getNome(), conta.getSaldo());
							 
						 case 3: 
							 break;
							 
						 default:
							 resp = 3;
					 }
					 
				 } while (resp != 3);	 
				 
				 return;
			 }
		 }
		 
		 System.out.println("❌ Conta ou senha invalidos.");
	 }
	 
	 
	 
}


