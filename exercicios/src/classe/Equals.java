package classe;

import java.util.Date;
// versao gerada automaticamente 
public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); // false 
		System.out.println(u1.equals(u2));// false. 
		
		System.out.println(u2.equals(new Date())); // retornou falso

	}

}



/*
 * versao mais simples 
 * 
 public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
		
        Usuario outro = (Usuario) objeto; // o objeto outro vai receber um objeto que é uma instancia de usuario. 
        
        boolean nomeIgual = outro.nome == this.nome;
        boolean emailIgual = outro.email == this.email;
		
        
        return nomeIgual && emailIgual;
		}else {
			return false;
		}
	}
	
	*/
