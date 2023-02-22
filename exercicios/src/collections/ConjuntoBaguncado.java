package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		//adicionar elementos 
		
		conjunto.add(1.2); // nao suporta tipos primitivos a collection mas ele vai fazer = double->Double
		conjunto.add(true);// boolean -> Boolean(classe)
		conjunto.add("teste");//String. 
		conjunto.add(1);// int -> Integer
		conjunto.add('X'); // char -> Character. 
		
		System.out.println("Tamanho do conjunto é : " + conjunto.size());
		
		conjunto.add("teste"); // nao aceita repeticao

		System.out.println("Tamanho do conjunto é : " + conjunto.size());
		
		conjunto.add("Teste"); //vai aumentar o tamanho porque agora o teste esta em letra Maiuscula. 
		
		System.out.println("Tamanho do conjunto é : " + conjunto.size());
		
		// remover elementos : 
		
		System.out.println(conjunto.remove("Teste")); // ele vai retornar um booleano. se conseguiu remover é true se nao é false 
		
		conjunto.add("Teste"); //vai aumentar o tamanho porque agora o teste esta em letra Maiuscula.
		
		System.out.println("Tamanho do conjunto é : " + conjunto.size());
		
		if (conjunto.remove("Teste")) { // vai dar true
			System.out.println("Elemento removido com sucesso");
			System.out.println("Tamanho do conjunto é : " + conjunto.size());
		} else {
			System.out.println("Elemento nao removido");
		}
		
		if(conjunto.contains('X')) {
			// retorna tambem um booleano 
			
			System.out.println("O conjunto possui o elemento");
		}else {
			System.out.println("O conjunto nao possui este elemento");
		}
		
		
		
		Set nums = new HashSet(); // é possivel fazer isso no java. principio da orientaçãp a objetos. 
		
		nums.add(1); 
		nums.add(2); 
		nums.add(3); 
		
		System.out.println(nums); // ela resolve para uma string 
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // fiz a uniao , tudo que tem em nums vai ter em conjunto. 
		
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto); // so vai reter o que for igual 
		
		conjunto.clear();
		System.out.println(conjunto); // limpa o conjunto.
		
		
		
		

		
		
	}

}
