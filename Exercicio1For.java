package br.com.generation.exercicios;

public class Exercicio1For {

	public static void main(String[] args) {
		int Counter;
		
		System.out.println("Os numeros desta equa��o s�o: ");
		
			for(Counter = 1000;Counter <=1999;Counter++) {
				if(Counter % 11 == 5) {
					System.out.println(Counter);
				}
			}

	}

}
