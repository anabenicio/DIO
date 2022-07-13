package Exercicio02;

public class ExibirDiaDaSemana {

	public static void exibirDiaDaSemana(String diaDaSemana) {
		switch (diaDaSemana) {
		case "domingo":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 1");
			break;
		case "segunda":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 2");
			break;
		case "terça":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 3");
			break;
		case "quarta":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 4");
			break;
		case "quinta":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 5");
			break;
		case "sexta":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 6");
			break;
		case "sábado":
			System.out.println("O valor equivalente ao dia da semana escolhido é: 7");
			break;

		default:
			break;
		}
	}
	
	public static void exibirTexto(int numeroTexto) {
		switch (numeroTexto) {
		case 1,2,3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
		break;
		case 5:
			System.out.println("Talvez");
		break;

		default: System.out.println("Valor indefinido");
			break;
		}
	}
}
