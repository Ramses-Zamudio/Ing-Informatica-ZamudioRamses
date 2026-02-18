import java.util.ArrayList; // Importa la clase ArrayList

public class modify_and_delete {

	public static void main(String[] args) {
		
		// Se crea un ArrayList que almacenará números enteros
		ArrayList<Integer> intlist = new ArrayList<>();
		
		// Se llena la lista con números del 1 al 10
		for(int i = 1; i < 11; i++) {
			intlist.add(i); // Agrega cada número a la lista
		}
		
		// set(indice, valor) modifica un elemento en una posición específica
		// Aquí cambia el valor en la posición 4 por 100
		intlist.set(4,100);
		
		// remove(indice) elimina el elemento en esa posición
		// Aquí elimina el elemento en la posición 1
		intlist.remove(1);
		
		// Se recorre la lista para imprimir los valores finales
		for(int num : intlist) {
			System.out.println(num);
		}
		
	}

}