package exercicios;

public class Fraction {
	 
	private int n;
	private int d;
	
	
	
	
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public Fraction fractionMult(Fraction f) {
		Fraction c = new Fraction();//cria um novo objeto dentro do metodo
		c.n = n * f.n;//o numerador do novo objeto vai ser igual ao valor do numerador da funcao 1 * o numerador da fração recebida
		c.d = d* f.d;//o denominador do novo objeto c vai ser igual ao denominador da fracao 1 * o denominador da fração recebida  


	   
	     
	    return c; // vai retornar a fração c 
	 }
	
	void show() {
		System.out.println(n + "/" + d);
	}
	
	
	
}
