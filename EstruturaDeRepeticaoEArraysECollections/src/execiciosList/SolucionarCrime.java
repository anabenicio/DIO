package execiciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas são:
 * 1. Telefonou para a vitima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da vítima?
 * 4. Devia para a vítima?
 * 5. Já trabalhou com a vítima?
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como suspeita, entre 3 e 4 como Cúmplice e 5 como
 * Assassina. Caso contrário, ela será classificada como Inocente.
 */

public class SolucionarCrime {

	public void interrogar() {
		Scanner scanner = new Scanner(System.in);
		boolean resp=false;
		int count =0;
		List<PerguntasSolucionarCrime> perguntasSolucionarCrimes = new ArrayList<>();
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("1. Telefonou para a vítima?", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("2. Esteve no local do crime", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("3. Mora perto da vítima?", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("4. Devia para a vítima", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("5. Já trabalhou com a vítima", false));

		for (PerguntasSolucionarCrime interrogatorio : perguntasSolucionarCrimes) {
			System.out.println(interrogatorio.getPergunta()+" ( Responda true para positivo e false para negativo )");
			resp = scanner.nextBoolean();
			interrogatorio.setResposta(resp);
			if(resp == true)count++;
		}
		//System.out.println(perguntasSolucionarCrimes);
		
		switch (count) {
		case 2:
			System.out.println("Suspeita");
			
			break;
		case 3,4:
			System.out.println("Cúmplice");
			
			break;
		case 5:
			System.out.println("Assassina");
			
			break;

		default: System.out.println("Inocente");
			break;
		}
		
	}
	
	
}
