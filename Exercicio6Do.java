package br.com.generation.exercicios;
import java.util.*;
public class Exercicio6Do {
	
public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int x = 1, soma = 0, qtd = 0;
		
		do {
			System.out.println("Digite Valor: ");
			x = ler.nextInt();
			
			if(x % 3 == 0 && x != 0) {
				qtd++;
				soma += x;
			}
		}
		while(x != 0);
		
		System.out.println("Media Multiplo de 3: " + soma / qtd);
}
}
