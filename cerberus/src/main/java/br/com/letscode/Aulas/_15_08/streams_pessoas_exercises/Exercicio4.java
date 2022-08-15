package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio4 {

	/**
	 * Exercícios de streams
	 * Contar as pessoas que possuam filhos
	 *
	 */

	public static void main(String[] args) {
		System.out.println(BancoDeDados.pegaPessoas()
				.stream()
				.filter(Pessoa::isTemFilhos)
				.count());
	}

}
