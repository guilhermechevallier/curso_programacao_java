package curso_programacao_java;

import java.util.Locale;
import java.util.Scanner;

import entities.Aula79EntiEnca;

public class Aula79Encapsulamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Aula79EntiEnca product = new Aula79EntiEnca(name, price);
		
		product.setName("ps5");
		System.out.println("novo nome " + product.getName());
		product.setPrice(1000);
		System.out.println("novo nome " + product.getPrice());
		System.out.println("novo nome " + product.getQuantity());
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantityR = sc.nextInt();
		product.removeProducts(quantityR);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		
		sc.close();
	}

}