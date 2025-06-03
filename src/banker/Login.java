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
		 
		 for (Bank conta : contas) {
			 if (conta.getNumeroConta().equals(numero) && conta.verificarSenha(senha)) {
				 
				 System.out.println("✅ Bem-vindo(a), " + conta.getNome());
				 System.out.println("💰 Saldo atual: R$ " + conta.getSaldo());
				 System.out.println();
				 
				 System.out.println("===========================");
				 System.out.println("DEPOSITAR ?");
				 System.out.println("[1]SIM / [2] NAO");
				 
				 int option = scanner.nextInt();
				 
				 switch(option){
				 case 1:
					 System.out.println("Depositar qual o valor do deposito");
					 double money = Double.parseDouble(scanner.nextLine());
					 
					 Bank addCash = new Bank();
					 addCash.depositar(money); 
					 
					 System.out.printf("%s, 💰 Saldo atual: R$ %.2f%n", conta.getNome(), conta.getSaldo());
					 
					 break;
				 case 2:
					 System.out.println("O QUE DESEJA FAZER AGORA?");
				 }
				 
				 
				 return;
			 }
		 }
		 
		 System.out.println("❌ Conta ou senha invalidos.");
	 }
	 
	 
	 
}


