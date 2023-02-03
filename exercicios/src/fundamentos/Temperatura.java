package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		//(°F - 32) X 5/9 = °C
		//F vai ser variavel , 5/9 vai ser constante , 32 vai ser constante  e celsius variavel
		
		int F =0;
		final double S = 32;
		final double M = 5.0 / 9.0;
		double C = 0.0 ;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Olá , digite a temperatura em farenheint : ");
		F = sc1.nextInt();
		C = (F - S) * M;
		
		
		System.out.println("O valor da temperatura em celsius é " + C);
		
		
	sc1.close();
		

	}

}
