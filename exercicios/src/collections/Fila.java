package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//adicionam elementes na fila 
		//.add() lançará uma exceção caso a fila esteja cheia.
		//.offer() retorna falso caso a fila esteja cheia.
		fila.add("Ana"); //primeira a entrar na fila 
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		//pegar um elemento da fila 
		
		//System.out.println(fila.peek()); //vai pegar o primeiro elemento da fila. A diferença é que retorna nulo caso a fila esteja vazia 
		//System.out.println(fila.element());//vai pegar o primeiro elemento da fila e vai lancar uma excecao como erro. 
		
		
		// iterando sobre todos os elementos da fila 
	//	for(String nome : fila) {
	//		System.out.println(nome);
	//	}
		
		//fila.clear()
		//fila.isEmpty(); 
		
		System.out.println(fila.poll()); // remove e retorna o primeiro elemento da fila. vai retornar null 
		System.out.println(fila.remove());// vai retorna uma excecao caso a fila esteja vazia 
		
		for(String nome : fila) {
			System.out.println(nome);
		}
		
	}

}
