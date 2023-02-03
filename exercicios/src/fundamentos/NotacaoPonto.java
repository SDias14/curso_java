package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "hElLo wOrld"; //string nao é um tipo primitivo da linguagem. (String é uma classe onde podemos acessar metodos)
		String replaced = " ";
		s = s.toLowerCase(); //metodo para letra minuscula. 
		
		System.out.println(s);
		
		replaced = s.replace('r', 'n');// metodo replace serve para substituir uma letra, um caracter dentro da cadeia de caracteres. 
		
		
		System.out.println(replaced);
		
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
	
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X".replace("X", "GUI");
		
		System.out.println(y);
	}

}
