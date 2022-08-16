package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio6 {

	/**
	 * Exercícios de streams
	 * 1 - Imprimir a lista ordenada pelo nome das pessoas
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.sorted((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()))
				.forEach(System.out::println);
	}
}
