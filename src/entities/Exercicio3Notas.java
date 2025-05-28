package entities;

public class Exercicio3Notas {
	public String Nome;
	public double semestre01;
	public double semestre02;
	public double semestre03;
	
	public double NotaFinal () {
		double result = 0;
		
		if (this.semestre01 <= 30 && this.semestre02 <= 35 && this.semestre03 <= 35) {
			result = (this.semestre01 + this.semestre02 + this.semestre03);
		} else {
			result = 0;
		}
		
		return result;
	}
	
	public void Situation () {
		double result = NotaFinal();
		double missing = 0;
		
		if (result >= 60.0 && result <= 100.0) {
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("PASS");
		} else if (result < 60.0){
			missing = 60 - result;
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missing);
		}
	}

	
}
