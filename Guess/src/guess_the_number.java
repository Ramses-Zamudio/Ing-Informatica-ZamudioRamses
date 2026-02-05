import java.util.Scanner;
public class guess_the_number {

	public static void main(String[] args) {
		
		int number, guess;
		
		System.out.println("Guess the number between 0-99...");
	
		number = (int)(Math.random() * 1000 % 100);
		//System.out.println(number);
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.print("Your number is: ");
			guess = input.nextInt();
			
			if(guess < number) {
				System.out.println("Your guess is lower than the number");
			}
			else if(guess > number){
				System.out.println("Your guess is greater than the number");
			}
				
		}while(guess != number);
		input.close();
		System.out.println("You guess the correct number");

	}

}
