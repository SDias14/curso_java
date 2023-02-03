package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Staff information 
		
		
		
		//tipos numericos inteiros 
		
		
		byte anosDeEmpresa = 23;
	    short numeroDeVoos = 542;
	    int flightNumber = 0;
	    int id = 56789;
	    long pontosAcumulados = 3_234_845_223L; // para deixar claro pro java que o numero long é long e nao inteiro, usamos o l na frente. 
	    int workedDays = 0;
	    double pointsValue = 0;
	    //tipos numericos reais. 
	    
        float salario = 11_445.44F; // temos tambem de colocar um F na frente para representar um literal float, nao inteiro, nao double.
	    double vendasAcumuladas = 2_991_797_103.01;
	    
	    //tipos booleans
	    
	    boolean estaDeFerias = false; // pode receber o valor true. 
	    
	    //tipo caractere
	    
	    char status = 'A'; //ativo , com aspas simples.
	    
	    // dias de empresa 
	    
	     workedDays = anosDeEmpresa * 365; //convertendo em dias = 8395
	    
	    System.out.println(workedDays); // convertendo em dias. 
	    
	    //numero de viagens
		
	    flightNumber = numeroDeVoos / 2 ; 
	    System.out.println(flightNumber);
	    
	    //pontos acumulados
	    
	    pointsValue = pontosAcumulados / vendasAcumuladas ; 
	    System.out.println(pointsValue);
	    
	    //id do usuario 
	    
	    System.out.println("O id " + id + " ganha " + salario + " por mes");
	    
	    //se esta de ferias 
	    
	    System.out.println("o funcionario está de ferias ? \nResposta : " + estaDeFerias );
	    
	    //status 
	    
	    System.out.println("O status do funcionario até dezembro era : " + status);
	}

}
