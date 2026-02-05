import java.util.Scanner;

public class inchtocm {
	
	static final int FEET_TO_INCH = 12;
	static final double INCH_TO_CM = 2.54;

	public static void main(String[] args) {
		int feet, inch, total_inches;
		double cm;
		
		System.out.println("Introduce feets: ");
		Scanner input = new Scanner(System.in);
		feet = input.nextInt();
		
		System.out.println("Introduce inches: ");
		inch = input.nextInt();
		
		total_inches = (FEET_TO_INCH * feet) + inch;
		cm = INCH_TO_CM * total_inches;
		
		System.out.println("Total centemeters: "+cm);
		input.close();
		
	}

}
