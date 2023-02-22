package exercicio2;

public class Watch {
	
	Pointer hour = new Pointer();
	Pointer minute = new Pointer();
	Pointer second = new Pointer();
	
	
	public void setTime(int hour , int minute, int second) {
		this.hour.number = hour;
		this.minute.number = minute / 5;
		this.second.number = second / 5;
		
	}
	
	public int readHour() {
		
		return this.hour.number;
	}
	
	public int readMinute() {
		
		return this.minute.number * 5;
	}
	
	public int readSecond() {
		
		return this.second.number * 5;
	}
	
	public void show() {
		System.out.println("São " + readHour() + " horas " + readMinute() + " Minutos e " + readSecond() + " Segundos"); 
	}
	
	
}
