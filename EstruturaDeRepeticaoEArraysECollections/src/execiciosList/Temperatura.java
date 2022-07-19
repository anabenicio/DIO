package execiciosList;

import java.util.ArrayList;
import java.util.Scanner;


public class Temperatura {

	private String mes;
	private double temperatura;
	

	public Temperatura(String mes, double temperatura) {
		this.temperatura = temperatura;
		this.mes = mes;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public double getTemperaturaMes() {
		return temperatura;
	}


	public void setTemperaturaMes(double temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return " Mês:" + mes + ", Temperatura:" + temperatura + "/n";
	}

}
