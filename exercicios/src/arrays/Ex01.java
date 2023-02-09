package arrays;


import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int arrayLength = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual sera o tamanho do array ? ");
		
		arrayLength = leitor.nextInt();
		
		double[] notasAluno1 = new double[arrayLength];
		
		for(int i = 0; i < notasAluno1.length; i ++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			
			notasAluno1[i] = leitor.nextDouble();
			
	}
		
	
		
		double total = 0;
		for(double nota: notasAluno1) {
			System.out.println("nota " + nota);
			total += nota;
		}
		
		System.out.println("A media das notas foi : " + total / notasAluno1.length);
		
		
		
		leitor.close();
	}

}
