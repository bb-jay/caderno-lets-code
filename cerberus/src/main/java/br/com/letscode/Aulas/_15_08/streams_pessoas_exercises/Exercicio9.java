package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio9 {

	/**
	 * Exercícios de streams
	 * 1 - retornar uma lista com nome das três pessoas mais velhas
	 * 2 - Imprimir a lista
	 *
	 */

	public static void main(String[] args) {
		List<Pessoa> lista = BancoDeDados.pegaPessoas()
				.stream()
				.sorted(Comparator.comparingInt(Pessoa::getIdade).reversed())
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(lista);
	}

}
