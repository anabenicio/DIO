package Exercicio01;

import java.util.Scanner;

public class Menu {

	public static void EscolherAOpccao() {

		int opcao;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma opção: \n 1 - Valor total do empréstimo \n 2 - Mensagem do dia \n 3 - Calculadora");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			int quantidadeDeParcelas = 0;
			double taxaDeJurosAoMes = 0;
			double valorDoEmprestimo = 0;
			System.out.println("Valor do empréstimo");
			valorDoEmprestimo = scanner.nextDouble();
			System.out.println("Quantidade de Parcelas");
			quantidadeDeParcelas = scanner.nextInt();
			System.out.println("Qual é a taxa de juros");
			taxaDeJurosAoMes = scanner.nextDouble();
			
			Emprestimo.ValorTotalEmprestimo(quantidadeDeParcelas, taxaDeJurosAoMes, valorDoEmprestimo);
			break;
		case 2:
						MensagemAdequada.mensagemAdequada();

			break;

		case 3:
			int operacao;
			
			float num1;
			float num2;
			System.out.println("Escolha a operação: \n 1 - Soma \n 2 - Multiplicação \n 3 - Divisão \n 4 - Subtração");
			operacao = scanner.nextInt();
			System.out.println("Entre com o primeiro número");
			num1 = scanner.nextFloat();
			System.out.println("Entre com o segundo número");
			num2 = scanner.nextFloat();
			switch (operacao) {
			case 1: 
				System.out.println(Operacoes.Soma(num1, num2)); 
			default:
				break;
			case 2: 
				System.out.println(Operacoes.Multiplicacao(num1, num2)); 
			
				break;
			case 3: 
				System.out.println(Operacoes.Divisao(num1, num2)); 
			
				break;
			case 4: 
				System.out.println(Operacoes.subtracao(num1, num2)); 
	
				break;
			}

			break;

		default:
			break;
		}
	}
}
