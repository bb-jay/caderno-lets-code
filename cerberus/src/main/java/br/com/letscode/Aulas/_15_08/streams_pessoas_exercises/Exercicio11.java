package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.stream.Collectors;

public class Exercicio11 {

	/**
	 * Exercícios de streams
	 * 1 - Retornar a quantidade de pessoas em cada estado
	 *
	 */

	public static void main(String[] args) {
		
		
		BancoDeDados.pegaPessoas()
				.stream()
				.collect(Collectors.groupingBy(Pessoa::getUf))
				.forEach( (uf, lista) -> System.out.printf("%s: %d%n", uf, lista.size()) );;

	}

}
