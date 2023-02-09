package livraria;

public class CalculadoraEstoque {

	public static void main(String[] args) {
	
		double livroJava8;
		double livroTDD;
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD; 
		
		if(soma < 150.0) {
			System.out.println("O estoque está baixissimo. Valor dos livros em estoque : R$" + soma );
		}else {
			System.out.println("Estoque em boas quantidades" + "Valor dos livros em estoque " + soma);
		}
		
		
	}

}
