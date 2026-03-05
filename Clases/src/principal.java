
public class principal {

	public static void main(String[] args) throws InterruptedException {
		
		Circulo clk1 = new Circulo();
		//clk1.printDateCreated();
		Circulo.printNCircles();
		
		Thread.sleep(2000);
		
		Circulo clk2 = new Circulo();
		//clk2.printDateCreated();
		Circulo.printNCircles();
		
		System.out.println(clk1.PI);
		
		System.out.println(clk1.getRadio());
		clk1.setRadio(4.1);
		System.out.println(clk1.getRadio());
		
		Clock cl = new Clock();
		
		
		/*Clock clk1 = new Clock();
		Clock clk2 = new Clock(12,30,10);
		
		System.out.print("Reloj 1: ");
		clk1.printTime();
		System.out.print("Reloj 2: ");
		clk2.printTime();
		
		clk1.incHour();
		clk1.incMinute();
		clk1.incSecond();
		
		clk2.incHour();
		clk2.incMinute();
		clk2.incSecond();
		
		System.out.println("Se incremento en 1 los segundos, minutos y horas ambos relojes");
		
		System.out.print("Reloj 1: ");
		clk1.printTime();
		System.out.print("Reloj 2: ");
		clk2.printTime();
		
		System.out.println("Los tiempos de los relojes son iguales? " + clk1.compTime(clk2));
		
		Thread.sleep(2000);
		
		Clock clk3 = new Clock();
		
		System.out.print("Reloj 3: ");
		clk1.printTime();
		
		clk1.copyTime(clk3);
		
		System.out.print("Se copio el tiempo del Reloj 3 al Reloj 1: ");
		clk1.printTime();*/
	}

}
