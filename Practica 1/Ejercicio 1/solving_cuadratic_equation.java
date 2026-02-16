import java.util.Scanner;

public class solving_cuadratic_equation {

	public static void main(String[] args) {
		
		double a, b, c, disc, r1, r2;
		
		System.out.println("Ingrese los coeficientes de la ecuación cuadrática de la forma ax^2 + bx + c = 0");
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("a = ");
		a = input.nextDouble();
		
		System.out.print("b = ");
		b = input.nextDouble();
		
		System.out.print("c = ");
		c = input.nextDouble();
		
		input.close();
		
		disc = (Math.pow(b,2)) - (4*a*c);
		
		if(disc > 0) {
			System.out.println("El discriminante es positivo, hay 2 raices reales:");
			r1 = (-b + Math.pow(disc,0.5)) / (2*a);
			r2 = (-b - Math.pow(disc,0.5)) / (2*a);
			System.out.println("Raíz 1: " + r1 + "\nRaíz 2: " + r2);
		}
		else if(disc == 0) {
			System.out.println("El discriminante es igual a 0, hay 1 raíz real:");
			r1 = (-b) / (2*a);
			System.out.println("Raíz 1: " + r1);
		}
		
		else {
			System.out.println("El discriminante es menor a 0, las raices son imaginarias:");
		}
			

	}

}
