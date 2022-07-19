package exercicioLinkedList;

import java.util.*;

/*
 * Resolva esses exercício utilizando os métodos da implentação
 * LinkedList:
 * 
 * System.out.printiln(" Crie uma lista chamada notas2" + "e coloque
 * todos os elementos da list Arraylist nessa nova lista: ");
 * System.out.prntln("Mostre a primeira nota da nova lista sem removê-lo: ");
 * System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
 * [8.5, 9.3, 6.0, 8.0, 7.0, 3.6]
 */
public class ImplementadoLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Double> notas2 = new LinkedList<>();
		
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(6.0);
		notas2.add(8.0);
		notas2.add(0d);
		notas2.add(7d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Mostre a primeira nota da lista nova sem removê-la: " + notas2.element() );
		System.out.println("Mostre a primeira nota da nova lista removendo-o: " + "Primeira nota da lista: " + notas2.element()+ ", essa nota foi removida" );
		notas2.removeFirst();
		System.out.println(notas2);

	}
}
