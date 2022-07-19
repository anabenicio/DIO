package execiciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas s�o:
 * 1. Telefonou para a vitima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da v�tima?
 * 4. Devia para a v�tima?
 * 5. J� trabalhou com a v�tima?
 * 
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser
 * classificada como suspeita, entre 3 e 4 como C�mplice e 5 como
 * Assassina. Caso contr�rio, ela ser� classificada como Inocente.
 */

public class SolucionarCrime {

	public void interrogar() {
		Scanner scanner = new Scanner(System.in);
		boolean resp=false;
		int count =0;
		List<PerguntasSolucionarCrime> perguntasSolucionarCrimes = new ArrayList<>();
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("1. Telefonou para a v�tima?", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("2. Esteve no local do crime", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("3. Mora perto da v�tima?", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("4. Devia para a v�tima", false));
		perguntasSolucionarCrimes.add(new PerguntasSolucionarCrime("5. J� trabalhou com a v�tima", false));

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
			System.out.println("C�mplice");
			
			break;
		case 5:
			System.out.println("Assassina");
			
			break;

		default: System.out.println("Inocente");
			break;
		}
		
	}
	
	
}
