package br.com.letscode.Exercicios.ArraysELacos;

import java.util.Scanner;

public class Questao8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 0; i < pessoas.length; i++) {
			
			Pessoa daVez = new Pessoa(); 
			
			System.out.print("Escreva o nome da pessoa " + (i+1) + ": ");
			daVez.nome = sc.nextLine();

			System.out.print("Escreva a altura da pessoa " + (i+1) + ": ");
			daVez.altura = Double.parseDouble(sc.nextLine());
			
			System.out.print("Escreva o peso da pessoa " + (i+1) + ": ");
			daVez.peso = Double.parseDouble(sc.nextLine());

			pessoas[i] = daVez;
		}
		sc.close();	

		System.out.println();
		
		boolean tudoCerto = true;
		for (Pessoa pessoa: pessoas) {
			if (pessoa.imc() > 25) {
				System.out.println(pessoa.nome + " está com IMC acima do ideal: " + pessoa.imc());
				tudoCerto = false;
			}
			else if (pessoa.imc() < 18.5) {
				System.out.println(pessoa.nome + " está com IMC abaixo do ideal: " + pessoa.imc());
				tudoCerto = false;
			}
		}
		if (tudoCerto) System.out.println("Todo mundo com IMC ideal!");
	}
	
	private static class Pessoa {
		double peso;
		double altura;
		String nome;
		double imc() {
			return peso / (altura * altura);
		}
	}
}
