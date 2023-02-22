package collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista= new ArrayList<>();
		
		
		
		Usuario u1 = new Usuario("Joseph"); // primeira forma de criar o obejo e settar na lista fazendo um add
		
		lista.add(u1);
		
		lista.add(new Usuario("Ana")); // segunda forma, criando e setando o valor na lista 
		
		lista.add(new Usuario("Carlos"));
		
		lista.add(new Usuario("Bia"));
		
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));
		
		System.out.println("\n");
		
		//remover da lista 
		
		 System.out.println(lista.remove(0));  // por indice e retona o objeto excluido 
		
		 System.out.println(lista.remove(new Usuario("Ana")));  // removendo pelo objeto e retorna um valor booleano
		 
		 System.out.println(lista.contains(new Usuario("Bia"))); // vai retornar um valor booleano se estiver contido 
		
		for(Usuario u: lista) { // para cada iteração sobre a lista o objeto u retorna o valor ordenado do nome de cada objeto dentro da lista. 
			System.out.println(u);
		}
		
		

	}

}
