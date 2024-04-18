package app;

import Util.Algoritmos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numero = 10; 
		 
	        Algoritmos algoritmo  = new Algoritmos() {
			};
			
			//LLAmando la funcionFibbonacci
	        algoritmo.fibonacci(numero);
	        
	        //LLamando la finccion factorial
	        
	        algoritmo.factorial(numero);

	        
	        
	        System.out.println(algoritmo.esPrimo(numero));
	}

}
 