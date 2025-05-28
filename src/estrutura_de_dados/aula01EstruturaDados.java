

package estrutura_de_dados;

public class aula01EstruturaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		int y = 10;
		int z = 20;
		
		int result;
		
		result = max(x, y, z);
		
		System.out.println("maior: " + result);
		
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}

}
