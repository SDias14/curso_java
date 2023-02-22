package exercicios;

public class App {

	public static void main(String[] args) {
		
		Fraction a = new Fraction();
		
		a.setN(2);
		a.setD(4);
		
		a.show();
		
		Fraction b = new Fraction();
		
		b.setN(3);
		b.setD(6);
		
		b.show();
		
	    Fraction c = a.fractionMult(b);
	   
	    c.show();
		
		
		
	
		

		
		
		


	}

}
