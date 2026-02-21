import java.util.Date;

public class Clock {
	int hour, minute, second;
	
	public Clock() {
		Date fecha = new Date();
		hour = fecha.getHours();
		minute =fecha.getMinutes();
		second = fecha.getSeconds();
	}
	
	public Clock(int h, int m, int s) {
		hour = h;
		minute = m;
		second  =s;
		// cuando los parametros del metodo se llaman igual que los 
		// miembros de la clase, se usa this.hour=hour;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second  =second;
	}
	
	public int getHour() { return hour; }
	
	public int getMinute() { return minute; }
	
	public int getSeconds() { return second; }
	
	void printTime() { // si no tiene identificador (public) significa que es un visualizador
		String h = String.format("%02d", hour);
		String m = String.format("%02d", minute);
		String s = String.format("%02d", second);
		System.out.println(h + " : " + m + " : " + s);
	}
	
	public void incHour() { hour++; }
	
	public void incMinute() { minute++; }
	
	public void incSecond() { second++; }
	
	public boolean compTime(Clock temp) {
		if(temp.getHour() == hour && temp.getMinute() == minute && temp.getSeconds() ==second)
			return true;
		else
			return false;
	}
	
	public void copyTime(Clock c) {
		hour = c.getHour();
		minute = c.getMinute();
		second = c.getSeconds();
	}
	
	public Clock rCopyTime() {
		Clock copy = new Clock(hour,minute,second);
		return copy;
		
	}
}
