package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio2 {

	/**
	 * Exercícios de streams
	 * Imprimir o nome das pessoas
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.map(Pessoa::getNome)
				.forEach(System.out::println);
	}

}
