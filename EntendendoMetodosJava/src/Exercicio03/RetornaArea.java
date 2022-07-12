package Exercicio03;

public class RetornaArea {

public static double calcularArea(double ladoQuadrado) {
		
		return  Math.pow(ladoQuadrado, 2);
	}
	
	public static double calcularArea(double valorDaBase, double valorDaAltura) {
		return valorDaBase * valorDaAltura;
	}
	
	public static double calcularArea(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior+baseMenor)*altura)/2;
	}
}
