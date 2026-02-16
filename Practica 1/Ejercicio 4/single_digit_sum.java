import java.util.Scanner;

public class single_digit_sum {

	public static void main(String[] args) {
int num1, num2, num3, sum;
		
		num1 = (int)(Math.random() *100 % 10);
		num2 = (int)(Math.random() *100 % 10);
		num3 = (int)(Math.random() *100 % 10);
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Suma "+num1+" + "+num2+" + "+num3+" = ");
		sum = input.nextInt();
		input.close();
		
		if( sum == (num1 + num2 + num3))
			System.out.print("\nCORRECTO!");
		
		else
			System.out.print("\nERROR!");

	}

}
