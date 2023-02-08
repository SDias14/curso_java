package classeData;

import java.util.Date;

public class Data {
	
	public long dia;
	public long mes;
	public long ano;
	
	
	
	Date d = new Date();
	
	Data(){
		
		this(1,1,1970); // um construtor chamou outro construtor.
		
	}
	
	
	public Data(int dia, int mes, long ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDadosFormatado() {
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}// melhor forma de manipular dados inteiros e strings é o string.format



}
