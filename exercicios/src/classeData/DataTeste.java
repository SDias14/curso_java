package classeData;





public class DataTeste {

	public static void main(String[] args) {
		
		Data first = new Data(06, 06, 2023);
		
		
		
		String firstFormated = first.obterDadosFormatado();
		
		
		
		Data second = new Data(); //criou uma data padrao. 
		
	
		
		
		String secondFormated = second.obterDadosFormatado();
		
		System.out.println(firstFormated);
		System.out.println(secondFormated);
		
		
		
		
		
		
		
	



	}

}
