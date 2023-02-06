package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		//como estamos dentro do mesmo pacote , no java nao precisamos importar a classe produto dentro de produtoteste. 
		
		Produto p1 = new Produto("Teclado ultra" , 5333.22); //usando o construtor com parametros que tem o mesmo nome mas assinatura diferente. 
		
		
		
		
		
		Produto p2 =  new Produto("Teclado MegaUltra" , 100);//usando o construtor padrao que foi definido explicitamente.
		
		
	
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 =p1.precoComDesconto();
		System.out.println(precoFinal1);
		
		double precoFinal2 = p2.precoComDesconto();
		System.out.println( precoFinal2);
		
		double mediaFinal = (precoFinal1 + precoFinal2) / 2; 
		
		System.out.printf("Media Final : R$%.2f.", mediaFinal );
		
	}

}
