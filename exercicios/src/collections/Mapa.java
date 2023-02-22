package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//estrutura chave valor 
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto"); //adicionando um elemento chave/valor dentro de usuarios com o map 
		usuarios.put(2, "Ricardo"); //alterando um elemento. 
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // retorna o tamanho do elemento.
		System.out.println(usuarios.isEmpty()); // vai retornar um boolean.
		System.out.println(usuarios.keySet()); // retorna as chaves
		System.out.println(usuarios.containsKey(1)); // retorna um boolean se conter a chave 
		System.out.println(usuarios.get(3));//retorna o valor do elemento que escolhemos. 
		System.out.println(usuarios.values());//retorna os valores 
		System.out.println(usuarios.entrySet());// retorna chave valor 
		
		
		//percorrendo elementos de um map 
		
		//percorrendo a chave. 
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		
		//percorrendo por valor 
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrendo chave e valor 
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}
		
		
	}

}
