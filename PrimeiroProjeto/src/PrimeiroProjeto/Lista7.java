package PrimeiroProjeto;

import java.util.Scanner;

public class Lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Filme
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		if (idade >16 && idade <70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		//2 - Promoção de Produto
		System.out.println("Qual o valor do produto?");
		int valor = scanner.nextInt();
		System.out.println("Qual foi a quantidade comprada?");
		int quantidade = scanner.nextInt();
		double valor2 = valor * quantidade;
		if (valor2 >200 && quantidade > 5) {
		double valorfinal = valor2 * 0.85;
		System.out.printf("Vai pagar: %.2f", valorfinal);
		} else {
		System.out.println("Não tem desconto");
		}
		
		//3 - Alerta de Saúde
		System.out.println("Qual é a sua frequência cardíaca (em pbm)? ");
		int frequencia = scanner.nextInt();
		System.out.println("Você sente tontura?");
		String tontura = scanner.next();
		if (frequencia >= 100 && tontura.equalsIgnoreCase("SIM")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}
		
		
	
		
		
		
		
		
		


	}

}