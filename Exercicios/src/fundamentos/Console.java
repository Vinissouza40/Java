package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Bom dia\n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Mega Sena %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6 );
		
		System.out.printf("Salario: %.1f%n" , 1234.5678);
		
		System.out.printf("Nome: %s%n", "Joao");
		
		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade  = entrada.nextInt();
		
		System.out.println("\nNome: "+nome+ " " +sobrenome+ "\nIdade: " +idade);
		
		entrada.close();
		
		
	}
}
