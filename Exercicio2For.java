package br.com.generation.exercicios;
import java.util.*;
public class Exercicio2For {
public static void main(String[] args) {
	

int Counter,a,Par = 0,Impar = 0;

Scanner ler = new Scanner(System.in);
	for(Counter = 0; Counter <10;Counter++) {
		
		System.out.println("Insira o Valor: ");
		
		a = ler.nextInt();
		
		if(a % 2 == 0) {
			Par = Par+1;
		}
		else {
			Impar = Impar+1;
		}
	}
	
	System.out.println("Quantos Pares: "+ Par);
	System.out.println("Quantos Impares: "+ Impar);
}
	
}
