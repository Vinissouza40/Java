package fundamentos;

public class Ternario {

		public static void main(String[] args) {
			double media = 8.6;
			
			String resultadoFinal = media >= 7.0 ? "Aprovado." : "Em Recuperação.";
			
			System.out.println("O Aluno esta " +resultadoFinal);
			
			double nota = 7.9;
			boolean bomComportamento = false;
			boolean passouPorMedia= nota >= 7;			
			boolean temDesconto = bomComportamento && passouPorMedia;
			
			String resultado = temDesconto? "Sim." : "Não.";
			
			
			System.out.printf("Tem Desconto? %s", resultado);
			
			
			
		}
}
