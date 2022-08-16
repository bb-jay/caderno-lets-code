package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio14 {

	/**
	 * Exercícios de streams
	 * 1 - Extrair uma lista dos estados existentes no banco de dados.
	 * 2 - Imprimir a lista na mesma stream
	 * 3 - Ordernar a lista por orderm alfabetica
	 *
	 */

	public static void main(String[] args) {
		List<UF> listaUf = BancoDeDados.pegaPessoas()
				.stream()
				.map(Pessoa::getUf)
				.distinct()
				.peek(System.out::println)
				.sorted((uf1, uf2) -> uf1.name().compareToIgnoreCase(uf2.name()))
				.collect(Collectors.toList());
		System.out.println(listaUf);
	}

}
