import java.util.Scanner;

public class two_rectangles {

	public static void main(String[] args) {
		
		int x1, y1, x2, y2, w1, w2, h1, h2;
		boolean flag = false;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Ingrese la coordenada \"x\" del primer rectangulo: ");
		x1 = input.nextInt();
		System.out.print("Ingrese la coordenada \"y\" del primer rectangulo: ");
		y1 = input.nextInt();
		System.out.print("Ingrese el ancho del primer rectangulo: ");
		w1 = input.nextInt();
		System.out.print("Ingrese el largo del primer rectangulo: ");
		h1 = input.nextInt();
		
		System.out.print("Ingrese la coordenada \"x\" del segundo rectangulo: ");
		x2 = input.nextInt();
		System.out.print("Ingrese la coordenada \"y\" del segundo rectangulo: ");
		y2 = input.nextInt();
		System.out.print("Ingrese el ancho del segundo rectangulo: ");
		w2 = input.nextInt();
		System.out.print("Ingrese el largo del segundo rectangulo: ");
		h2 = input.nextInt();
		
		input.close();
		
		if(((x1 + w1) > (x2 + w2)) && ((y1 + h1) > (y2 + h2)))
			System.out.println("\nEl rectangulo 2 esta dentro del rectangulo 1");
		
		else {
			for( int x = x2; x < (x2+w2) ; x++ ) {
				for( int y = y2; y < (y2+h2) ; y++ ) {
					if((x >= x1) && (x <= (x1+w1))) {
						if((y >= y1) && (y <= (y1+h1))) {
							flag = true;
							break;
						}
					}
				}
				if(flag)
					break;
			}
			
			if(flag)
				System.out.println("\nEl rectangulo 2 solapa al rectangulo 1");
			else
				System.out.println("\nLos rectangulos no están encimados");
		}
			

	}

}
