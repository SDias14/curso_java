package arrays;


import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Quantos Alunos ? ");
		int qtdAlunos = leitor.nextInt();
		
		System.out.println("Quantas notas por aluno ? ");
		int qtdNotas = leitor.nextInt();
		
		double[][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.println(" Informe a nota " + n + " do aluno " + a );
				notasDaTurma[a][n] = leitor.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total /(qtdAlunos * qtdNotas);
		System.out.println("A media é : " + media);
		
		
		
		
		
		
		leitor.close();
		

	}

}
