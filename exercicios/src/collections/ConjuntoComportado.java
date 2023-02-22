package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//nao respeita ordem de ordenação 
		//Set<String> listaAprovados = new HashSet<String>();// <>isso quer dizer que a minha lista vai ser obrigatoriamente de string;
		
		//para colocar ordem 
		
		SortedSet<String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		System.out.println(listaAprovados); // vai retornar um array de strings 
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato); //aqui vai percorrer a lista e para cada um da lista de aprovados ele vai setar um valor. 
		}
		
	Set<Integer> nums = new HashSet<Integer>();
		
	
		
		nums.add(111);
		nums.add(1);
		nums.add(3);
		nums.add(2);
		
		for(Integer numero : nums) {
			System.out.println(numero);
		}
	
		

	}

}
