package PrimeiroProjeto;

import java.util.Scanner;

public class Lista6 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in); //java.util
			
			// 1 - Intervalo numérico
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero >= 10 && numero <= 20) {
			System.out.println("Número dentro do intervalo");
			} else {
			System.out.println("Fora do intervalo");
			}
			System.out.println("------------------------------------");
			
			// 2 - Acesso à festa
			System.out.print("Digite sua idade: ");
			int idade = scanner.nextInt();
			System.out.print("Possui convite? (true/false): ");
			boolean convite = scanner.nextBoolean();
			if (idade >= 18 && convite) {
			System.out.println("Entrada permitida");
			} else {
			System.out.println("Entrada não permitida");
			}
			System.out.println("------------------------------------");
			
			// 3 - Categoria de esporte
			System.out.print("Digite sua idade: ");
			idade = scanner.nextInt();
			if (idade < 12 || idade > 60) {
			System.out.println("Categoria especial");
			} else {
			System.out.println("Categoria normal");
					}
			System.out.println("------------------------------------");
			
			// 4 - Desconto no produto
			System.out.print("Digite o valor do produto: ");
			double valor = scanner.nextDouble();
			System.out.print("Forma de pagamento (avista/cartao): ");
			String pagamento = scanner.next();
			if (valor > 100 && pagamento.equalsIgnoreCase("avista")) {
			double desconto = valor * 0.10;
			System.out.println("Valor com desconto: " + (valor - desconto));
			} else {
			System.out.println("Valor sem desconto: " + valor);
			}
			System.out.println("------------------------------------");
			
			// 5 - Triagem médica
			System.out.print("Digite sua temperatura: ");
			double temp = scanner.nextDouble();
			System.out.print("Possui sintomas? (true/false): ");
			boolean sintomas = scanner.nextBoolean();
			if (temp >= 38 || temp < 36 || sintomas) {
			System.out.println("Recomenda-se procurar um médico.");
			} else {
			System.out.println("Sem sinais preocupantes.");
			}
			System.out.println("------------------------------------");
			
			//6 - Votação
			System.out.print("Digite sua idade: ");
			int idade1 = scanner.nextInt();
			System.out.print("é Brasileiro? (true/false): ");
			boolean nacionalidade = scanner.nextBoolean();
			if (idade > 18 && nacionalidade ) {
			System.out.println("Pode Votar!");
			} else {
			System.out.println("Não pode votar.");
			}
			System.out.println("------------------------------------");
			
			      
		}

	}
