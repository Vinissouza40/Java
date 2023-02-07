package fundamentos;

import java.util.Scanner;

public class DesafioConversaoResposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o Primeiro Salario");
        String valor1 = teclado.next().replace(",", ".");
        
        System.out.println("Digite o Segundo Salario");
        String valor2 = teclado.next().replace(",", ".");

        System.out.println("Digite o Terceiro Salario");
        String valor3 = teclado.next().replace(",", ".");

        double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
        double numero3 = Double.parseDouble(valor3);

        double media = (numero1 + numero2+ numero3) / 3;

        System.out.println("A media é "+media);

        teclado.close();

    }
}
