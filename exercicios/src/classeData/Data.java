package classeData;

import java.util.Date;

public class Data {
	
	long dia;
	long mes;
	long ano;
	
	
	
	Date d = new Date();
	
	Data(){
		
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	
	Data(int diaInfo, int mesInfo, long anoInfo){
		dia = diaInfo;
		mes = mesInfo;
		ano = anoInfo;
	}
	
	String obterDadosFormatado() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}// melhor forma de manipular dados inteiros e strings é o string.format



}
