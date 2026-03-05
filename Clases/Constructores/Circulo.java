import java.util.Date;

public class Circulo {
	
	public static final double PI = 3.1416;  // con final se definen constantes, final  bloque la modificacion de la variable
	private double radio;
	Date bornDate = new Date();
	public static int ncircles; // static significa que el dato pertenece a todas las intancias (objetos)
	
	public Circulo() { // constructor
		radio = 1;
		ncircles++;
	}
		
	public Circulo(double rad) {
		radio = rad;
		ncircles++;
	}
	
	public double get_area() {
		return (Math.pow(radio, 2) * Math.PI);
	}
	
	public double getRadio() { // getter
		return radio;
	}

	public void setRadio(double radio) { // setter
		this.radio = radio;
	}

	void printDateCreated() {
		String h = String.format("%02d", bornDate.getHours());
		String m = String.format("%02d", bornDate.getMinutes());
		String s = String.format("%02d", bornDate.getSeconds());
		System.out.println(h + " : " + m + " : " + s);
	}
	
	public static void printNCircles() {
		 System.out.println("NCircles: " + Circulo.ncircles);
	}
	
	

}
