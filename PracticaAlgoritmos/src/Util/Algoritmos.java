package Util;

public abstract class Algoritmos {
 private int numero;
 
 public void fibonacci(int numero) {
	    int a = 0;
	    int b = 1;


	    for (int i = 2; i < numero; i++) {
	        int siguiente = a + b;
	      
	        a = b;
	        b = siguiente;
	    }
	  
	}
 public void factorial(int num) {
 int resultado = 1;
     for (int i = 1; i <= num; i++) {
         resultado *= i;
     }
     System.out.println("El factorial de " + num + " es: " + resultado);
 }
	 
 
 
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
