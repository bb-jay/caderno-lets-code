package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio10 {

	/**
	 * Exercícios de streams
	 * 1 - Retornar as pessoas agregadas por estado
	 *
	 */

	public static void main(String[] args) {
		Map<UF, List<Pessoa>> pessoasPorEstado = BancoDeDados.pegaPessoas()
				.stream()
				.collect(Collectors.groupingBy(Pessoa::getUf));

		System.out.println(pessoasPorEstado);
	}

}
