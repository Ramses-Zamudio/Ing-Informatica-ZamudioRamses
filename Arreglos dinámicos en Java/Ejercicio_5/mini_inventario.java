import java.util.ArrayList;   // Permite usar listas dinámicas
import java.util.Collections; // Permite ordenar colecciones
import java.util.Scanner;     // Permite leer datos del usuario

public class mini_inventario {

	public static void main(String[] args) {
		
		// Lista dinámica donde se almacenarán los productos
		ArrayList<String> obj = new ArrayList<>();
		
		// Variable temporal para guardar el nombre ingresado
		String temp;
		
		// Variable para guardar la opción del menú
		int option;
		
		// Bandera que controla la ejecución del menú
		boolean flag = true;
		
		// Objeto Scanner para leer datos desde teclado
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("¡Bienvenido al Inventario!");
		
		// Ciclo principal que se ejecuta hasta que el usuario elija salir
		while(flag) {
			
			// Menú de opciones
			System.out.println("\n1) Agregar producto.");
			System.out.println("2) Eliminar producto.");
			System.out.println("3) Mostrar producto.");
			System.out.println("4) Salir del almacen.");
			System.out.print("\nIngrese la acción que quiera realizar: ");
			
			// Se lee la opción seleccionada
			option = input.nextInt();
			
			switch(option) {
			
			case 1: 
				// AGREGAR PRODUCTO
				System.out.print("\nIngrese el nombre del nuevo producto: ");
				
				// next() lee solo hasta el primer espacio
				temp = input.next();
				
				// Se agrega el producto a la lista
				obj.add(temp);
				
				// Se ordena la lista alfabéticamente
				Collections.sort(obj);
				break;
				
			case 2:
				// ELIMINAR PRODUCTO
				System.out.print("\nIngrese el nombre del producto a eliminar: ");
				temp = input.next();
				
				/*
				 remove(Object o) elimina directamente el elemento
				 que coincida con el contenido del String.
				 Internamente usa equals() para comparar.
				 Si el producto no existe, no ocurre ningún error.
				*/
				obj.remove(temp);
				break;
				
			case 3:
				// MOSTRAR PRODUCTOS
				System.out.print("\n");
				
				// Se recorre la lista mostrando cada producto numerado
				for(int i=0; i < obj.size(); i++) {
					System.out.println((i+1)+") "+obj.get(i));
				}
				
				// Se muestra la cantidad total de productos almacenados
				System.out.println("\nHay \""+obj.size()+"\" productos.");
				break;
				
			case 4: 
				// SALIR DEL PROGRAMA
				System.out.println("\nAdios!!");
				flag = false; // Se cambia la bandera para terminar el ciclo
				break;
				
			default:
				// Opción inválida
				System.out.println("\nOpción Invalida!!");
			}
		}
		
		// Se cierra el Scanner para liberar recursos
		input.close();
	}
}