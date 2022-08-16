package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio13 {

	/**
	 * Exercícios de streams
	 * 1 - Retornar o estado com mais filhos
	 * 2 - Imprimir a seguinte mensagem, interpolando as chaves pelos resultados
	 * encontrados
	 * "O estado com mais filhos é: [NOME_DO_ESTADO] o total de filhos são:
	 * [TOTAL_DE_FILHOS]
	 */

	public static void main(String[] args) {

		BancoDeDados.pegaPessoas()
				.stream()
				.collect(Collectors.groupingBy(Pessoa::getUf))
				.entrySet()
				.stream()
				.map(entry -> Map.entry(entry.getKey(), entry.getValue()
						.stream()
						.mapToInt(Pessoa::getFilhos)
						.sum()))
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.findFirst()
				.ifPresent(entry -> System.out.printf("O estado com mais filhos é: %s. O total de filhos são: %d",
						entry.getKey(), entry.getValue()));

	}

}
