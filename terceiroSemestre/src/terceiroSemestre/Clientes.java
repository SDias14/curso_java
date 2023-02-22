package terceiroSemestre;

//import java.util.function.Function;

public class Clientes {
	String nome, contato, endereco;
	int idade;
	
	Clientes(String nomeCliente, int idadeCliente){
		this.nome = nomeCliente;
		this.idade = idadeCliente;
		
	}
	
	public String getContato() {
		return this.contato;
		
	}
	
	public void setContato(String contatoCliente) {
		this.contato = contatoCliente;
		
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String enderecoCliente) {
		this.endereco = enderecoCliente;
		
	
	}
	
	@Override
	public String toString() {
		return "O cliente " + this.nome + " com idade de " + this.idade + " reside em " + this.getEndereco() + " e tem o telefone " + this.getContato();
	}
	

}
