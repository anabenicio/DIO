package Exercicio02;

public class CalculaArea {
	double valorDaArea;
	

	public static void calcularArea(double ladoQuadrado) {
		
		System.out.println("O valor da �rea desse quadrado �: " + Math.pow(ladoQuadrado, 2));
	}
	
	public static void calcularArea(double valorDaBase, double valorDaAltura) {
		System.out.println("O valor da �rea desse ret�ngulo �: "+valorDaBase * valorDaAltura);
	}
	
	public static void calcularArea(double baseMaior, double baseMenor, double altura) {
		System.out.println("O valor da �rea desse trap�zio �: "+((baseMaior+baseMenor)*altura)/2);
	}

}
