import java.util.ArrayList;

public class PruebaLista {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(); // El tipo de dato se define al momento de
        										   // declarar el ArrayList

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        System.out.println("Elemento en posición 3: " + lista.get(2)); // Como la posición inicia en
        															// el indice 3 no existe, solo llega hasta 2

        for (int i = 0; i < lista.size(); i++) { // debe ser i < lista.size() no <=
            System.out.println(lista.get(i));
        }

        lista.remove(2); // se debe poner el indice numerico del string
        						// y no existe el indice 4

        System.out.println("Tamaño final: " + lista.size()); // el metodo para arreglos dinámicos es size no lenght
    }
}