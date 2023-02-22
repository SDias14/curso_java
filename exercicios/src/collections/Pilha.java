package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		//primeira a entrar é o ultimo a sair 
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");// se conseguir adicionar vai retornar um valor boolean. 
		livros.push("Jogos vorazes");// retorna uma excessao caso nao consiga aficionar. adiciona no começo da pilha. 
		livros.push("80 voltas em torno do mundo");
		livros.add("O pequeno principe 2");
		
		System.out.println(livros.peek());//retorna o primeiro elemento - last in , first out 
		
		System.out.println(livros.element()); //retorna o primeiro 
		
		System.out.println(livros.peekLast()); // o ultimo elemento. 
		
		System.out.println(livros.pop());

	}

}
