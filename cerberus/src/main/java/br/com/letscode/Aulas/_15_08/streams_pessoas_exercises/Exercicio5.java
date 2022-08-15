package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio5 {

	/**
	 * Exercícios de streams
	 * 1 - Verificar se existem pessoas sem filhos e com a quantidade de filhos > 0
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.filter(pessoa -> !pessoa.isTemFilhos() && pessoa.getFilhos() > 0)
				.forEach(pessoa -> System.out.printf("DEU RUIM, %s está inconsistente%n", pessoa.getNome()));
	}
}
