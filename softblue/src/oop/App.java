package oop;

public class App {

	public static void main(String[] args) {

	//criando uma variavel do tipo account que é imutavel. 
    final Account a = new Account("22222", "Pedroca");
         
       String accNumber = a.getAccountNumber();
       String accOwner = a.getAccountOwner();
       
       System.out.println("A conta " + accNumber + " pertence a " + accOwner);
       
       a.deposit(1000.00);
       
       a.printBalance(); //uma variavel ser final nao quer dizer que ela nunca vai sofrer alteração
       //quando temos uma variavel final na stack ela nao tem nenhuma relação com o objeto. 
       //isso quer dizer que estou apontando pra referencia e nao posso reatribuir a variavel na stack mas posso mexer no objeto. 
       
		
		
		
		
		
		
		
		
		/* 
		 * 
		 * 
		
		 



 
		c1.printBalance(); //1522

		c1.deposit(200.50);

		c1.printBalance(); //1722

		c1.withdraw(300.00);

		c1.printBalance();//1422

		boolean retorno = c1.deposit(-44.55); // nao vai ser possivel 

		if(!retorno) {
			System.out.println("não realizado");
		}else {
			System.out.print("Deposito realizado");
			c1.printBalance();
		}

		boolean retorno2 = c1.withdraw(22.00);

		if(!retorno2) {
			System.out.println("Saque invalido");
		}else {
			System.out.println("Saque realizado com sucesso");
			c1.printBalance();
		}

		System.out.println("\nmetodo recebendo string e convertendo para double");
		System.out.println("\n");
		boolean stringDep = c1.deposit("44.00");

		if(!stringDep) {
			System.out.println("Valor nao depositado");
		}else {
			System.out.println("Valor depositado com sucesso.");
			c1.printBalance();
		}




		System.out.println("////////////////////");

		System.out.println("\ndepositos e retiradas : ");
		System.out.println("\n");
		Account c2 = new Account();

		
		
		c2.printBalance();
		c2.deposit(400.55);
		c2.printBalance();
		c2.withdraw(100.00);
		c2.printBalance();
		System.out.println("\n");
		System.out.println("Transferencia entre contas : ");
		System.out.println("\n");
		System.out.println("Valor antes da transferencia : ");
		c1.printBalance();
		c2.printBalance();
		System.out.println("\n");
		c1.transfer(200, c2);
		System.out.println("Valor depois da transferencia : ");
		c1.printBalance();
		c2.printBalance();

		
		System.out.println("\n ////////////////////");
		
		Account c3 = new Account("22330000", "Carla");
		
		
		String owner =c3.getAccountOwner();
		
		System.out.println(owner);
		
		String accNumber = c3.getAccountNumber();
		System.out.println(accNumber);
		


		
		
       /*	como funciona o heap e stack dentro do java. 
        * 	
		Heap numbers = new Heap();
		
		numbers.a1 = numbers.a2;
		numbers.a3 = numbers.a2; 
		
		System.out.println(numbers.a1);
		System.out.println(numbers.a3);
		numbers.a3 =  8;
		System.out.println(numbers.a1);
		System.out.println(numbers.a2);
		System.out.println(numbers.a3);
		
		*/
		
		
		
		
	}

}
