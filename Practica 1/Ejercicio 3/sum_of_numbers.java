import java.util.Scanner;

public class sum_of_numbers {

	public static void main(String[] args) {
		
		int num1, num2, sum;
		
		num1 = (int)(Math.random() *100 % 100);
		num2 = (int)(Math.random() *100 % 100);
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Suma "+num1+" + "+num2+" = ");
		sum = input.nextInt();
		input.close();
		
		if( sum == (num1 + num2))
			System.out.print("\nCORRECTO!");
		else
			System.out.print("\nERROR!");
	}
}