package curso_programacao_java;

import java.util.Locale;
import java.util.Scanner;

import entities.Product76;

public class Aula76Construtores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		
		Product76 product = new Product76(name, price, quantity);
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
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