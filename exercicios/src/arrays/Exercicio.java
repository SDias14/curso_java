package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];  // quantidade fixa e dados homogeneos. 
		
		 notasAlunoA[0] = 7.9;
		  notasAlunoA[1] = 8 ;
		 notasAlunoA[2] = 6.7;
		
		
		String result = Arrays.toString(notasAlunoA);//metodo toString, vai retornar o array em string 
		
		System.out.println(result);
		
		double total = 0; 
		for( int i = 0; i < notasAlunoA.length ; i ++) {
			
			System.out.println("A  nota na posicão : " + i + " é : " + notasAlunoA[i]);
			
			total += notasAlunoA[i];
			
		}
		
		System.out.println("A media do aluno foi : " + total/ notasAlunoA.length);
		
		System.out.println("\n Nota Aluno b \n");
		
		double [] notasAlunoB = {6.9, 8.9, 5.5, 10}; // outra forma. 
		
		for(int i = 0 ; i < notasAlunoB.length; i++) {
            System.out.println("A  nota na posicão : " + i + " é : " + notasAlunoB[i]);
			
			total += notasAlunoB[i];
		}
		
		System.out.println("A media do aluno foi : " + total/ notasAlunoB.length);
	}

}
