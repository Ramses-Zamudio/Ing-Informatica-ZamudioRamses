import java.util.Scanner;

public class rolling {

	public static void main(String[] args) {
		
		int valor; // suma deseada de los valores 
		int n_roll;
		boolean flag = true;
		Scanner input;
		
		input = new Scanner(System.in);
		do {
			System.out.print("Ingresar suma deseada (en un rango entre 2-12): ");
			valor = input.nextInt();
			if(valor >= 2 && valor <= 12)
				flag = false;
			else
				System.out.println("El valor no está dentro del rango");
		}while(flag);
		n_roll = rollDice(valor);
		System.out.println("El numero de veces fue: " + n_roll);
		
		input.close();

	}
	
	public static int rollDice(int sumad) {
		int die1, die2;
		int i = 0;
		
		do {
			die1 = (int)(Math.random() * 100 % 6 + 1);
			die2 = (int)(Math.random() * 100 % 6 + 1);
			i++;
		}while((die1 + die2) != sumad);
		return i;
			
	}

}
