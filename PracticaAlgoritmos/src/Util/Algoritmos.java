package Util;

/**
 * Clase abstracta de Algoritmo
 * 
 * @version 1.01
 */
public abstract class Algoritmos {
	private int numero;

	/**
	 * Funcion fibonacci Los primeros números de la serie, cuyo índice empieza en 0,
	 * son 0 y 1. partir del segundo índice de la serie, para calcular el número de
	 * la posición n, sumamos los dos anteriores. Por ejemplo, el fibonacci de 2 se
	 * obtiene de sumar 0 y 1, que son los dos valores anteriores de la serie
	 * 
	 * @param numero
	 */
	public void fibonacci(int numero) {
		int a = 0;
		int b = 1;

		for (int i = 2; i < numero; i++) {
			int siguiente = a + b;
			
			a = b;
			b = siguiente;
		}
		 System.out.println("Fibonacci  seciencia " + numero + " " + a + " " + b );
	}
		    

	/**
	 * 
	 * Factorial El factorial de un número se obtiene multiplicando todos los
	 * números desde 1 hasta el valor del mismo número. Por ejemplo, el factorial de
	 * 3 se calcula multiplicando 1x2x3, que es 6.
	 * 
	 * @param num
	 */

	public void factorial(int num) {
		int resultado = 1;
		for (int i = 1; i <= num; i++) {
			resultado *= i;
		}
		
	}

	/**
	 * Número primo Un número es primo cuando sólo es divisible por sí mismo y por
	 * 1. Un número es divisible por otro cuando al dividir el primero por el
	 * segundo el resto es cero
	 * 
	 * @param numero
	 * @return
	 */

	public boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;

	}

}
