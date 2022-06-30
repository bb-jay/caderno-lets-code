package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a palavra:");
		String palavra = sc.nextLine();
		sc.close();

		char[] palavraAray = palavra.toCharArray();
		char[] invertidaArray = new char[palavraAray.length];

		for (int i = 1; i <= palavraAray.length; i++) {
			invertidaArray[palavraAray.length - i] = palavraAray[i - 1];
		}

		String invertida = String.valueOf(invertidaArray);

		System.out.println("Palavra invertida: " + invertida);

	}
}
