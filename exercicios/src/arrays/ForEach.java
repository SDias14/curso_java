package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		//em java nao se escreve o foreach e sim o for 
		
		for(double nota: notas) {
			System.out.println( nota);
		}
	}

}
