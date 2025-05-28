package curso_programacao_java;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee70;

public class Aula70Execircio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee70 emp = new Employee70();
		
		System.out.print("Name: ");
		emp.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", emp.Name, emp.NetSalary());
		
		System.out.print("Wich percentage to increase salary? ");
		double perc = sc.nextDouble();
		emp.IncreaseSalary(perc);
		
		sc.close();
	}

}
