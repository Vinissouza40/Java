package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");  
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		String s2 = teclado.next();
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		teclado.close();
				
	}
}
