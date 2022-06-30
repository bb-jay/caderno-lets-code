package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		System.out.println("Escreva 5 números:");

		for (int i = 0; i < 5; i++) {
			numeros[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Ímpares:");

		for (int numero: numeros) {
			if (numero % 2 == 0) continue;
			System.out.print(numero + " ");
		}

		System.out.println("Pares:");

		for (int numero: numeros) {
			if (numero % 2 != 0) continue;
			System.out.print(numero + " ");
		}
	}
}
