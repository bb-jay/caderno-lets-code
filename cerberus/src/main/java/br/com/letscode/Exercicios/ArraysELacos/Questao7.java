package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[5];
		
		for (int i = 0; i < pessoas.length; i++) {
			
			Pessoa daVez = new Pessoa(); 
			
			System.out.print("Escreva o nome da pessoa " + (i+1) + ": ");
			daVez.nome = sc.nextLine();

			System.out.print("Escreva a idade da pessoa " + (i+1) + ": ");
			daVez.idade = Integer.parseInt(sc.nextLine());

			pessoas[i] = daVez;
		}
		sc.close();

		Pessoa maisNova = pessoas[0];
		Pessoa maisVelha = pessoas[0];
		double media = 0;

		for (Pessoa pessoa: pessoas) {
			if (pessoa.idade > maisVelha.idade) maisVelha = pessoa;
			else if (pessoa.idade < maisNova.idade) maisNova = pessoa;
			media += pessoa.idade;
		}
		media = media / pessoas.length;

		System.out.println();
		System.out.println("Pessoa mais velha: " + maisVelha);
		System.out.println("Pessoa mais nova: " + maisNova);
		System.out.println("Média entre mais velha e mais nova: " + (maisVelha.idade + maisNova.idade) / 2.0);
		System.out.println("Média entre todos: " + media);
	}

	private static class Pessoa {
		public int idade;
		public String nome;

		@Override
		public String toString() {
			return this.nome + ", " + this.idade + " anos";
		}
	}
}

