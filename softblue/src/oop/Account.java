package oop;

public class Account {
	
	private final String accountNumber; // tipo especifico de variavel que é o atributo.
	private final String accountOwner;
	private double balance;
	
	
	//construtor padrao
	
	
	
	
	    // construtor completo
	    public Account(String accountNumber, String accountOwner, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	    
	    // construtor com um parametro 
	    public Account(String accountNumber) {
	    	this(accountNumber, null, 0);
	    }
	    // construtor com dois parametros 
	    public Account(String accountNumber, String accountOwner) {
	    	this(accountNumber, accountOwner, 0);
	    }
	    
	    //
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	

	public String getAccountOwner() {
		return accountOwner;
	}
 
	public double getBalance() {
		return balance;
	}
	
	
	public void printBalance() {
		// quando nao ha retorno nos retornamos void. 
		
		System.out.println("Saldo : R$" + this.getBalance());
	}
	
	
	public boolean deposit(String amount) {
		//vai retornar um boolean, verdadeiro ou falso se foi adicionado ou nao 
		//vai receber como parametro uma string que vai vir a copia da referencia para dentro de amount 
		return deposit(Double.parseDouble(amount));
		//vai retornar verdadeiro ou falso se foi adicionado. 
	}
	
	public boolean deposit(double amount) {
		
		if(amount > 0 ) {
		this.balance += amount;
		return true;
	} 
		return false;
}
	public boolean withdraw(double amount) {
		if(amount > 0 ) {
		this.balance -= amount;
		return true;
	}
		return false;
}
	
	public void transfer(double amount, Account targetAccount) {
		
		withdraw(amount); // metodo pode chamar outro metodo. 1° - qual o valor que eu quero tirar da minha conta. 
		targetAccount.deposit(amount); // faz o deposito na conta de destino. 
		//no java, o valor parametros passados nao sao por referencia e sim por copia de referencia. 
	}
	
	


	 
	
	
	
	
	
	
	
	
}


