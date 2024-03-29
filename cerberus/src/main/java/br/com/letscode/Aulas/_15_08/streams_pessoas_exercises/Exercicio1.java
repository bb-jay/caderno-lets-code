package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio1 {

	/**
	 * Exercícios de streams
	 * Imprimir a lista de pessoas
	 *
	 * Utilize a classe BancoDeDados e o método statico
	 * "pegaPessoas()" para retornar a lista com as pessoas.
	 *
	 * ex: BancoDeDados.pegaPessoas()
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.forEach(System.out::println);

	}

}
