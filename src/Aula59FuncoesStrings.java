
public class Aula59FuncoesStrings {

	public static void main(String[] args) {
		String x = "SE TA CARO, NAO COMPRA";
		
		String s1 = x.toLowerCase();
		String s2 = x.toUpperCase();
		String s3 = x.trim();
		String s4 = x.substring(3);
		String s5 = x.substring(3, 8);
		String s6 = x.replace('A', '4');
		//PRIMEIRA OCORRENCIA;
		int i = x.indexOf("A");
		//ULTIMA OCORRENCIA;
		int j = x.lastIndexOf("A");
		
		
		//SPLIT RECORTA EM VARIAVEL;
		String s = "POTATO LEMON APPLE";
		String[] vect = s.split(" ");
		
		System.out.println("-" + s1 + "-");
		System.out.println("-" + s2 + "-");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(i);
		System.out.println(j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
