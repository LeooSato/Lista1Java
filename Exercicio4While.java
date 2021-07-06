package br.com.generation.exercicios;
import java.util.*;
public class Exercicio4While {
	
public static void main(String[] args) {
	
	
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);
	
	int counter = 0;
	
	int calmo = 0, nervosoM = 0, agressivoH = 0;
	int nervosoMais40 = 0, calmoMenos18 = 0, calmoO = 0;
	
	
	while(counter < 150) {
		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();
		
		System.out.printf("Digite 1 = Feminino \n2 = Masculino \n3 = Outros\n: ");
		int sexo = ler.nextInt();
		
		System.out.printf("Digite 1 Calmo \n2 Nervoso \n3 Agressivo\n: ");
		int personalidade = ler.nextInt();
		
		if(personalidade == 1) {
			calmo++;
				if(sexo == 3) {
					calmoO++;
				}
				
			if(idade < 18) {
				calmoMenos18++;
			}
			} else if(personalidade == 2) {
				
				if(sexo == 1) {
					nervosoM++;
				}
			
			if (idade > 40) {
				nervosoMais40++;
			}
		} else if(personalidade == 3) {
			if(sexo == 2) {
				agressivoH++;
			}
		}
		counter++;
	}
	System.out.println("Pessoas calmas: " + calmo);
	System.out.println("Mulheres nervosas: " + nervosoM);
	System.out.println("Homens agressivos: " + agressivoH);
	System.out.println("Outros calmos: " + calmoO);
	System.out.println("Nervosos mais que 40: " + nervosoMais40);
	System.out.println("Calmos menos de 18: " + calmoMenos18);
}
	
}

