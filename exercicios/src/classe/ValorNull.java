package classe;

public class ValorNull {

	public static void main(String[] args) {
		
		String s1 = "";
		
		System.out.println(s1.concat("!!!"));// só é possivel fazer isso pois tem informação na memoria
		
		s1 = null;
		
		System.out.println(s1);
		
		
		//erro de compilação : se tentar transformar um arquivo.java para um arquivo.class nao vamos conseguir. 
		//erro de tempo de execução : nullpointerexception : é quando voce tem uma variavel nula e voce vai tentar acessar algum propriedade dela.
		

	}

}
