package exercicio2;

public class App {

	public static void main(String[] args) {
		
		Watch w1 = new Watch();
		
		w1.setTime(3, 25, 50);
		System.out.println(w1.hour.number);
		System.out.println(w1.minute.number);
		System.out.println(w1.second.number);
		
		w1.show();
	}

}
