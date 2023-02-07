package fundamentos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String salario1 = JOptionPane.showInputDialog("Digite o Primeiro Salario");

        String salario2 = JOptionPane.showInputDialog("Digite o Segundo Salario");

        String salario3 = JOptionPane.showInputDialog("Digite o Terceiro Salario");
        
        double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);
		
        double soma = numero1+numero2+ numero3;

        

        System.out.println(JOptionPane.showInputDialog("O Valor da Soma é: " +soma));
    }
}
