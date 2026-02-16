import java.util.Scanner;

public class solving2x2 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f;
		double x, y;
		
		System.out.println("Ingrese los coeficientes de tu ecuación de la siguiente forma:");
		System.out.print("ax + by = c\ndx + ey = f\n\n");
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("a = ");
		a = input.nextDouble();
		
		System.out.println("b = ");
		b = input.nextDouble();
		
		System.out.println("c = ");
		c = input.nextDouble();
		
		System.out.println("d = ");
		d = input.nextDouble();
		
		System.out.println("e = ");
		e = input.nextDouble();
		
		System.out.println("f = ");
		f = input.nextDouble();
		
		input.close();
		
		if(((a*d) - (b*c)) != 0) {
			x = ((e*d) - (b*f)) / ((a*d) - (b*c));
			y = ((a*f) - (e*c)) / ((a*d) - (b*c));
			System.out.print("X = "+ x +"\nY = "+  y);
		}
		
		else
			System.out.println("La ecuación no tiene solución");

	}

}
