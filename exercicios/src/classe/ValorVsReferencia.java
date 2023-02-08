package classe;

import classeData.Data;

public class ValorVsReferencia {

	
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuindo um valor para a varivel b que é uma copia de a. 
		
		a++;
		b--;
		
		System.out.println("O valor de a é : " + a + "\n O valor de b é : " + b); //copias independentes. 
		
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia. 
		
		d1.dia = 31;
		d1.mes = 12;
		d1.ano = 2025; //impacta nos dois. 
		
		System.out.println(d1.obterDadosFormatado());// valor setado 
		System.out.println(d2.obterDadosFormatado());
		
		voltarData(d1); // valor alterado para data inicial padrao pelo metodo
		
		System.out.println(d1.obterDadosFormatado()); //mudou os dois 
		System.out.println(d2.obterDadosFormatado());
		
		
	}
	
	static void voltarData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
		
		
	}
	

}
