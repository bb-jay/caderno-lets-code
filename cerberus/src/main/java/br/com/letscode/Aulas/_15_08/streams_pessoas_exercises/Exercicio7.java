package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio7 {

	/**
	 * Exercícios de streams
	 * 1 - Filtrar as pessoas que tem filhos
	 * 2 - Encontrar a média da idade das pessoas
	 * 3 - Imprimir o valor médio da idade
	 *
	 * Atenção oa tratamento do optional.
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.filter(Pessoa::isTemFilhos)
				.mapToInt(Pessoa::getIdade)
				.average()
				.ifPresent(System.out::println);
	}

}
