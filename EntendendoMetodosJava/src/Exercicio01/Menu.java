package Exercicio01;

import java.util.Scanner;

public class Menu {

	public static void EscolherAOpccao() {

		int opcao;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma op��o: \n 1 - Valor total do empr�stimo \n 2 - Mensagem do dia \n 3 - Calculadora");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			int quantidadeDeParcelas = 0;
			double taxaDeJurosAoMes = 0;
			double valorDoEmprestimo = 0;
			System.out.println("Valor do empr�stimo");
			valorDoEmprestimo = scanner.nextDouble();
			System.out.println("Quantidade de Parcelas");
			quantidadeDeParcelas = scanner.nextInt();
			System.out.println("Qual � a taxa de juros");
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
			System.out.println("Escolha a opera��o: \n 1 - Soma \n 2 - Multiplica��o \n 3 - Divis�o \n 4 - Subtra��o");
			operacao = scanner.nextInt();
			System.out.println("Entre com o primeiro n�mero");
			num1 = scanner.nextFloat();
			System.out.println("Entre com o segundo n�mero");
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
