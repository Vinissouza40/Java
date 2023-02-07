package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		byte anosdeEmpresa = 23;
		short numerodeVoos = 542;
		int id = 56789;
		long pontosacumulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		
		double vendasacumuladas = 2_991_797_103.01;
		
		boolean estadeFerias = false; //true
		
		char status = 'A';
		
		System.out.println(anosdeEmpresa*365);
		
		System.out.println(numerodeVoos/2);
		
		System.out.println(pontosacumulados / vendasacumuladas);
		
		System.out.println(id+ ": ganha ->"+salario);
		
		System.out.println("Ferias?" +estadeFerias);
		
		System.out.println("Status" +status);
	}

}
