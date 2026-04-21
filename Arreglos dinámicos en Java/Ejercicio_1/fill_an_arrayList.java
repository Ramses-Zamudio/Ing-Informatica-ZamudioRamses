import java.util.ArrayList; // Importa la clase ArrayList

public class fill_an_arrayList {

	public static void main(String[] args) {
		
		// Se crea un ArrayList que almacenará cadenas (String)
		ArrayList<String> frutas = new ArrayList<>();
		
		// Se agregan elementos al ArrayList
		frutas.add("Manzana");
		frutas.add("Uva");
		frutas.add("Platano");
		frutas.add("Sandía");
		frutas.add("Naranja");
		
		// Se imprime la cantidad total de elementos usando size()
		System.out.println("Cantidad de frutas: " + frutas.size());
		
		// Se recorre el ArrayList usando un for-each
		// En cada vuelta, la variable "nombre" toma el valor de cada fruta
		for(String nombre : frutas) {
			System.out.println(nombre); // Se imprime cada fruta
		}

	}

}