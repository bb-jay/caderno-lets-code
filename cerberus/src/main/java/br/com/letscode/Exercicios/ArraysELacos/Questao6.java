package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome:");
		String nome = sc.nextLine();
		sc.close();

		char[] nomeArray = nome.toLowerCase().toCharArray();
		char[] nomeMaiusculo = nome.toUpperCase().toCharArray();

		for (int i = 0; i < nomeArray.length; i++) {
			if (i % 2 != 0) {
				nomeArray[i] = nomeMaiusculo[i];
			}
		}

		nome = String.valueOf(nomeArray);

		System.out.println("NoMe aVaCaLhAdO: " + nome);
	}
}
