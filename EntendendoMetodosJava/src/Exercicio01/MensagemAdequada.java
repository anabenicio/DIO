package Exercicio01;

import java.util.Calendar;

public class MensagemAdequada {

	public static void mensagemAdequada() {
		
		Calendar calendar = Calendar.getInstance();
		int horarioDoDia = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(horarioDoDia > 5 && horarioDoDia < 13) {
			System.out.println("Bom dia");
		} else if (horarioDoDia > 13 && horarioDoDia < 18) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
		
	}
}
