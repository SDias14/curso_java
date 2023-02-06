package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto  = 0.25; //desconto aplicado para todo o codigo. 
	
	//definindo de forma explicita o construtor padrao. 
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
}
	
	
	double precoComDesconto() {
		
		double finalValue = preco * (1-desconto);
		
		return finalValue;
	}

}
