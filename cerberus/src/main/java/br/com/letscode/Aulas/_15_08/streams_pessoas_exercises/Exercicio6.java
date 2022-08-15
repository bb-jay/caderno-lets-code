package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.Comparator;

public class Exercicio6 {

	/**
	 * Exercícios de streams
	 * 1 - Imprimir a lista ordenada pelo nome das pessoas
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.sorted(Comparator.comparing((Pessoa pessoa) -> pessoa.getNome().toUpperCase()))
				.forEach(System.out::println);
	}
}
