package execiciosList;
import java.util.ArrayList;
/*
 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros
 * meses do ano e armazene-as em uma lista.
 * Ap�s isso, c�lcule a m�dia semestral das temperaturas e 
 * mostre todas as temperaturas acima desta m�dia, e em que
 * m�s elas ocorreram (mostrar o m�s por extenso 1 - Janeiro,
 * 2 - Fevereiro e etc.
 */
import java.util.List;
import java.util.Scanner;

public class CalcularTemperatura {
	private double temperatura;
	private String mes;
	
	public void mediaSemestralTemperatura() {
		double mediaTemperatura = 0;
		Scanner scanner = new Scanner(System.in);
		List<Temperatura> temperaturasMes = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Entre com o m�s do ano ");
			mes = scanner.next();
			System.out.println("Entre com a temperatura: ");
			temperatura = scanner.nextDouble();
			mediaTemperatura+=temperatura;
			temperaturasMes.add(new Temperatura(mes, temperatura));
		}
		mediaTemperatura/=6;
		int count=0;
		
		for (Temperatura temp : temperaturasMes) {
			count++;
			if(temp.getTemperaturaMes()>mediaTemperatura)
			{
				
				System.out.println( count +" - " + temp.getMes());
				
			}
		}
		//System.out.println(temperaturasMes);
	}
}
