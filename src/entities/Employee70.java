package entities;

public class Employee70 {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		double salaryLiquid = this.GrossSalary - this.Tax;
		
		return salaryLiquid;
	}
	
	public void IncreaseSalary (double percentage) {
		double salaryLiquid1 = (this.GrossSalary - this.Tax) + (this.GrossSalary * (percentage / 100));	
		
		System.out.println("Update data: " + this.Name + ", $" + salaryLiquid1);
	}
	
	
}
