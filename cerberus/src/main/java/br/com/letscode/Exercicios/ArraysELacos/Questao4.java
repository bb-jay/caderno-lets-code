package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		System.out.println("Escreva 5 números:");

		for (int i = 0; i < 5; i++) {
			numeros[i] = sc.nextInt();
		}
		sc.close();

		int menor = numeros[0];
		int maior = numeros[0];
		double media  = 0;

		for (int numero: numeros) {
			if (numero > maior) maior = numero;
			else if (numero < menor) menor = numero;
			media += numero;
		}

		media = media / numeros.length;
		
		System.out.println();
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média entre o maior e o menor: " + (maior + menor) / 2.0);
		System.out.println("Média de todo mundo: " + media);
	}
}
