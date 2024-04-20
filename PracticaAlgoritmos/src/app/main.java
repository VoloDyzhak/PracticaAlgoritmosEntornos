package app;

/**
 * @author VolodymyrDyzhak
 */

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;
import Util.Algoritmos;

public class main {
	

	public static void main(String[] args) {
		/**
		 * inicializamos el array y el bojeto de la clase Abstracta Objetos
		 * 
		 */
		int[] numeros = new int[10];
		Algoritmos algoritmo = new Algoritmos() {};

		/**
		 * con un bucle for recorremos y rellenamos array con la ayuda de la clase
		 * Random
		 */
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(6);

		}
		/**
		 * bucle for para recorrer el array de numeros y llamar la funcion Fiboncci
		 * 
		 */
		
		for (int i = 0; i < numeros.length; i++) {

			algoritmo.fibonacci(numeros[i]);
			/**
			 * @see # Algoritmo fibonacci
			 */
		}

		/**
		 * bucle for para recorrer el array de numeros y llamar la funcion Factorial
		 * 
		 */

		for (int i = 0; i < numeros.length; i++) {
			
			algoritmo.factorial(numeros[i]);
			/**
			 * @see # Algoritmo factorial
			 */

		}
		/**
		 * bucle for para recorrer el array de numeros y llamar la funcion esPrimo
		 * 
		 */
		for (int i = 0; i < numeros.length; i++) {

			algoritmo.esPrimo(numeros[i]);
			/**
			 * @see # Algoritmo esPrimo
			 */
		}
		

	}

}
