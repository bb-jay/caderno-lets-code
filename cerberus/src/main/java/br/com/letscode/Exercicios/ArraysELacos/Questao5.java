package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[5];
		System.out.println("Escreva os nomes dos 5 convidados:");

		for (int i = 0; i < 5; i++) {
			nomes[i] = sc.nextLine();
		}
		sc.close();
		
		String maisLongo = nomes[0];

		for (String nome: nomes) {
			if (nome.length() > maisLongo.length()) maisLongo = nome;
		}

		System.out.println();
		System.out.println("Nome mais longo: " + maisLongo);
	}
}
