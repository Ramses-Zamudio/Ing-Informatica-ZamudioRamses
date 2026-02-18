import java.util.ArrayList; // Importa ArrayList
import java.util.Scanner;   // Importa Scanner para leer datos

public class students_system {

	public static void main(String[] args) {
		
		// Lista para almacenar nombres de estudiantes
		ArrayList<String> estudiantes = new ArrayList<>();
		
		String temp;      // Variable temporal para guardar nombres
		int choose, i;    // choose: número que el usuario quiere eliminar
		boolean flag;     // Variable para saber si un estudiante existe
		
		// Se crea el objeto Scanner para leer desde teclado
		Scanner input;
		input = new Scanner(System.in);
		
		// Se piden 3 nombres al usuario
		for(i = 1; i < 4; i++) {
			System.out.println("Ingresa el nombre del estudiante "+i+": ");
			temp = input.next();      // Lee el nombre
			estudiantes.add(temp);   // Lo agrega a la lista
		}
		
		// Se muestran todos los estudiantes guardados
		for(i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante "+(i+1)+": "+estudiantes.get(i));
		}
		
		// Se pide el número del estudiante a eliminar
		System.out.print("\nIngresa el número de estudiante que quieres eliminar:");
		choose = input.nextInt();
		
		// Se elimina el estudiante (se resta 1 porque el índice empieza en 0)
		estudiantes.remove(choose - 1);
		
		// Se muestran nuevamente los estudiantes actualizados
		for(i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante "+(i+1)+": "+estudiantes.get(i));
		}
		
		// Se pide un nombre para buscarlo en la lista
		System.out.print("\nIngresa el nombre de un estudiante: ");
		temp = input.next();
		
		input.close(); // Se cierra el Scanner
		
		// contains() verifica si el nombre existe en la lista
		flag = estudiantes.contains(temp);
		
		// Se imprime el resultado de la búsqueda
		if(flag)
			System.out.println("\nEstudiante encontrado");
		else
			System.out.println("\nEstudiante no encontrado");
	}

}