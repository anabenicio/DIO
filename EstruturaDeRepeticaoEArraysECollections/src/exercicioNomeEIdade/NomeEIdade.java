package exercicioNomeEIdade;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando
 * a sua idade. - Pare o programa inserindo o valor 0 no campo nome
 */
public class NomeEIdade {

	public static void nomeEIdade() {
		String nome = "";
		int idade;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Entre com o nome do aluno: ");
			nome = scanner.next();
			if (nome.equals("0"))
				break;

			System.out.println("Entre com a idade do aluno: ");
			idade = scanner.nextInt();
		}
	}

}