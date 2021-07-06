package br.com.generation.exercicios;
import java.util.*;
public class Exercicio3While {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
	        int idade = 0, menor = 0, maior = 0;
	        
	        while (idade != -99) {
	            System.out.println("Digite uma idade: ");
	            idade = ler.nextInt();

	            if(idade > 0 && idade <= 21) {
	                menor++;
	                System.out.println("Menos de 21!");
	            }
	                else if(idade > 50) {
	                    maior++;
	                    System.out.println("Mais de 50!");
	                }
	                else {
	                    System.out.println("Fora da contagem!");
	                }

	        }
	            System.out.println("Quantidade menores de 21 anos: " + menor);
	            System.out.println("Quantidade maiores de 50 anos: " + maior);
	    }

	}

