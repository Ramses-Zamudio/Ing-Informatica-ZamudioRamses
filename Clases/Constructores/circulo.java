import java.util.Date;

public class circulo {
	
	double radio;
	Date bornDate = new Date();
	
	public circulo() { // constructor
		radio = 1;
	}
		
	public circulo(double rad) {
		radio = rad;
	}
	
	public double get_area() {
		return (Math.pow(radio, 2) * Math.PI);
	}

}
