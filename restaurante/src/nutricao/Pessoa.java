package nutricao;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	};
	
	
	void comer(Comida a) {
		
		this.peso += a.peso;
		
	}
	
	void show() {
		System.out.println("Meu nome é : " + this.nome + " e peso " + this.peso);
	}

}
