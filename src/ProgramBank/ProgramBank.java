package ProgramBank;

import banker.Bank;
import banker.Cadastro;
import banker.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramBank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//CRIACAO  DA LISTA CONTAS BANCARIAS
        List<Bank> contas = new ArrayList<>();

        //INICIALIZA OS SERVICOS DE CADASTRO E LOGIN;
        Cadastro cadastro = new Cadastro(scanner);
        Login login = new Login(scanner);

        int opcao;

        // Menu principal
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastro");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastro.cadastrar(contas);
                    break;
                case 2:
                    login.fazerLogin(contas);
                    break;
                case 3:
                    System.out.println("👋 Programa Encerrado...");
                    break;
                default:
                    System.out.println("❌ Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();

	}

}
