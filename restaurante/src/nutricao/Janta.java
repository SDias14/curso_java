package nutricao;

public class Janta {

	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Feijao", 0.25);
		
		Comida c2 = new Comida("Arroz", 0.5); 
		
		Pessoa p1 = new Pessoa("Samuel", 68.0);
		
		
		p1.show();
		
		p1.comer(c2);
		
		p1.show();
		
		p1.comer(c1);
		
		p1.show();
		
		
		
		
		
		

	}

}
