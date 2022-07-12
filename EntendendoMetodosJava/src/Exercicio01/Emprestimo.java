package Exercicio01;


public class Emprestimo {
	
	public static void ValorTotalEmprestimo(int quantidadeDeParcelas, double taxaDeJurosAoMes, double valorDoEmprestimo) {
		
		double valorTotalDoEmprestimo = valorDoEmprestimo * Math.pow(1+taxaDeJurosAoMes, quantidadeDeParcelas);
		
		System.out.println(valorTotalDoEmprestimo);
	}
	
	
	
}
