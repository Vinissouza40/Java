package fundamentos;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

//		System.out.println(condicao1 && !condicao2);
//		System.out.println(condicao1 || condicao2);
//		System.out.println(condicao1 ^ condicao2);
//		System.out.println(!!condicao1);
//		System.out.println(!condicao2);

		//TABELA DA VERDADE E 

		System.out.println("TABELA DA VERDADE E (AND)");

		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);


		// TABELA DA VERDADE OU

		System.out.println("\nTABELA DA VERDADE OU (OR)");

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);


		System.out.println("\nTABELA DA VERDADE OU EXCLUSIVO (XOR)");

		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTABELA DA VERDADE NOT");
		System.out.println(!true);
		System.out.println(!false );

	}
}
