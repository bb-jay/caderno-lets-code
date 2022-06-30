package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Adicione 5 frutas no carrinho:");
		String[] frutas = new String[5];
		
		for (int i = 0; i < 5; i++) {
			frutas[i] = sc.nextLine();
		}
		sc.close();
		
		System.out.println();

		System.out.println("Seu carrinho:");
		for (String fruta: frutas) {
			System.out.print(fruta + " ");
		}
		
	}
}
