package br.com.generation.exercicios;
import java.util.*;
public class Exercicio5Do {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);

        int numero, armazena = 0;

        do {
            System.out.print("Informe valor para a soma");
            
            numero = ler.nextInt();
            
            armazena += numero;
        }
        
        while(numero != 0);

        System.out.println("A soma dos números é: " + armazena);

        ler.close();

	}

}
